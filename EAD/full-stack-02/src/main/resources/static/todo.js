var STORAGE_KEY = 'todo-vuejs-2.0'
var todoStorage = {
    fetch: function () {
        return JSON.parse(localStorage.getItem(STORAGE_KEY) || '[]')
    },
    sync: function (todos) {
        axios
            .post('/api/v1/todos', todos)
            .then(response => (todoStorage.save(response.data)))
            .catch(error => console.log(error))
    },
    save: function (todos) {
        console.log(todos)
        localStorage.setItem(STORAGE_KEY, JSON.stringify(todos))
    }
}

var filters = {
    all: function (todos) {
        return todos
    },
    active: function (todos) {
        return todos.filter(function (todo) {
            return !todo.complete
        })
    },
    complete: function (todos) {
        return todos.filter(function (todo) {
            return todo.complete
        })
    }
}

var app = new Vue({
    data () {
        return {
            todos: todoStorage.fetch(),
            newTodo: '',
            editedTodo: null,
            visibility: 'all'
        }
    },
    watch: {
        todos: {
            handler: function (todos) {
                todoStorage.sync(todos)
            },
            deep: true
        }
    },
    computed: {
        filteredTodos: function () {
            return filters[this.visibility](this.todos)
        },
        remaining: function () {
            return filters.active(this.todos).length
        },
        allDone: {
            get: function () {
                return this.remaining == 0
            },
            set: function (value) {
                this.todos.forEach(function (todo) {
                    todo.complete = value
                })
            }
        }
    },
    filters: {
        pluralize: function (n) {
            return n === 1 ? 'item' : 'items'
        }
    },
    mounted() {
        axios
            .get('/api/v1/todos')
            .then(reponse => (todoStorage.save(reponse.data)))
            .catch(error => console.log(error))
    },
    methods: {
        addTodo: function () {
            var value = this.newTodo && this.newTodo.trim()
            if(!value){
                return
            }
            this.todos.push({
                title: value,
                complete: false
            })
            this.newTodo = ''
        },
        removeTodo: function (todo) {
            this.todos.splice(this.todos.indexOf(todo), 1)
        },
        editTodo: function (todo) {
            this.beforeEditCache = todo.title
            this.editedTodo = todo
        },
        doneEdit: function (todo) {
            if(!this.editedTodo){
                return
            }
            this.editedTodo = null
            todo.title = todo.title.trim()
            if(!todo.title) {
                this.removeTodo(todo)
            }
        },
        cancelEdit: function (todo) {
            this.editedTodo = null
            todo.title = this.beforeEditCache
        },
        removeCompleted: function () {
            this.todos = filters.active(this.todos)
        }
    },
    directives: {
        'todo-focus': function (el, binding){
            if(binding.value) {
                el.focus()
            }
        }
    }
})

function onHashChange() {
    var visibility = window.location.hash.replace(/#\/?/, '')
    if (filters[visibility]) {
        app.visibility = visibility
    } else {
        window.location.hash = ''
        app.visibility = 'all'
    }
}

window.addEventListener('hashchange', onHashChange)
onHashChange()

app.$mount('.todoapp')