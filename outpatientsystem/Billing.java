// Billing.java
import java.util.Date;

public class Billing {
    private int billingID;
    private int patientID;
    private double amount;
    private String paymentStatus;
    private Date date;

    public Billing(int billingID, int patientID, double amount, String paymentStatus, Date date) {
        this.billingID = billingID;
        this.patientID = patientID;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.date = date;
    }

    // Getters and Setters
    public int getBillingID() { return billingID; }
    public void setBillingID(int billingID) { this.billingID = billingID; }

    public int getPatientID() { return patientID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    @Override
    public String toString() {
        return "Billing ID: " + billingID + ", Patient ID: " + patientID + ", Amount: " + amount + ", Payment Status: " + paymentStatus + ", Date: " + date;
    }
}