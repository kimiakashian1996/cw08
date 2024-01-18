package org.example.Service;

import org.example.Model.Drug;
import org.example.Repository.DrugRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class DrugService {
    private final Scanner scanner = new Scanner(System.in);
    private final DrugRepository drugRepository;

    public DrugService(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }
    public void addDrug() throws SQLException {
        System.out.println("please enter the drug name :" );
        String name = scanner.nextLine();
        System.out.println("please enter price of drug :");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter inventory of drug :");
        int inventory = scanner.nextInt();
        Drug drug=new Drug(name,price,inventory);
        boolean result = drugRepository.addDrug(drug);
        if( result ){
            System.out.println("drug added !");
        }else {
            System.out.println("please try again!");
        }

    }
}
