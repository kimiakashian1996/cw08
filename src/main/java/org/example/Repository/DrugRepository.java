package org.example.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DrugRepository {
    private final Connection connection;

    public DrugRepository(Connection connection) {
        this.connection = connection;
    }
    public boolean addDrug (Drug drug) throws SQLException {
        String addDrug = "INSERT INTO drug (name,price,inventory) VALUES (?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addDrug);
        preparedStatement.setString(1,drug.getDrugName());
        preparedStatement.setInt(2,drug.getPrice());
        preparedStatement.setInt(3,drug.getInventory());
        return preparedStatement.execute();
    }
}
