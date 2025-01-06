
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Receptionist> receptionists = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static List<Patient> patients = new ArrayList<>();
    static List<Appointment> appointments = new ArrayList<>();
    static List<MedicalRecord> medicalRecords = new ArrayList<>();
    static List<Prescription> prescriptions = new ArrayList<>();
    static List<Payment> payments = new ArrayList<>();
    static List<Billing> bills = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nOutpatient Management System");
            System.out.println("1. Manage Receptionists");
            System.out.println("2. Manage Doctors");
            System.out.println("3. Manage Patients");
            System.out.println("4. Book Appointments");
            System.out.println("5. Manage Medical Records");
            System.out.println("6. Manage Prescriptions");
            System.out.println("7. Manage Payments");
            System.out.println("8. Manage Bills");
            System.out.println("9. Search Menu");
            System.out.println("10. Generate Report");
            System.out.println("11. Exit");
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
                    manageMedicalRecords();
                    break;
                case 6:
                    managePrescriptions();
                    break;
                case 7:
                    managePayments();
                    break;
                case 8:
                    manageBills();
                    break;
                case 9:
                    searchMenu();
                    break;
                case 10:
                    generateReport();
                    break;
                case 11:
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
        System.out.println("1. Add Appointment");
        System.out.println("2. View Appointments");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        //        System.out.println("choice: " + choice);
        switch (choice) {
            case 1:
            System.out.print("Enter Appointment ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Date (yyyy-MM-dd): ");
            String date = scanner.nextLine();
            System.out.print("Enter Time: ");
            String time = scanner.nextLine();
            System.out.print("Enter Status: ");
            String status = scanner.nextLine();
            System.out.print("Enter Doctor ID: ");
            int doctorID = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Patient ID: ");
            int patientID = scanner.nextInt();
            scanner.nextLine();
            appointments.add(new Appointment(id, date, time, status, doctorID, patientID));
            System.out.println("Appointment added successfully.");
            break;
            case 2:
            for (Appointment a : appointments) {
                System.out.println(a);
            }
            break;
            default:
            System.out.println("Invalid option.");
        }
    }

    static void manageMedicalRecords() {
        System.out.println("\nManaging Medical Records...");
        System.out.println("1. Add Medical Record");
        System.out.println("2. View Medical Records");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Record ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Diagnosis: ");
                String diagnosis = scanner.nextLine();
                System.out.print("Enter Treatment: ");
                String treatment = scanner.nextLine();
                System.out.print("Enter Consultation Date: ");
                String date = scanner.nextLine();
                System.out.print("Enter Notes: ");
                String notes = scanner.nextLine();
                medicalRecords.add(new MedicalRecord(id, diagnosis, treatment, date, notes));
                System.out.println("Medical Record added successfully.");
                break;
            case 2:
                for (MedicalRecord m : medicalRecords) {
                    System.out.println(m);
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    static void managePrescriptions() {
        System.out.println("\nManaging Prescriptions...");
        System.out.println("1. Add Prescription");
        System.out.println("2. View Prescriptions");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Prescription ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Date: ");
                String date = scanner.nextLine();
                System.out.print("Enter Medication: ");
                String medication = scanner.nextLine();
                System.out.print("Enter Dosage: ");
                String dosage = scanner.nextLine();
                System.out.print("Enter Doctor ID: ");
                int doctorID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Patient ID: ");
                int patientID = scanner.nextInt();
                scanner.nextLine();
                prescriptions.add(new Prescription(id, date, medication, dosage, doctorID, patientID));
                System.out.println("Prescription added successfully.");
                break;
            case 2:
                for (Prescription p : prescriptions) {
                    System.out.println(p);
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    static void managePayments() {
        System.out.println("\nManaging Payments...");
        System.out.println("1. Add Payment");
        System.out.println("2. View Payments");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Payment ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Date: ");
                String date = scanner.nextLine();
                System.out.print("Enter Amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Payment Method: ");
                String method = scanner.nextLine();
                System.out.print("Enter billing ID: ");
                int billingID = scanner.nextInt();
                scanner.nextLine();
                payments.add(new Payment(id, date, amount, method, billingID));
                System.out.println("Payment added successfully.");
                break;
            case 2:
                for (Payment p : payments) {
                    System.out.println(p);
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    static void manageBills() {
        System.out.println("\nManaging Bills...");
        System.out.println("1. Add Bill");
        System.out.println("2. View Bills");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Bill ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Date: ");
                String date = scanner.nextLine();
                System.out.print("Enter Amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Payment Status: ");
                String paymentStatus = scanner.nextLine();
                System.out.print("Enter Patient ID: ");
                int patientID = scanner.nextInt();
                scanner.nextLine();
                bills.add(new Billing(id, date, amount, paymentStatus, patientID));
                System.out.println("Bill added successfully.");
                break;
            case 2:
                for (Billing b : bills) {
                    System.out.println(b);
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }


    static void searchMenu() {
        System.out.println("\nSearch Menu");
        System.out.println("1. Search Patients");
        System.out.println("2. Search Doctors");
        System.out.println("3. Search Appointments");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
    
        switch (choice) {
            case 1:
                searchPatients();
                break;
            case 2:
                searchDoctors();
                break;
            case 3:
                searchAppointments();
                break;
            default:
                System.out.println(" Invalid option. Please try again.");
        }
    }

    static void searchPatients() {
        System.out.println("\nSearching Patients...");
        System.out.print("Enter Patient ID or Name: ");
        String searchQuery = scanner.nextLine();
    
        for (Patient p : patients) {
            if (String.valueOf(p.patientID).equals(searchQuery) || p.name.toLowerCase().contains(searchQuery.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    static void searchDoctors() {
        System.out.println("\nSearching Doctors...");
        System.out.print("Enter Doctor ID or Name: ");
        String searchQuery = scanner.nextLine();
    
        for (Doctor d : doctors) {
            if (String.valueOf(d.doctorID).equals(searchQuery) || d.name.toLowerCase().contains(searchQuery.toLowerCase())) {
                System.out.println(d);
            }
        }
    }

    static void searchAppointments() {
        System.out.println("\nSearching Appointments...");
        System.out.print("Enter Appointment ID or Date (yyyy-MM-dd): ");
        String searchQuery = scanner.nextLine();
    
        for (Appointment a : appointments) {
            if (String.valueOf(a.appointmentID).equals(searchQuery) || a.date.toString().equals(searchQuery)) {
                System.out.println(a);
            }
        }
    }

    static void generateReport() {
        System.out.println("\nGenerating Report...");
        System.out.println("1. Patient Report");
        System.out.println("2. Doctor Report");
        System.out.println("3. Appointment Report");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
    
        switch (choice) {
            case 1:
                generatePatientReport();
                break;
            case 2:
                generateDoctorReport();
                break;
            case 3:
                generateAppointmentReport();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    static void generatePatientReport() {
        System.out.println("\nPatient Report:");
        System.out.println("Patient ID\tName\tAge\tGender\tContact Info\tAddress");
    
        for (Patient p : patients) {
            System.out.println(p.patientID + "\t" + p.name + "\t" + p.age + "\t" + p.gender + "\t" + p.contactInfo + "\t" + p.address);
        }
    }

    static void generateDoctorReport() {
        System.out.println("\nDoctor Report:");
        System.out.println("Doctor ID\tName\tSpecialty\tContact Info\tAvailability");
    
        for (Doctor d : doctors) {
            System.out.println(d.doctorID + "\t" + d.name + "\t" + d.specialty + "\t" + d.contactInfo + "\t" + d.availability);
        }
    }   

    static void generateAppointmentReport() {
        System.out.println("\nAppointment Report:");
        System.out.println("Appointment ID\tDate\tTime\tStatus\tDoctor ID\tPatient ID");
    
        for (Appointment a : appointments) {
            System.out.println(a.appointmentID + "\t" + a.date + "\t" + a.time + "\t" + a.status + "\t" + a.doctorID + "\t" + a.patientID);
        }
    }


}