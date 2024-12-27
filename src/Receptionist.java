package AppointmentReceptionist;
import java.util.ArrayList;
import java.util.List;

public class Receptionist {
    private int receptionistID;
    private String name;
    private String contactInfo;

    // Constructor
    public Receptionist(int receptionistID, String name, String contactInfo) {
        this.receptionistID = receptionistID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public int getReceptionistID() {
        return receptionistID;
    }

    public void setReceptionistID(int receptionistID) {
        this.receptionistID = receptionistID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Display Receptionist Details
    public void displayInfo() {
        System.out.println("Receptionist ID: " + receptionistID);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
    }
}
