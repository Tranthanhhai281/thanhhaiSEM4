package com.example.MVC_model2.da;

import com.example.MVC_model2.entity.Product;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ProductDataAccess {
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public PreparedStatement getSearchStatement() throws SQLException, ClassNotFoundException {
        if (preparedStatement == null) {
            //3. Call connection
            Connection connection = new DBConnection().getConnection();
            //4. Create Statement
            preparedStatement =
                    connection.prepareStatement("SELECT id,pro_name,pro_desc FROM product WHERE pro_name LIKE ?");
        }
        return preparedStatement;


    }

    public List<Product> getProductsByName(String name) throws SQLException, ClassNotFoundException {
        PreparedStatement statement = getSearchStatement();
        //5. Call Result
        statement.setString(1, "%" + name + "%");
        ResultSet resultSet = statement.executeQuery();
        List<Product> products = new LinkedList<>();
        while (resultSet.next()) {
            products.add(new Product(
                    resultSet.getInt("id")
                    , resultSet.getString("pro_name")
                    , resultSet.getString("pro_desc")));
        }
        return products;
    }

    public List<Product> getProductsByDesc(String name) throws SQLException, ClassNotFoundException {
        return null;
    }

    public List<Product> getProductsByID(String name) throws SQLException, ClassNotFoundException {
        return null;
    }

}
