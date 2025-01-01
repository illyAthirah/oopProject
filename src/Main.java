import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentManager appointmentManager = new AppointmentManager();

        while (true) {
            System.out.println("1. Add Appointment\n2. Remove Appointment\n3. Search Appointment\n4. Update Appointment\n5. Display All Appointments\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Appointment
                    System.out.print("Enter Appointment ID: ");
                    int appointmentID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter Time: ");
                    String time = scanner.nextLine();
                    System.out.print("Enter Status: ");
                    String status = scanner.nextLine();
                    System.out.print("Enter Notes: ");
                    String notes = scanner.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();
                    Doctor doctor = new Doctor(0, doctorName, "", "", false);
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    Patient patient = new Patient(patientName);
                    Appointment appointment = new Appointment(appointmentID, date, time, status, notes, doctor, patient);
                    appointmentManager.addAppointment(appointment);
                    break;
                case 2:
                    // Remove Appointment
                    System.out.print("Enter Appointment ID to remove: ");
                    int removeID = scanner.nextInt();
                    scanner.nextLine();
                    appointmentManager.removeAppointment(removeID);
                    break;
                case 3:
                    // Search Appointment
                    System.out.print("Enter Date to search: ");
                    String searchDate = scanner.nextLine();
                    appointmentManager.searchByDate(searchDate);
                    break;
                case 4:
                    // Update Appointment
                    System.out.print("Enter Appointment ID to update: ");
                    int updateID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Status: ");
                    String newStatus = scanner.nextLine();
                    appointmentManager.updateAppointmentStatus(updateID, newStatus);
                    break;
                case 5:
                    // Display All Appointments
                    appointmentManager.displayAllAppointments();
                    break;
                case 6:
                    // Exit
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}