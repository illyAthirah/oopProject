public class Prescription {
    private int prescriptionID;
    private Patient patient;
    private Doctor doctor;
    private String medication;
    private String dosage;
    private String instructions;

    public Prescription(int prescriptionID, Patient patient, Doctor doctor, String medication, String dosage, String instructions) {
        this.prescriptionID = prescriptionID;
        this.patient = patient;
        this.doctor = doctor;
        this.medication = medication;
        this.dosage = dosage;
        this.instructions = instructions;
    }

    public void displayPrescription() {
        System.out.println("Prescription ID: " + prescriptionID);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Medication: " + medication);
        System.out.println("Dosage: " + dosage);
        System.out.println("Instructions: " + instructions);
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}