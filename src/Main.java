import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create Doctors
        Doctor doctor1 = new Doctor(101, "Dr. Smith", "Cardiology", "012-9876543", true);
        Doctor doctor2 = new Doctor(102, "Dr. Jane", "Neurology", "013-8765432", true);

        // Create Patients
        Patient patient1 = new Patient(1, "John Doe", 30, "Male", "012-3456789", "123 Street Name");
        Patient patient2 = new Patient(2, "Alice Lee", 25, "Female", "014-4567890", "456 Avenue Name");

        // Create an Appointment Manager
        AppointmentManager appointmentManager = new AppointmentManager();

        // Schedule Appointments
        Appointment appointment1 = new Appointment(1, "2024-12-01", "10:00", "Confirmed", "Routine Checkup", doctor1, patient1);
        Appointment appointment2 = new Appointment(2, "2024-12-02", "14:00", "Confirmed", "Consultation", doctor2, patient2);

        // Add appointments to manager
        appointmentManager.addAppointment(appointment1);
        appointmentManager.addAppointment(appointment2);

        // Create Medical Records
        MedicalRecord record1 = new MedicalRecord(1, "Hypertension diagnosis", "Take prescribed medication", patient1);
        MedicalRecord record2 = new MedicalRecord(2, "Migraine treatment", "Rest and avoid triggers", patient2);

        // Create Billing
        Billing bill1 = new Billing(1, appointment1, 200.00, "Paid");
        Billing bill2 = new Billing(2, appointment2, 150.00, "Pending");

        // Create Prescriptions
        Prescription prescription1 = new Prescription(1, patient1, doctor1, "Aspirin", "100 mg, Once daily", "Take after meals for 2 weeks");
        Prescription prescription2 = new Prescription(2, patient2, doctor2, "Ibuprofen", "200 mg, Twice daily", "Take with water for 5 days");

        // Display information
        System.out.println("\n=== Patient Information ===");
        patient1.displayInfo();
        patient2.displayInfo();

        System.out.println("\n=== Doctor Information ===");
        doctor1.displayInfo();
        doctor2.displayInfo();

        System.out.println("\n=== Appointments ===");
        appointmentManager.displayAllAppointments();

        System.out.println("\n=== Medical Records ===");
        record1.displayRecord();
        record2.displayRecord();

        System.out.println("\n=== Billing Information ===");
        bill1.displayBill();
        bill2.displayBill();

        System.out.println("\n=== Prescriptions ===");
        prescription1.displayPrescription();
        prescription2.displayPrescription();

        // Search appointments by date
        System.out.println("\n=== Search Appointments on 2024-12-01 ===");
        appointmentManager.searchByDate("2024-12-01");

        // Update billing status
        System.out.println("\n=== Update Billing for Appointment 2 ===");
        bill2.setStatus("Paid");
        bill2.displayBill();
    }
}
