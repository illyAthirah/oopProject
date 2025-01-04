import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
    int appointmentID;
    Date date;
    String time;
    String status;
    int doctorID;
    int patientID;

    Appointment(int id, String date1, String time, String status, int doctorID, int patientID) {
        this.appointmentID = id;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            this.date = sdf.parse(date1);
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
        this.time = time;
        this.status = status;
        this.doctorID = doctorID;
        this.patientID = patientID;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentID + ", Date: " + new Date(date.getTime()) + ", Time: " + time + ", Status: " + status + ", Doctor ID: " + doctorID + ", Patient ID: " + patientID;
    }
}