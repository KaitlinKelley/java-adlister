package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username LIKE ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()){
                return null;
            }
            return new User(
                    rs.getLong("id"),
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("password")
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error running findByUsername", e);
        }

    }



    public Long insert(User user) {
        try {
            PreparedStatement stmt = createInsertQuery(user);
            stmt.setLong(1, user.getId());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());

            stmt.executeUpdate();
            ResultSet idResultSet = stmt.getGeneratedKeys();

            idResultSet.next();
            return idResultSet.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }

    public String getPassword(User user){
        try{
            PreparedStatement stmt = createFindPasswordQuery(user);
            stmt.setString(1, user.getPassword());
            stmt.executeQuery();
            ResultSet passwordResultSet = stmt.getResultSet();
            passwordResultSet.next();
            return passwordResultSet.getString(1);

        }catch (SQLException e) {
            throw new RuntimeException("Error at getPassword", e);
        }
    }


    private PreparedStatement createInsertQuery(User user) {
        String sql = "INSERT INTO users(id, username, email, password) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            throw new RuntimeException("Error at createInsertQuery", e);
        }
        return stmt;
    }

    private PreparedStatement createFindPasswordQuery(User user){
        String sql = "SELECT password FROM users WHERE password = ?";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            throw new RuntimeException("Error at createFindPasswordQuery", e);
        }
        return stmt;
    }
}
