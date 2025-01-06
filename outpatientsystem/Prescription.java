import java.util.Date;

public class Prescription {
    int prescriptionID;
    Date date;
    int patientID;
    String medicineID;
    String dosage;

    Prescription(int id, String date2, String medicineID, String dosage, int patientID, int patientID1) {
        this.prescriptionID = id;
        this.date = date;
        this.patientID = patientID;
        this.medicineID = medicineID;
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Prescription ID: " + prescriptionID + ", Date: " + new Date(date.getTime()) + ", Patient ID: " + patientID + ", Medicine ID: " + medicineID + ", Dosage: " + dosage;
    }

}
