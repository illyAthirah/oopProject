package ProjectOOP;


import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointments; // List to store appointments

    // Constructor
    public AppointmentManager() {
        this.appointments = new ArrayList<>();
    }

    // Method to add an appointment
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment added: ID " + appointment.getAppointmentID());
    }

    // Method to display all appointments
    public void displayAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.displayAppointment();
                System.out.println("----------------------------");
            }
        }
    }

    // Method to search appointments by date
    public void searchByDate(String date) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                appointment.displayAppointment();
                System.out.println("----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No appointments found on " + date);
        }
    }
}
