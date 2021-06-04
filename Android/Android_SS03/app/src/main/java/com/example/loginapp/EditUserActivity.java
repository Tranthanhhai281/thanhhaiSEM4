package com.example.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class EditUserActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnDone;
    private EditText editUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);
        editUser = (EditText) findViewById(R.id.edUser);
        btnDone = (Button) findViewById(R.id.btnDone);
        btnDone.setOnClickListener(this);
        Intent intent = getIntent();
        String username = intent.getStringExtra("USER_NAME");
        editUser.setText(username);


    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnDone:
                    onDone();
                    break;
                default:
                    break;
            }
    }

    private void onDone(){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("RESULT",editUser.getText().toString());
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
