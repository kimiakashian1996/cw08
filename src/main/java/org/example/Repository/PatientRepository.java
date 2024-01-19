package org.example.Repository;

import org.example.Model.Patient;
import org.example.Service.PatientService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientRepository {
    private final Connection connection;

    public PatientRepository(Connection connection) {
        this.connection = connection;
    }

    public boolean addPatient(Patient patient) throws SQLException {
        String addPatientQuery = "INSERT INTO patient (name , username , password)" +
                                 "VALUES(? , ? , ?)";
        PreparedStatement ps = connection.prepareStatement(addPatientQuery);
        ps.setString(1 , patient.getName());
        ps.setString(2 , patient.getUserName());
        ps.setString(3 , patient.getPassword());
        return ps.execute();
    }

    public Patient findByUserName(String username) throws SQLException {
        String findByUserName = "SELECT * FROM patient WHERE username = ? ;";
        PreparedStatement ps = connection.prepareStatement(findByUserName);
        ps.setString(1 , username);
        ResultSet rs = ps.executeQuery();

        if (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String userName1 = rs.getString("username");
            String password = rs.getString("password");
            Patient patient = new Patient(id , name , userName1 , password);
            return patient;
        } else
         return null;
    }
}
