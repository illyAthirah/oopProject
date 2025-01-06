// Appointment.java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
    private int appointmentID;
    private Date date;
    private String time;
    private String status;
    private int doctorID;
    private int patientID;

    public Appointment(int appointmentID, String date, String time, String status, int doctorID, int patientID) {
        this.appointmentID = appointmentID;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            this.date = sdf.parse(date);
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
        this.time = time;
        this.status = status;
        this.doctorID = doctorID;
        this.patientID = patientID;
    }

    // Getters and Setters
    public int getAppointmentID() { return appointmentID; }
    public void setAppointmentID(int appointmentID) { this.appointmentID = appointmentID; }

    public Date getDate() { return date; }
    public void setDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            this.date = sdf.parse(date);
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
    }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getDoctorID() { return doctorID; }
    public void setDoctorID(int doctorID) { this.doctorID = doctorID; }

    public int getPatientID() { return patientID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentID + ", Date: " + date + ", Time: " + time + ", Status: " + status + ", Doctor ID: " + doctorID + ", Patient ID: " + patientID;
    }
}