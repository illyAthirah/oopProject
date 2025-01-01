

public class Appointment {
    private int appointmentID;
    private String date;
    private String time;
    private String status;
    private String notes;
    private Doctor doctor;
    private Patient patient;

    // Constructor
    public Appointment(int appointmentID, String date, String time, String status, String notes, Doctor doctor, Patient patient) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
        this.status = status;
        this.notes = notes;
        this.doctor = doctor;
        this.patient = patient;
    }

    // Getters and Setters
    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Display appointment details
    public void displayAppointment() {
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Status: " + status);
        System.out.println("Notes: " + notes);
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        System.out.println("Patient: " + patient.getName() + " (" + patient.getAge() + " years old)");
    }
}

