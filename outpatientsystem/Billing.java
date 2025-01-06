
import java.util.Date;

public class Billing {
    int billingID;
    int patientID;
    double amount;
    String paymentStatus;
    Date date;

    Billing(int id, String paymentStatus, double amount, String paymentStatus1, int patientID)  {
        this.billingID = id;
        this.patientID = patientID;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Billing ID: " + billingID + ", Patient ID: " + patientID + ", Amount: " + amount + ", Payment Status: " + paymentStatus + ", Date: " + new Date(date.getTime());
    }
}
