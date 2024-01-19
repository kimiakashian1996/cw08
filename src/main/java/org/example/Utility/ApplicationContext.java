package org.example.Utility;

import org.example.Connection.JdbcConnection;
import org.example.Repository.*;
import org.example.Service.AdminService;
import org.example.Service.DrugService;
import org.example.Service.PatientService;

import java.sql.Connection;

public class ApplicationContext {
    private static final Connection CONNECTION ;
    private static final PrescriptionRepository PRESCRIPTION_REPOSITORY;
    private static final DrugRepository DRUG_REPOSITORY;
    private static final DrugService DRUG_SERVICE;
    private static final AdminRepository ADMIN_REPOSITORY;
    private static final AdminService ADMIN_SERVICE;
    private static final PatientRepository PATIENT_REPOSITORY;
    private static final PatientService PATIENT_SERVICE;

   static {
       CONNECTION = JdbcConnection.getConnection();
       PRESCRIPTION_REPOSITORY =new PrescriptionRepository(CONNECTION);
       DRUG_REPOSITORY = new DrugRepository(CONNECTION);
       DRUG_SERVICE = new DrugService(DRUG_REPOSITORY);
       ADMIN_REPOSITORY = new AdminRepository(CONNECTION);
       ADMIN_SERVICE = new AdminService(ADMIN_REPOSITORY);
       PATIENT_REPOSITORY = new PatientRepository(CONNECTION);
       PATIENT_SERVICE = new PatientService(PATIENT_REPOSITORY);
   }
   public static DrugService getDrugService(){
       return DRUG_SERVICE;
   }
  public static AdminService getAdminService(){
       return  ADMIN_SERVICE;
  }
  public static PatientService getPatientService(){
       return PATIENT_SERVICE;
  }
}

