public class Receptionist {
    private int receptionistID;
    private String name;
    private String contactInfo;

    public Receptionist(int receptionistID, String name, String contactInfo) {
        this.receptionistID = receptionistID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

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

    public void displayInfo() {
        System.out.println("Receptionist ID: " + receptionistID);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "receptionistID=" + receptionistID +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}