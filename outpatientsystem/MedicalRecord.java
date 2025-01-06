// MedicalRecord.java
public class MedicalRecord {
    private int recordID;
    private String diagnosis;
    private String treatment;
    private String consultationDate;
    private String notes;

    public MedicalRecord(int recordID, String diagnosis, String treatment, String consultationDate, String notes) {
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.consultationDate = consultationDate;
        this.notes = notes;
    }

    // Getters and Setters
    public int getRecordID() { return recordID; }
    public void setRecordID(int recordID) { this.recordID = recordID; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public String getTreatment() { return treatment; }
    public void setTreatment(String treatment) { this.treatment = treatment; }

    public String getConsultationDate() { return consultationDate; }
    public void setConsultationDate(String consultationDate) { this.consultationDate = consultationDate; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    @Override
    public String toString() {
        return "Record ID : " + recordID + ", Diagnosis: " + diagnosis + ", Treatment: " + treatment + ", Consultation Date: " + consultationDate + ", Notes: " + notes;
    }
}