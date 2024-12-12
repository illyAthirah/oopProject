package OutpatientSystem;

import java.util.Scanner;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MedicalRecord {
    // Attributes
    private int recordID;
    private String diagnosis;
    private String treatment;
    private Date consultationDate;
    private String notes;

    // In-memory storage for records (replacing the database)
    private static Map<Integer, MedicalRecord> recordsDB = new HashMap<>();

    // Constructor
    public MedicalRecord(int recordID, String diagnosis, String treatment, Date consultationDate, String notes) {
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.consultationDate = consultationDate;
        this.notes = notes;
    }

    // Getters and Setters
    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Method to save record in memory
    public void saveToDatabase() {
        recordsDB.put(recordID, this);
        System.out.println("Record saved successfully in memory.");
    }

    // Method to fetch a record from memory
    public static MedicalRecord fetchFromDatabase(int id) {
        return recordsDB.get(id);
    }

    // Method to update a record in memory
    public void updateInDatabase() {
        recordsDB.put(recordID, this);
        System.out.println("Record updated successfully in memory.");
    }

    // Method to display record details
    public void display() {
        System.out.println("Record ID: " + recordID);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Treatment: " + treatment);
        System.out.println("Consultation Date: " + consultationDate);
        System.out.println("Notes: " + notes);
        System.out.println("------------------------------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example: Creating and saving a new record
        System.out.print("Enter Record ID: ");
        int recordID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Diagnosis: ");
        String diagnosis = scanner.nextLine();
        System.out.print("Enter Treatment: ");
        String treatment = scanner.nextLine();
        System.out.print("Enter Notes: ");
        String notes = scanner.nextLine();

        MedicalRecord newRecord = new MedicalRecord(recordID, diagnosis, treatment, new Date(), notes);
        newRecord.saveToDatabase();

        // Example: Fetching a record from memory
        System.out.print("Enter Record ID to edit: ");
        int fetchID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        MedicalRecord fetchedRecord = MedicalRecord.fetchFromDatabase(fetchID);

        if (fetchedRecord != null) {
            System.out.println("Fetched Record: ");
            fetchedRecord.display(); // Call the display method to show details
        } else {
            System.out.println("Record not found.");
        }

        // Example: Updating a record in memory
        if (fetchedRecord != null) {
            System.out.print("Enter new Diagnosis: ");
            String newDiagnosis = scanner.nextLine();
            System.out.print("Enter new Treatment: ");
            String newTreatment = scanner.nextLine();
            fetchedRecord.setDiagnosis(newDiagnosis);
            fetchedRecord.setTreatment(newTreatment);
            fetchedRecord.updateInDatabase();

            // Display updated record
            System.out.println("Updated Record: ");
            fetchedRecord.display(); // Display updated record
        }
    }
}