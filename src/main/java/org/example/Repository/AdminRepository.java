package org.example.Repository;

import org.example.Model.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminRepository {
    private final Connection connection;

    public AdminRepository(Connection connection) {
        this.connection = connection;
    }
    public boolean addAdmin (Admin admin) throws SQLException {
        String addAdminQuery = "INSERT INTO admin (name, username, password) VALUES (?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addAdminQuery);
        preparedStatement.setString(1, admin.getName());
        preparedStatement.setString(2, admin.getUserName());
        preparedStatement.setString(3, admin.getPassword());
        return preparedStatement.execute();
    }
}
