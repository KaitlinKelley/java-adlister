//package com.codeup.adlister.dao;
//
//import com.codeup.adlister.models.User;
//import com.mysql.cj.jdbc.Driver;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class MySQLUsersDao implements Users{
//
//    private Connection connection = null;
//
//    public MySQLUsersDao(Config config) {
//        try {
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUser(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the database!", e);
//        }
//    }
//
////    User findByUsername(String username){
////        return username;
////    }
//
//
////    Long insert(User user){
////
////    }
//}
