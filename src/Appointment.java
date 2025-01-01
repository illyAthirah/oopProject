public class Appointment {
    private int appointmentID;
    private String date;
    private String time;
    private String status;
    private String notes;
    private Doctor doctor;
    private Patient patient;

    public Appointment(int appointmentID, String date, String time, String status, String notes, Doctor doctor, Patient patient) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
        this.status = status;
        this.notes = notes;
        this.doctor = doctor;
        this.patient = patient;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayAppointment() {
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Status: " + status);
        System.out.println("Notes: " + notes);
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Patient: " + patient.getName());
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentID + ", Date: " + date + ", Time: " + time + ", Status: " + status + ", Notes: " + notes + ", Doctor: " + doctor.getName() + ", Patient: " + patient.getName();
    }
}