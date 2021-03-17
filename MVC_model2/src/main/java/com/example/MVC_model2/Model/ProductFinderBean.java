package com.example.MVC_model2.Model;

import com.example.MVC_model2.da.ProductDataAccess;
import com.example.MVC_model2.entity.Product;

import java.sql.SQLException;
import java.util.List;


public class ProductFinderBean {
    private String keyword;

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Product> getProductByName() throws SQLException, ClassNotFoundException {
        //ProductDataAccess productDataAccess = new ProductDataAccess();
        //productDataAccess.getProductsByName("nokia");
        return new ProductDataAccess().getProductsByName(keyword);
    }

    public Product getProductById() {
        return null;
    }

    public List<Product> getProductByDesc() {
        return null;
    }

    public List<Product> getAllProducts() {
        return null;
    }
}
