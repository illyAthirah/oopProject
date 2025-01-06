// Payment.java

import java.util.Date;

public class Payment {
    private int paymentID;
    private String paymentMethod;
    private double amount;
    private Date date;
    private int billingID;

    public Payment(int paymentID, String paymentMethod, double amount, int billingID, Date date) {
        this.paymentID = paymentID;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.date = date;
        this.billingID = billingID;
    }

    // Getters and Setters
    public int getPaymentID() { return paymentID; }
    public void setPaymentID (int paymentID) { this.paymentID = paymentID; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public int getBillingID() { return billingID; }
    public void setBillingID(int billingID) { this.billingID = billingID; }

    @Override
    public String toString() {
        return "Payment ID: " + paymentID + ", Payment Method: " + paymentMethod + ", Amount: " + amount + ", Date: " + date + ", Billing ID: " + billingID;
    }
}