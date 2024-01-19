package org.example.Utility;

import org.example.Service.AdminService;
import org.example.Service.DrugService;
import org.example.Service.PatientService;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    //private final DrugService drugService= ApplicationContext.getDrugService();
    private final AdminService adminService = ApplicationContext.getAdminService();
    private final PatientService patientService = ApplicationContext.getPatientService();
    private final Scanner scanner = new Scanner(System.in);

    private final DrugService drugService = ApplicationContext.getDrugService();

    public void menu () throws Exception {
        /*System.out.println("Welcome!");
        System.out.println("""
                           Please enter your role: 
                           1, Admin.
                           2, Patient.""");
        int role = scanner.nextInt();
        switch (role){
            case 1 -> adminService.addAdmin();
            case 2 -> {
                signInOrSignUp();

            }
        }*/

        int[] i =drugService.getDrugs();
        drugService.getDrugsName(i);
    }

    public void signInOrSignUp() throws SQLException {
        System.out.println("1, i already have an account. (sign in)");
        System.out.println("2, I'm a new user! (sign up)");
        System.out.println("Please enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> patientService.signIn();
            case 2 -> {
                patientService.addPatient();
                patientService.signIn();
            }
        }
    }
}
