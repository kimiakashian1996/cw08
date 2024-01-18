package Model;

public class Drug {
    private int id ;
    private String drugName ;
    private int price;
    private int inventory;

    public Drug() {
    }

    public Drug(int id, String drugName, int price, int inventory) {
        this.id = id;
        this.drugName = drugName;
        this.price = price;
        this.inventory = inventory;
    }

    public Drug(String drugName, int price, int inventory) {
        this.drugName = drugName;
        this.price = price;
        this.inventory = inventory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", drugName='" + drugName + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                '}';
    }
}
