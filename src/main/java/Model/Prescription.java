package Model;

public class Prescription {
    private int id;
    private int drugListId ;
    private int patientId;
    private int totalPrice;

    public Prescription() {
    }

    public Prescription(int drugListId, int patientId, int totalPrice) {
        this.drugListId = drugListId;
        this.patientId = patientId;
        this.totalPrice = totalPrice;
    }

    public Prescription(int id, int drugListId, int patientId, int totalPrice) {
        this.id = id;
        this.drugListId = drugListId;
        this.patientId = patientId;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrugListId() {
        return drugListId;
    }

    public void setDrugListId(int drugListId) {
        this.drugListId = drugListId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", drugListId=" + drugListId +
                ", patientId=" + patientId +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
