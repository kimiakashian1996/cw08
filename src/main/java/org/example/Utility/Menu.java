package org.example.Utility;

import org.example.Service.AdminService;
import org.example.Service.DrugService;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final DrugService drugService= ApplicationContext.getDrugService();
    private final AdminService adminService = ApplicationContext.getAdminService();
    private final Scanner scanner = new Scanner(System.in);
    public void menu () throws SQLException {
//        System.out.println("please choose your Role , admin/patient ");
//        String role = scanner.nextLine();
adminService.addAdmin();

    }

    public void getAdminFields (){

    }
}
