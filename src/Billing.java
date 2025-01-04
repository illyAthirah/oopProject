public class Billing {
    private int billingID;
    private Appointment appointment;
    private double amount;
    private String status;
    private Payment payment;  // Composition

    public Billing(int billingID, Appointment appointment, double amount, String status) {
        this.billingID = billingID;
        this.appointment = appointment;
        this.amount = amount;
        this.status = status;
        this.payment = null; // No payment initially
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
        this.status = "Paid";
    }

    public void displayBill() {
        System.out.println("Billing ID: " + billingID);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
        appointment.displayAppointment(); // Call the displayAppointment() method
        if (payment != null) {
            System.out.println("\nPayment Information:");
            payment.displayPaymentDetails();
        }
    }

    // Getters and setters
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    public int getBillingID() {
        return billingID;
    }

    public void setBillingID(int billingID) {
        this.billingID = billingID;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}