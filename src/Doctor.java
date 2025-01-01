public class Doctor {
    private int doctorID;
    private String name;
    private String specialty;
    private String contactInfo;
    private boolean availability;

    // Constructor with all fields
    public Doctor(int doctorID, String name, String specialty, String contactInfo, boolean availability) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialty = specialty;
        this.contactInfo = contactInfo;
        this.availability = availability;
    }

    // Constructor with only name (used in Main.java)
    public Doctor(String name, String specialty, String contactInfo, boolean availability) {
        this(0, name, specialty, contactInfo, availability); // Default doctorID as 0
    }

    // Getters and Setters
    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Method to display doctor information
    public void displayDoctorInfo() {
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }
}