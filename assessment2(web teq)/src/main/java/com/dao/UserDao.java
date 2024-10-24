package com.dao;

import com.bean.User;
import com.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    public boolean registerUser(User user) {
        String query = "INSERT INTO students (first_name, last_name, email, mobile, address, gender, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
             
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getMobile());
            preparedStatement.setString(5, user.getAddress());
            preparedStatement.setString(6, user.getGender());
            preparedStatement.setString(7, user.getPassword());
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEmailRegistered(String email) {
        String query = "SELECT * FROM students WHERE email = ?";
        try (Connection connection = DatabaseConnection.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
             
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next(); // If there's a result, email exists
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public User validateUser(String email, String password) {
        String query = "SELECT * FROM students WHERE email = ? AND password = ?";
        try (Connection connection = DatabaseConnection.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
             
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("user_id"));
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setEmail(resultSet.getString("email"));
                user.setMobile(resultSet.getString("mobile"));
                user.setAddress(resultSet.getString("address"));
                user.setGender(resultSet.getString("gender"));
                user.setPassword(resultSet.getString("password")); // Consider not exposing the password
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Invalid email/password
    }

    public boolean updatePassword(String email, String newPassword) {
        String query = "UPDATE students SET password = ? WHERE email = ?";
        try (Connection connection = DatabaseConnection.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
             
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, email);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
