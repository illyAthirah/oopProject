// Prescription.java
import java.util.List;

public class Prescription {
    private int prescriptionID;
    private int patientID;
    private int doctorID;
    private List<String> medications;
    private String dateIssued;

    public Prescription(int prescriptionID, int patientID, int doctorID, List<String> medications, String dateIssued) {
        this.prescriptionID = prescriptionID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.medications = medications;
        this.dateIssued = dateIssued;
    }

    // Getters and Setters
    public int getPrescriptionID() { return prescriptionID; }
    public void setPrescriptionID(int prescriptionID) { this.prescriptionID = prescriptionID; }

    public int getPatientID() { return patientID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }

    public int getDoctorID() { return doctorID; }
    public void setDoctorID(int doctorID) { this.doctorID = doctorID; }

    public List<String> getMedications() { return medications; }
    public void setMedications(List<String> medications) { this.medications = medications; }

    public String getDateIssued() { return dateIssued; }
    public void setDateIssued(String dateIssued) { this.dateIssued = dateIssued; }

    @Override
    public String toString() {
        return "Prescription ID: " + prescriptionID + ", Patient ID: " + patientID + ", Doctor ID: " + doctorID + ", Medications: " + medications + ", Date Issued: " + dateIssued;
    }
}