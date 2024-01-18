package org.example.Service;

import org.example.Model.Admin;
import org.example.Repository.AdminRepository;
import org.example.Utility.Validation;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminService {
    Scanner scanner = new Scanner(System.in);
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void addAdmin() throws SQLException {
        System.out.println("please enter your name");
        String name = scanner.nextLine();
        System.out.println("please enter your username");
        String username = scanner.nextLine();
        System.out.println("please enter your password");
        String password = passwordGetAndValidation();


        Admin admin = new Admin(username, password, name);
        boolean result = adminRepository.addAdmin(admin);
        if (!result)
            System.out.println("Hoorray! admin added");
        else
            System.out.println("sorry, try again");

    }

    public String passwordGetAndValidation() {
        String password;
        while (true) {
            password = scanner.nextLine();
            if (Validation.isValidPassword(password))
                break;
            else {
                System.out.println("Password is not valid! Please try again.");
                System.out.println("""
                        a valid password should be without space and contain:
                        1, at least one digit.
                        2, at least one Upper case alphabet.
                        3, at least one special character.
                        4, at least 8 characters up to 20.""");
            }
        }
        return password;
    }
}