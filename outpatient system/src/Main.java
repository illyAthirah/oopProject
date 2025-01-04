
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Receptionist> receptionists = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static List<Patient> patients = new ArrayList<>();
    static List<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nOutpatient Management System");
            System.out.println("1. Manage Receptionists");
            System.out.println("2. Manage Doctors");
            System.out.println("3. Manage Patients");
            System.out.println("4. Book Appointments");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manageReceptionists();
                    break;
                case 2:
                    manageDoctors();
                    break;
                case 3:
                    managePatients();
                    break;
                case 4:
                    bookAppointments();
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void manageReceptionists() {
        System.out.println("\nManaging Receptionists...");
        System.out.println("1. Add Receptionist");
        System.out.println("2. View Receptionists");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Receptionist ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Contact Info: ");
                String contact = scanner.nextLine();
                receptionists.add(new Receptionist(id, name, contact));
                System.out.println("Receptionist added successfully.");
                break;
            case 2:
                for (Receptionist r : receptionists) {
                    System.out.println(r);
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    static void manageDoctors() {
        System.out.println("\nManaging Doctors...");
        System.out.println("1. Add Doctor");
        System.out.println("2. View Doctors");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Doctor ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Specialty: ");
                String specialty = scanner.nextLine();
                System.out.print("Enter Contact Info: ");
                String contact = scanner.nextLine();
                System.out.print("Is Available (true/false): ");
                boolean available = scanner.nextBoolean();
                doctors.add(new Doctor(id, name, specialty, contact, available));
                System.out.println("Doctor added successfully.");
                break;
            case 2:
                for (Doctor d : doctors) {
                    System.out.println(d);
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    static void managePatients() {
        System.out.println("\nManaging Patients...");
        System.out.println("1. Add Patient");
        System.out.println("2. View Patients");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Patient ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Gender: ");
                String gender = scanner.nextLine();
                System.out.print("Enter Contact Info: ");
                String contact = scanner.nextLine();
                System.out.print("Enter Address: ");
                String address = scanner.nextLine();
                patients.add(new Patient(id, name, age, gender, contact, address));
                System.out.println("Patient added successfully.");
                break;
            case 2:
                for (Patient p : patients) {
                    System.out.println(p);
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    static void bookAppointments() {
        System.out.println("\nBooking Appointments...");
        // Similar logic can be added for appointment booking
    }
}
