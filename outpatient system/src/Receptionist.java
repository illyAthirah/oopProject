// Receptionist class
public class Receptionist {
    int receptionistID;
    String name;
    String contactInfo;

    Receptionist(int id, String name, String contact) {
        this.receptionistID = id;
        this.name = name;
        this.contactInfo = contact;
    }

    @Override
    public String toString() {
        return "Receptionist ID: " + receptionistID + ", Name: " + name + ", Contact: " + contactInfo;
    }
}