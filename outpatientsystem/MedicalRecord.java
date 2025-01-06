public class MedicalRecord {
    int recordID;
    String diagnosis;
    String treatment;
    String consultationDate;
    String notes;

    MedicalRecord(int id, String diagnosis2, String treatment, String date, String notes) {
            this.recordID = id;
            this.diagnosis = diagnosis;
            this.treatment = treatment;
            this.consultationDate = date;
            this.notes = notes;
        }

    @Override
    public String toString() {
        return "Record ID: " + recordID + ", Diagnosis: " + diagnosis + ", Treatment: " + treatment + ", Consultation Date: " + consultationDate + ", Notes: " + notes;
    }
}
