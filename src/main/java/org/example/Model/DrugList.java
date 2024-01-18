package org.example.Model;

public class DrugList {
    private int id ;
    private int drugId1;
    private int drugId2;
    private int drugId3;
    private int drugId4;
    private int drugId5;

    public DrugList() {
    }

    public DrugList(int drugId1, int drugId2, int drugId3, int drugId4, int drugId5) {
        this.drugId1 = drugId1;
        this.drugId2 = drugId2;
        this.drugId3 = drugId3;
        this.drugId4 = drugId4;
        this.drugId5 = drugId5;
    }

    public DrugList(int id, int drugId1, int drugId2, int drugId3, int drugId4, int drugId5) {
        this.id = id;
        this.drugId1 = drugId1;
        this.drugId2 = drugId2;
        this.drugId3 = drugId3;
        this.drugId4 = drugId4;
        this.drugId5 = drugId5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrugId1() {
        return drugId1;
    }

    public void setDrugId1(int drugId1) {
        this.drugId1 = drugId1;
    }

    public int getDrugId2() {
        return drugId2;
    }

    public void setDrugId2(int drugId2) {
        this.drugId2 = drugId2;
    }

    public int getDrugId3() {
        return drugId3;
    }

    public void setDrugId3(int drugId3) {
        this.drugId3 = drugId3;
    }

    public int getDrugId4() {
        return drugId4;
    }

    public void setDrugId4(int drugId4) {
        this.drugId4 = drugId4;
    }

    public int getDrugId5() {
        return drugId5;
    }

    public void setDrugId5(int drugId5) {
        this.drugId5 = drugId5;
    }

    @Override
    public String toString() {
        return "DrugList{" +
                "id=" + id +
                ", drugId1=" + drugId1 +
                ", drugId2=" + drugId2 +
                ", drugId3=" + drugId3 +
                ", drugId4=" + drugId4 +
                ", drugId5=" + drugId5 +
                '}';
    }
}
