import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Prescription> prescriptions = new ArrayList<>();

        try {
            // Sample data entry
            System.out.println("Enter prescription details:");

            System.out.print("Prescription ID: ");
            int prescriptionID = Integer.parseInt(scanner.nextLine());

            System.out.print("Patient Name: ");
            String patientName = scanner.nextLine();
            Patient patient = new Patient(patientName); // Use the constructor with only name

            System.out.print("Doctor Name: ");
            String doctorName = scanner.nextLine();
            Doctor doctor = new Doctor(0, doctorName, "", "", false); // Use the existing constructor

            System.out.print("Medication: ");
            String medication = scanner.nextLine();

            System.out.print("Dosage: ");
            String dosage = scanner.nextLine();

            System.out.print("Instructions: ");
            String instructions = scanner.nextLine();

            Prescription prescription = new Prescription(prescriptionID, patient, doctor, medication, dosage, instructions);
            prescriptions.add(prescription);

            // Display all prescriptions
            for (Prescription pres : prescriptions) {
                pres.displayPrescription();
                System.out.println();
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values where required.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}