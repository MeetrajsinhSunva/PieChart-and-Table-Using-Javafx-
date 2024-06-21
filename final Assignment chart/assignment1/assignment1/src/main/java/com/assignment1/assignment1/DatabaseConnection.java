package com.assignment1.assignment1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;



public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3308/assignment1";


    private static final String USER = "root";
    private static final String pass = "admin";


    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, pass);
        }

        catch (SQLException e) {
            throw new RuntimeException("Error connecting to database", e);
        }
    }


    public static ObservableList<Data> getData() {
        DatabaseConnection dbconnector = new DatabaseConnection();
        Connection connection = dbconnector.connect();
        ObservableList<Data> list = FXCollections.observableArrayList();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =statement.executeQuery("SELECT * FROM data");

            while(resultSet.next()) {
                list.add(new Data(Integer.parseInt(resultSet.getString("index")), resultSet.getString("language"), Integer.parseInt(resultSet.getString("percentage"))));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
