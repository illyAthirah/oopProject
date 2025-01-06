// Doctor.java
public class Doctor extends Person {
    private String specialty;
    private boolean availability;

    public Doctor(int id, String name, String contactInfo) {
        super(id, name, contactInfo);
        this.specialty = specialty;
        this.availability = availability;
    }

    // Getters and Setters
    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public boolean isAvailable() { return availability; }
    public void setAvailability(boolean availability) { this.availability = availability; }

    @Override
    public String toString() {
        return "Doctor: " + super.toString() + ", Specialty: " + specialty + ", Available: " + availability;
    }
}