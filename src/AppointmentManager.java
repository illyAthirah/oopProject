import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {
    private List<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    // Add Appointment
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment added successfully.");
    }

     // Delete Appointment
     public void deleteAppointment(int appointmentID) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentID() == appointmentID) {
                appointments.remove(appointment);
                System.out.println("Appointment deleted successfully.");
                return;
            }
        }
        System.out.println("Appointment not found.");
    }

    // Get Appointment
    public Appointment getAppointment(int appointmentID) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentID() == appointmentID) {
                return appointment;
            }
        }
        return null;
    }

    // View Appointments
    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
        }
    }


    // Search by Appointment ID
    public void searchByAppointmentID(int appointmentID) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentID() == appointmentID) {
                System.out.println("Appointment Found:");
                appointment.displayAppointment();
                return;
            }
        }
        System.out.println("No appointment found with ID: " + appointmentID);
    }

    // Search by Patient Name
    public void searchByPatientName(String patientName) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatient().getName().equalsIgnoreCase(patientName)) {
                System.out.println("Appointment Found:");
                appointment.displayAppointment();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No appointments found for patient: " + patientName);
        }
    }

    // Search by Date
    public void searchByDate(String date) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                System.out.println("Appointment Found:");
                appointment.displayAppointment();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No appointments found for date: " + date);
        }
    }

    // Generate Reports
    public void generateReports() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        System.out.println("Generating reports...");
        // Sort appointments by date
        appointments.sort((a1, a2) -> a1.getDate().compareTo(a2.getDate()));
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}