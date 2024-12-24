import java.util.Date;

public abstract class Payment {
    protected int paymentID;
    protected double amount;
    protected Date paymentDate;
    protected String paymentType;

    public Payment(int paymentID, double amount, Date paymentDate, String paymentType) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentType = paymentType;
    }

    public abstract void displayPaymentDetails();

    public int getPaymentID() { return paymentID; }
    public double getAmount() { return amount; }
    public Date getPaymentDate() { return paymentDate; }
    public String getPaymentType() { return paymentType; }
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(int paymentID, double amount, Date paymentDate, String paymentType, String cardNumber) {
        super(paymentID, amount, paymentDate, paymentType);
        this.cardNumber = cardNumber;
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Payment ID: " + paymentID);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Type: " + paymentType);
        System.out.println("Card Number: " + cardNumber);
    }
}
