package org.example.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private static final Connection CONNECTION;

    static {
        try {
           CONNECTION  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","maede.123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public JdbcConnection() throws SQLException {
    }

    public static Connection getConnection() {
        return CONNECTION;
    }

}
