package org.example.Repository;

import org.example.Model.Drug;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DrugRepository {
    Drug[] drugs;
    private final Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public DrugRepository(Connection connection) {
        this.connection = connection;
    }

    public int getDrugList(int[] drugs) throws Exception {
        String str = "insert into drug_list values (DEFAULT,?,?,?,?,?);";
        preparedStatement = connection.prepareStatement(str, PreparedStatement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, drugs[0]);
        preparedStatement.setInt(2, drugs[1]);
        preparedStatement.setInt(3, drugs[2]);
        preparedStatement.setInt(4, drugs[3]);
        preparedStatement.setInt(5, drugs[4]);
        resultSet = preparedStatement.getGeneratedKeys();
        if (resultSet.next()) {
            int drugListID = resultSet.getInt("id");
            return drugListID;
        }
        return 0;
    }

    public boolean showDrugList() throws Exception {
        String str = "select * from drug";
        preparedStatement = connection.prepareStatement(str);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.print("ID: " + resultSet.getInt("id") + "\t");
            System.out.print("NAME: " + resultSet.getString("name") + "\t");
            System.out.print("PRICE: " + resultSet.getInt("price") + "\t");
            System.out.println("INVENTORY: " + resultSet.getInt("inventory"));
        }
        return true;
    }

//    public Drug findByID(int i) throws Exception {
//        Drug drug;
//        String str = "select name from drug where id=?;";
//        preparedStatement = connection.prepareStatement(str);
//        preparedStatement.setInt(1, i);
//        resultSet = preparedStatement.executeQuery();
//        try {
//            drug = Drug.valueOf(resultSet.getString("name"));
//        } catch (Exception exception) {
//            System.out.println("Mn terekidam");
//        }
//        return Drug.CALCIUM;
//    }

    public Drug findByID(int i) throws Exception {
        Drug drug = null;
        String str = "select name from drug where id=?;";
        preparedStatement = connection.prepareStatement(str);
        preparedStatement.setInt(1, i);
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String drugName = resultSet.getString("name");
            drug = Drug.valueOf(drugName);
        }
        return drug;
    }
}
