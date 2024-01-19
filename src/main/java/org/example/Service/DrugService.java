package org.example.Service;

import org.example.Model.Drug;
import org.example.Repository.DrugRepository;

import java.util.Arrays;
import java.util.Scanner;

public class DrugService {
    private final Scanner scanner = new Scanner(System.in);
    private final DrugRepository drugRepository;

    public DrugService(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    public int[] getDrugs() throws Exception{
        boolean result = drugRepository.showDrugList();
        int[] len;
        if (result)
        {
            System.out.println("How Many drug's you need?");
            int countOfDrugs = scanner.nextInt();
            scanner.nextLine();
            if(countOfDrugs!=0) {
                System.out.println("insert your drug code:");
                len = new int[countOfDrugs];
                for (int i = 0; i < countOfDrugs; i++) {
                    len[i] = Integer.parseInt(scanner.nextLine());
                }
                return len;
            }
            else
                System.out.println("Count of Array 0");
        }
        else
            System.out.println("DrugList dosen't show to user");
        return null;
    }

    public void getDrugsName (int[] i) throws Exception{
        Drug[] drugs = new Drug[i.length];
        for (int j = 0; j < i.length; j++) {
            Drug drug=drugRepository.findByID(j);
            drugs[j] = drug;
        }
        System.out.println("Your Drugs List:");
        for (int j = 0; j < drugs.length ; j++) {
            System.out.println(drugs[j]+" ");
        }
    }
}
