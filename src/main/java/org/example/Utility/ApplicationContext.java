package org.example.Utility;

import org.example.Connection.JdbcConnection;
import org.example.Repository.AdminRepository;
import org.example.Repository.DrugRepository;
import org.example.Repository.PrescriptionRepository;
import org.example.Service.AdminService;
import org.example.Service.DrugService;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ApplicationContext {
    private static final Connection CONNECTION ;
    private static final PrescriptionRepository PRESCRIPTION_REPOSITORY;
    private static final DrugRepository DRUG_REPOSITORY;
    private static final DrugService DRUG_SERVICE;
    private static final AdminRepository ADMIN_REPOSITORY;
    private static final AdminService ADMIN_SERVICE;

   static {
       CONNECTION = JdbcConnection.getConnection();
       PRESCRIPTION_REPOSITORY =new PrescriptionRepository(CONNECTION);
       DRUG_REPOSITORY = new DrugRepository(CONNECTION);
       DRUG_SERVICE = new DrugService(DRUG_REPOSITORY);
       ADMIN_REPOSITORY = new AdminRepository(CONNECTION);
       ADMIN_SERVICE = new AdminService(ADMIN_REPOSITORY);
   }
   public static DrugService getDrugService(){
       return DRUG_SERVICE;
   }
  public  static  AdminService getAdminService(){
       return  ADMIN_SERVICE;
  }
}

