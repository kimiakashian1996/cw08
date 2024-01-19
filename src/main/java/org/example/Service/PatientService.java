package org.example.Service;

import org.example.Model.Patient;
import org.example.Repository.DrugListRepository;
import org.example.Repository.PatientRepository;
import org.example.Utility.Validation;

import java.sql.SQLException;
import java.util.Scanner;

public class PatientService {
    private final PatientRepository patientRepository;
    private final Scanner scanner = new Scanner(System.in);

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void addPatient() throws SQLException {
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your username: ");
        String userName = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String password = getPassWord();

        Patient patient = new Patient(name , userName , password);
        boolean result = patientRepository.addPatient(patient);
        if (!result){
            System.out.println("You registered successfully!");
        } else {
            System.out.println("SomeThing went wrong. Please try again.");
        }
    }

    public void signIn() throws SQLException {
        System.out.println("Please enter your username: ");
        String userName = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String passWord = scanner.nextLine();

        Patient patient = patientRepository.findByUserName(userName);
        if (patient != null && patient.getPassword().equals(passWord)){
            System.out.println("Welcome " + patient.getName() + "!");
        }
        else if (patient != null && !patient.getPassword().equals(passWord)){
            System.out.println("Wrong password!");
        } else {
            System.out.println("Please register first! ");
        }
    }

    public String getPassWord(){
        String passWord;
        while (true){
            passWord = scanner.nextLine();
            if (Validation.isValidPassword(passWord)){
                break;
            } else {
                System.out.println("Password is not valid! Please try again.");
                System.out.println("""
                        a valid password should be without space and contain:
                        1, at least one digit.
                        2, at least one Upper case alphabet.
                        3, at least one special character.
                        4, at least 8 characters up to 20.""");
            }
        }
        return passWord;
    }
}
