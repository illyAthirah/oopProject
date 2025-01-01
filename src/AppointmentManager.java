import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        this.appointments = new ArrayList<>();
    }

    // Add Appointment
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment added: ID " + appointment.getAppointmentID());
    }

    // Remove Appointment
    public void removeAppointment(int appointmentID) {
        appointments.removeIf(appointment -> appointment.getAppointmentID() == appointmentID);
        System.out.println("Appointment removed: ID " + appointmentID);
    }

    // Search Appointment by Date
    public void searchByDate(String date) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                System.out.println("Found Appointment: " + appointment);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No appointments found for the date: " + date);
        }
    }

    // Update Appointment Status
    public void updateAppointmentStatus(int appointmentID, String newStatus) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentID() == appointmentID) {
                appointment.setStatus(newStatus);
                System.out.println("Updated Appointment ID " + appointmentID + " to Status: " + newStatus);
                return;
            }
        }
        System.out.println("Appointment ID " + appointmentID + " not found.");
    }

    // Display All Appointments
    public void displayAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        System.out.println("All Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }
}