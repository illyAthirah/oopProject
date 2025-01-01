public public class Prescription {
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
}
 {
    
}
