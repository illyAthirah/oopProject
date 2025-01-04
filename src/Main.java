import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentManager appointmentManager = new AppointmentManager();
        MedicalRecord medicalRecord = null;
        Prescription prescription = null;
        Billing billing = null;
        Receptionist receptionist = null;
        Doctor doctor = null;
        Patient patient = null;

        while (true) {
            System.out.println("\n--- Outpatient Management System ---");
            System.out.println("1. Receptionist Management");
            System.out.println("2. Appointment Management");
            System.out.println("3. Patient Management");
            System.out.println("4. Search");
 System.out.println("5. Generate Reports");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Call receptionist management methods
                    System.out.println("\n--- Receptionist Management ---");
        System.out.println("1. Create Receptionist");
        System.out.println("2. View Receptionist");
        System.out.println("3. Update Receptionist");
        System.out.println("4. Delete Receptionist");
        System.out.print("Enter your choice: ");
        int receptionistChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (receptionistChoice) {
            case 1:
                System.out.print("Enter Receptionist ID: ");
                int receptionistID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Contact Info: ");
                String contactInfo = scanner.nextLine();
                receptionist = new Receptionist(receptionistID, name, contactInfo);
                System.out.println("Receptionist created successfully.");
                break;

            case 2:
                if (receptionist != null) {
                    receptionist.displayInfo();
                } else {
                    System.out.println("No receptionist available.");
                }
                break;

            case 3:
                if (receptionist != null) {
                    System.out.print("Enter new Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new Contact Info: ");
                    String newContactInfo = scanner.nextLine();
                    receptionist.setName(newName);
                    receptionist.setContactInfo(newContactInfo);
                    System.out.println("Receptionist updated successfully.");
                } else {
                    System.out.println("No receptionist available.");
                }
                break;

            case 4:
                receptionist = null;
                System.out.println("Receptionist deleted successfully.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
                    break;
                case 2:
                    appointmentManager.manageAppointments(scanner, patient, receptionist);
                    break;
                case 3:
                    // Call patient management methods
                    System.out.println("\n--- Patient Management ---");
                    System.out.println("1. Create Patient");
                    System.out.println("2. View Patient");
                    System.out.println("3. Update Patient");
                    System.out.println("4. Delete Patient");
                    System.out.println("5. Manage Doctor Details");
                    System.out.println("6. Manage Medical Records");
                    System.out.println("7. Manage Prescriptions");
                    System.out.println("8. Manage Billing");
                    System.out.println("9. Manage Payments");
                    System.out.print("Enter your choice: ");
                    int patientChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
            
                    switch (patientChoice) {
                        case 1:
                            System.out.print("Enter Patient ID: ");
                            String patientID = scanner.nextLine();
                            System.out.print("Enter Name: ");
                            String patientName = scanner.nextLine();
                            System.out.print("Enter Age: ");
                            int age = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            System.out.print("Enter Gender: ");
                            String gender = scanner.nextLine();
                            System.out.print("Enter Contact Info: ");
                            String contactInfo = scanner.nextLine();
                            System.out.print("Enter Address: ");
                            String address = scanner.nextLine();
                            patient = new Patient(patientID, patientName, age, gender, contactInfo, address);
                            System.out.println("Patient created successfully.");
                            break;
            
                        case 2:
                            if (patient != null) {
                                patient.display();
                            } else {
                                System.out.println("No patient available.");
                            }
                            break;
            
                        case 3:
                            if (patient != null) {
                                System.out.print("Enter new Name: ");
                                String newPatientName = scanner.nextLine();
                                System.out.print("Enter new Age: ");
                                int newAge = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                System.out.print("Enter new Gender: ");
                                String newGender = scanner.nextLine();
                                System.out.print("Enter new Contact Info: ");
                                String newContactInfo = scanner.nextLine();
                                System.out.print("Enter new Address: ");
                                String newAddress = scanner.nextLine();
                                patient.setName(newPatientName);
                                patient.setAge(newAge);
                                patient.setGender(newGender);
                                patient.setContactInfo(newContactInfo);
                                patient.setAddress(newAddress);
                                System.out.println("Patient updated successfully.");
                            } else {
                                System.out.println("No patient available.");
                            }
                            break;
            
                        case 4:
                            patient = null;
                            System.out.println("Patient deleted successfully.");
                            break;
            
                        case 5:
                            // Manage Doctor Details
                            System.out.println("\n--- Doctor Details ---");
                            System.out.println("1. Create Doctor");
                            System.out.println("2. View Doctor");
                            System.out.println("3. Update Doctor");
                            System.out.println("4. Delete Doctor");
                            System.out.print("Enter your choice: ");
                            int doctorChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
            
                            switch (doctorChoice) {
                                case 1:
                                    System.out.print("Enter Doctor ID: ");
                                    int doctorID = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Enter Doctor Name: ");
                                    String doctorName = scanner.nextLine();
                                    System.out.print("Enter Specialization: ");
                                    String specialization = scanner.nextLine();
                                    doctor = new Doctor(doctorID, doctorName, specialization);
                                    System.out.println("Doctor created successfully.");
                                    break;
            
                                case 2:
                                    if (doctor != null) {
                                        doctor.displayInfo();
                                    } else {
                                        System.out.println("No doctor available.");
                                    }
                                    break;
            
                                case 3:
                                    if (doctor != null) {
                                        System.out.print("Enter new Name: ");
                                        String newDoctorName = scanner.nextLine();
                                        System.out.print("Enter new Specialization: ");
                                        String newSpecialization = scanner.nextLine();
                                        doctor.setName(newDoctorName);
                                        doctor.setSpecialization(newSpecialization);
                                        System.out.println("Doctor updated successfully.");
                                    } else {
                                        System.out.println("No doctor available.");
                                    }
                                    break;
            
                                case 4:
                                    doctor = null;
                                    System.out.println("Doctor deleted successfully.");
                                    break;
            
                                default:
                                    System.out.println("Invalid choice.");
                            }
                            break;
            
                        case 6:
                            // Manage Medical Records
                            System.out.println("\n--- Manage Medical Records ---");
    System.out.println("1. Create Medical Record");
    System.out.println("2. View Medical Record");
    System.out.println("3. Update Medical Record");
    System.out.println("4. Delete Medical Record");
    System.out.print("Enter your choice: ");
    int medicalRecordChoice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (medicalRecordChoice) {
        case 1:
            System.out.print("Enter Medical Record ID: ");
            int medicalRecordID = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Diagnosis: ");
            String diagnosis = scanner.nextLine();
            System.out.print("Enter Treatment: ");
            String treatment = scanner.nextLine();
            System.out.print("Enter Notes: ");
            String notes = scanner.nextLine();
            medicalRecord = new MedicalRecord(medicalRecordID, diagnosis, treatment, notes);
            System.out.println("Medical Record created successfully.");
            break;

        case 2:
            if (medicalRecord != null) {
                medicalRecord.display();
            } else {
                System.out.println("No medical record available.");
            }
            break;

        case 3:
            if (medicalRecord != null) {
                System.out.print("Enter new Diagnosis: ");
                String newDiagnosis = scanner.nextLine();
                System.out.print("Enter new Treatment: ");
                String newTreatment = scanner.nextLine();
                System.out.print("Enter new Notes: ");
                String newNotes = scanner.nextLine();
                medicalRecord.setDiagnosis(newDiagnosis);
                medicalRecord.setTreatment(newTreatment);
                medicalRecord.setNotes(newNotes);
                System.out.println("Medical Record updated successfully.");
            } else {
                System.out.println("No medical record available.");
            }
            break;

        case 4:
            medicalRecord = null;
            System.out.println("Medical Record deleted successfully.");
            break;

        default:
            System.out.println("Invalid choice.");
    }
                            break;
            
                        case 7:
                            // Manage Prescriptions
                            System.out.println("\n--- Manage Prescriptions ---");
    System.out.println("1. Create Prescription");
    System.out.println("2. View Prescription");
    System.out.println("3. Update Prescription");
    System.out.println("4. Delete Prescription");
    System.out.print("Enter your choice: ");
    int prescriptionChoice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (prescriptionChoice) {
        case 1:
            System.out.print("Enter Prescription ID: ");
            int prescriptionID = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Medication: ");
            String medication = scanner.nextLine();
            System.out.print("Enter Dosage: ");
            String dosage = scanner.nextLine();
            System.out.print("Enter Instructions: ");
            String instructions = scanner.nextLine();
            prescription = new Prescription(prescriptionID, medication, dosage, instructions);
            System.out.println("Prescription created successfully.");
            break;

        case 2:
            if (prescription != null) {
                prescription.display();
            } else {
                System.out.println("No prescription available.");
            }
            break;

        case 3:
            if (prescription != null) {
                System.out.print("Enter new Medication: ");
                String newMedication = scanner.nextLine();
                System.out.print("Enter new Dosage: ");
                String newDosage = scanner.nextLine();
                System.out.print("Enter new Instructions: ");
                String newInstructions = scanner.nextLine();
                prescription.setMedication(newMedication);
                prescription.setDosage(newDosage);
                prescription.setInstructions(newInstructions);
                System.out.println("Prescription updated successfully.");
            } else {
                System.out.println("No prescription available.");
            }
            break;

        case 4:
            prescription = null;
            System.out.println("Prescription deleted successfully.");
            break;

        default:
            System.out.println("Invalid choice.");
    }
                            break;
            
                        case 8:
                            // Manage Billing
                            System.out.println("\n--- Manage Billing ---");
    System.out.println("1. Create Bill");
    System.out.println("2. View Bill");
    System.out.println("3. Update Bill");
    System.out.println("4. Delete Bill");
    System.out.print("Enter your choice: ");
    int billingChoice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (billingChoice) {
        case 1:
            System.out.print("Enter Bill ID: ");
            int billID = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            billing = new Billing(billID, amount);
            System.out.println("Bill created successfully.");
            break;

        case 2:
            if (billing != null) {
                billing.display();
            } else {
                System.out.println("No bill available.");
            }
            break;

        case 3:
            if (billing != null) {
                System.out.print("Enter new Amount: ");
                double newAmount = scanner.nextDouble();
                scanner.nextLine();
                billing.setAmount(newAmount);
                System.out.println("Bill updated successfully.");
            } else {
                System.out.println("No bill available.");
            }
            break;

        case 4:
            billing = null;
            System.out.println("Bill deleted successfully.");
            break;

        default:
            System.out.println("Invalid choice.");
            break;
    }

    break;

case 9:
    // Manage Payments
    System.out.println("\n--- Manage Payments ---");
    System.out.println("1. Create Payment");
    System.out.println("2. View Payment");
    System.out.println("3. Update Payment");
    System.out.println("4. Delete Payment");
    System.out.print("Enter your choice: ");
    int paymentChoice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (paymentChoice) {
        case 1:
            System.out.print("Enter Payment ID: ");
            int paymentID = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();
            Payment payment = new Payment(paymentID, paymentAmount);
            System.out.println("Payment created successfully.");
            break;

        case 2:
            // Add logic to view payment
            break;

        case 3:
            // Add logic to update payment
            break;

        case 4:
            // Add logic to delete payment
            break;

        default:
            System.out.println("Invalid choice.");
            break;
    }
    break;
            
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 4:
                    // Call search methods
                    System.out.println("\n--- Search ---");
                    System.out.print("Enter search term: ");
                    String searchTerm = scanner.nextLine();
                    // Implement search logic here
                    break;
                case 5:
                    // Call report generation methods
                    System.out.println("\n--- Generate Reports ---");
        // Implement report generation logic here
                    break;
                case 6:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}