package org.example.Utility;

import org.example.Connection.JdbcConnection;
import org.example.Repository.PrescriptionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ApplicationContext {
    private static final Connection CONNECTION ;
    private static final PrescriptionRepository PRESCRIPTION_REPOSITORY;

   static {
       CONNECTION = JdbcConnection.getConnection();
       PRESCRIPTION_REPOSITORY =new PrescriptionRepository(CONNECTION);
   }
}

