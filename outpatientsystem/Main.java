// Main.java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Receptionist> receptionists = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();
    private static List<Billing> bills = new ArrayList<>();
    private static List<Payment> payments = new ArrayList<>();
    private static List<Prescription> prescriptions = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nOutpatient Management System");
            System.out.println("1. Manage Receptionists");
            System.out.println("2. Manage Doctors");
            System.out.println("3. Manage Patients");
            System.out.println("4. Manage Appointments");
            System.out.println("5. Manage Billing");
            System.out.println("6. Manage Payments");
            System.out.println("7. Manage Prescriptions");
            System.out.println("8. Search Menu");
            System.out.println("9. Generate Report");
            System.out.println("10. Exit");
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
                    manageAppointments();
                    break;
                case 5:
                    manageBilling();
                    break;
                case 6:
                    managePayments();
                    break;
                case 7:
                    managePrescriptions();
                    break;
                case 8:
                    searchMenu();
                    break;
                case 9:
                    generateReport();
                    break;
                case 10:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Methods for managing Receptionists
    private static void manageReceptionists() {
        System.out.println("\nManaging Receptionists...");
        System.out.println("1. Add Receptionist");
        System.out.println("2. View Receptionists");
        System.out.println("3. Remove Receptionist");
        System.out.println("4. Update Receptionist");
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
            case 3:
                System.out.print("Enter Receptionist ID to remove: ");
                int removeId = scanner.nextInt();
                receptionists.removeIf(r -> r.getId() == removeId);
                System.out.println("Receptionist removed successfully.");
                break;
            case 4:
                System.out.print("Enter Receptionist ID to update: ");
                int updateId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Contact Info: ");
                String newContact = scanner.nextLine();
                for (Receptionist r : receptionists) {
                    if (r.getId() == updateId) {
                        r.setName(newName);
                        r.setContactInfo(newContact);
                        System.out.println("Receptionist updated successfully.");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Methods for managing Doctors
    private static void manageDoctors() {
        System.out.println("\nManaging Doctors...");
        System.out.println("1. Add Doctor");
        System.out.println("2. View Doctors");
        System.out.println("3. Remove Doctor");
        System.out.println("4. Update Doctor");
        System.out.print("Choose an option : ");
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
                doctors.add(new Doctor(id, name, specialty));
                System.out.println("Doctor added successfully.");
                break;
            case 2:
                for (Doctor d : doctors) {
                    System.out.println(d);
                }
                break;
            case 3:
                System.out.print("Enter Doctor ID to remove: ");
                int removeId = scanner.nextInt();
                doctors.removeIf(d -> d.getId() == removeId);
                System.out.println("Doctor removed successfully.");
                break;
            case 4:
                System.out.print("Enter Doctor ID to update: ");
                int updateId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Specialty: ");
                String newSpecialty = scanner.nextLine();
                for (Doctor d : doctors) {
                    if (d.getId() == updateId) {
                        d.setName(newName);
                        d.setSpecialty(newSpecialty);
                        System.out.println("Doctor updated successfully.");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Methods for managing Patients
    private static void managePatients() {
        System.out.println("\nManaging Patients...");
        System.out.println("1. Add Patient");
        System.out.println("2. View Patients");
        System.out.println("3. Remove Patient");
        System.out.println("4. Update Patient");
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
                System.out.print("Enter Contact Info: ");
                String contact = scanner.nextLine();
                patients.add(new Patient(id, name, contact));
                System.out.println("Patient added successfully.");
                break;
            case 2:
                for (Patient p : patients) {
                    System.out.println(p);
                }
                break;
            case 3:
                System.out.print("Enter Patient ID to remove: ");
                int removeId = scanner.nextInt();
                patients.removeIf(p -> p.getId() == removeId);
                System.out.println("Patient removed successfully.");
                break;
            case 4:
                System.out.print("Enter Patient ID to update: ");
                int updateId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Contact Info: ");
                String newContact = scanner.nextLine();
                for (Patient p : patients) {
                    if (p.getId() == updateId) {
                        p.setName(newName);
                        p.setContactInfo(newContact);
                        System.out.println("Patient updated successfully.");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Methods for managing Appointments
    private static void manageAppointments() {
        System.out.println("\nManaging Appointments...");
        System.out.println("1. Add Appointment");
        System.out.println("2. View Appointments");
        System.out.println("3. Remove Appointment");
        System.out.println("4. Update Appointment");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Appointment ID: ");
                int appointmentID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Date (yyyy-MM-dd): ");
                String date = scanner.nextLine();
                System.out.print("Enter Time: ");
                String time = scanner.nextLine();
                System.out.print("Enter Status: ");
                String status = scanner.nextLine();
                System.out.print("Enter Doctor ID: ");
                int doctorID = scanner.nextInt();
                System.out.print("Enter Patient ID: ");
                int patientID = scanner.nextInt();
                appointments.add(new Appointment(appointmentID, date, time, status, doctorID, patientID));
                System.out.println("Appointment added successfully.");
                break;
            case 2:
                for (Appointment a : appointments) {
                    System.out.println(a);
                }
                break;
            case 3:
                System.out.print("Enter Appointment ID to remove: ");
                int removeAppointmentId = scanner.nextInt();
                appointments.removeIf(a -> a.getAppointmentID() == removeAppointmentId);
                System.out.println("Appointment removed successfully.");
                break;
            case 4:
                System.out.print("Enter Appointment ID to update: ");
                int updateAppointmentId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Date (yyyy-MM-dd): ");
                String newDate = scanner.nextLine();
                System.out.print("Enter new Time: ");
                String newTime = scanner.nextLine();
                System.out.print("Enter new Status: ");
                String newStatus = scanner.nextLine();
                for (Appointment a : appointments) {
                    if (a.getAppointmentID() == updateAppointmentId) {
                        a.setDate(newDate);
                        a.setTime(newTime);
                        a.setStatus(newStatus);
                        System.out.println("Appointment updated successfully.");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Methods for managing Billing
    private static void manageBilling() {
        System.out.println("\nManaging Billing...");
        System.out.println("1. Add Billing");
        System.out.println("2. View Billing");
        System.out.println("3. Remove Billing");
        System.out.println("4. Update Billing");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Billing ID: ");
                int billingID = scanner.nextInt();
                System.out.print("Enter Patient ID: ");
                int billingPatientID = scanner.nextInt();
                System.out.print("Enter Amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Payment Status: ");
                String paymentStatus = scanner.nextLine();
                System.out.print("Enter Date (yyyy-MM-dd): ");
                String billingDate = scanner.nextLine();
                try {
                    bills.add(new Billing(billingID, billingPatientID, amount, paymentStatus, new SimpleDateFormat("yyyy-MM-dd").parse(billingDate)));
                    System.out.println("Billing added successfully.");
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                }
                break;
            case 2:
                for (Billing b : bills) {
                    System.out.println(b);
                }
                break;
            case 3:
                System.out.print("Enter Billing ID to remove: ");
                int removeBillingID = scanner.nextInt();
                bills.removeIf(b -> b.getBillingID() == removeBillingID);
                System.out.println("Billing removed successfully.");
                break;
            case 4:
                System.out.print("Enter Billing ID to update: ");
                int updateBillingId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Amount: ");
                double newAmount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter new Payment Status: ");
                String newPaymentStatus = scanner.nextLine();
                for (Billing b : bills) {
                    if (b.getBillingID() == updateBillingId) {
                        b.setAmount(newAmount);
                        b.setPaymentStatus(newPaymentStatus);
                        System.out.println("Billing updated successfully.");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Methods for managing Payments
    private static void managePayments() {
        System.out.println("\nManaging Payments...");
        System.out.println("1. Add Payment");
        System.out.println("2. View Payments");
        System.out.println("3. Remove Payment");
        System.out.println("4. Update Payment");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Payment ID: ");
                int paymentID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Payment Method: ");
                String paymentMethod = scanner.nextLine();
                System.out.print("Enter Amount: ");
                double paymentAmount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Billing ID: ");
                int paymentBillingID = scanner.nextInt();
                System.out.print("Enter Date (yyyy-MM-dd): ");
                String paymentDate = scanner.nextLine();
                try {
                    payments.add(new Payment(paymentID, paymentMethod, paymentAmount, paymentBillingID, new SimpleDateFormat("yyyy-MM-dd").parse(paymentDate)));
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                }
                System.out.println("Payment added successfully.");
                break;
            case 2:
                for (Payment p : payments) {
                    System.out.println(p);
                }
                break;
            case 3:
                System.out.print("Enter Payment ID to remove: ");
                int removePaymentId = scanner.nextInt();
                payments.removeIf(p -> p.getPaymentID() == removePaymentId );
                System.out.println("Payment removed successfully.");
                break;
            case 4:
                System.out.print("Enter Payment ID to update: ");
                int updatePaymentId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Payment Method: ");
                String newPaymentMethod = scanner.nextLine();
                System.out.print("Enter new Amount: ");
                double newPaymentAmount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter new Date: ");
                String newPaymentDate = scanner.nextLine();
                for (Payment p : payments) {
                    if (p.getPaymentID() == updatePaymentId) {
                        p.setPaymentMethod(newPaymentMethod);
                        p.setAmount(newPaymentAmount);
                        try {
                            p.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(newPaymentDate));
                        } catch (ParseException e) {
                            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                        }
                        System.out.println("Payment updated successfully.");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Methods for managing Prescriptions
    private static void managePrescriptions() {
        System.out.println("\nManaging Prescriptions...");
        System.out.println("1. Add Prescription");
        System.out.println("2. View Prescriptions");
        System.out.println("3. Remove Prescription");
        System.out.println("4. Update Prescription");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Prescription ID: ");
                int prescriptionID = scanner.nextInt();
                System.out.print("Enter Patient ID: ");
                int prescriptionPatientID = scanner.nextInt();
                System.out.print("Enter Doctor ID: ");
                int prescriptionDoctorID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Medications (comma-separated): ");
                String medicationsInput = scanner.nextLine();
                List<String> medications = List.of(medicationsInput.split(","));
                System.out.print("Enter Date Issued: ");
                String dateIssued = scanner.nextLine();
                prescriptions.add(new Prescription(prescriptionID, prescriptionPatientID, prescriptionDoctorID, medications, dateIssued));
                System.out.println("Prescription added successfully.");
                break;
            case 2:
                for (Prescription p : prescriptions) {
                    System.out.println(p);
                }
                break;
            case 3:
                System.out.print("Enter Prescription ID to remove: ");
                int removePrescriptionId = scanner.nextInt();
                prescriptions.removeIf(p -> p.getPrescriptionID() == removePrescriptionId);
                System.out.println("Prescription removed successfully.");
                break;
            case 4:
                System.out.print("Enter Prescription ID to update: ");
                int updatePrescriptionId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Medications (comma-separated): ");
                String newMedicationsInput = scanner.nextLine();
                List<String> newMedications = List.of(newMedicationsInput.split(","));
                System.out.print("Enter new Date Issued: ");
                String newDateIssued = scanner.nextLine();
                for (Prescription p : prescriptions) {
                    if (p.getPrescriptionID() == updatePrescriptionId) {
                        p.setMedications(newMedications);
                        p.setDateIssued(newDateIssued);
                        System.out.println("Prescription updated successfully.");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Search Menu
    private static void searchMenu() {
        System.out.println("\nSearch Menu...");
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
     
     // Search Patients
     private static void searchPatients() {
        System.out.println("\nSearching Patients...");
        System.out.print("Enter Patient ID or Name: ");
        String searchQuery = scanner.nextLine();

        for (Patient p : patients) {
            if (String.valueOf(p.getId()).equals(searchQuery) || p.getName().toLowerCase().contains(searchQuery.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    // Search Doctors
    private static void searchDoctors() {
        System.out.println("\nSearching Doctors...");
        System.out.print("Enter Doctor ID or Name: ");
        String searchQuery = scanner.nextLine();

        for (Doctor d : doctors) {
            if (String.valueOf(d.getId()).equals(searchQuery) || d.getName().toLowerCase().contains(searchQuery.toLowerCase())) {
                System.out.println(d);
            }
        }
    }

    // Search Appointments
    private static void searchAppointments() {
        System.out.println("\nSearching Appointments...");
        System.out.print("Enter Appointment ID or Date (yyyy-MM-dd): ");
        String searchQuery = scanner.nextLine();

        for (Appointment a : appointments) {
            if (String.valueOf(a.getAppointmentID()).equals(searchQuery) || new SimpleDateFormat("yyyy-MM-dd").format(a.getDate()).equals(searchQuery)) {
                System.out.println(a);
            }
        }
    }

    // Generate Report
    private static void generateReport() {
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

    // Generate Patient Report
    private static void generatePatientReport() {
        System.out.println("\nPatient Report...");
        System.out.println("Patient ID\tName\tAge\tGender\tContact Info\tAddress");

        for (Patient p : patients) {
            System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getAge() + "\t" + p.getGender() + "\t" + p.getContactInfo() + "\t" + p.getAddress());
        }
    }

    // Generate Doctor Report
    private static void generateDoctorReport() {
        System.out.println("\nDoctor Report:");
        System.out.println("Doctor ID\tName\tSpecialty\tContact Info");

        for (Doctor d : doctors) {
            System.out.println(d.getId() + "\t" + d.getName() + "\t" + d.getSpecialty() + "\t" + d.getContactInfo());
        }
    }

    // Generate Appointment Report
    private static void generateAppointmentReport() {
        System.out.println("\nAppointment Report:");
        System.out.println("Appointment ID\tDate\tTime\tStatus\tDoctor ID\tPatient ID");

        for (Appointment a : appointments) {
            System.out.println(a.getAppointmentID() + "\t" + new SimpleDateFormat("yyyy-MM-dd").format(a.getDate()) + "\t" + a.getTime() + "\t" + a.getStatus() + "\t" + a.getDoctorID() + "\t" + a.getPatientID());
        }
    }
}