public class Doctor {
    int doctorID;
    String name;
    String specialty;
    String contactInfo;
    boolean availability;

    public String getContactInfo() {
        return contactInfo;
    }

    Doctor(int id, String name, String specialty, String contact, boolean available) {
        this.doctorID = id;
        this.name = name;
        this.specialty = specialty;
        this.contactInfo = contact;
        this.availability = available;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + doctorID + ", Name: " + name + ", Specialty: " + specialty + ", Available: " + availability;
    }
}
