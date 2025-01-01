import java.util.ArrayList;
import java.util.Scanner;

    class Patient {
    private String patientID;
    private String name;
    private int age;
    private String gender;
    private String contactInfo;
    private String address;

    public Patient(String patientID, String name, int age, String gender, String contactInfo, String address) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactInfo = contactInfo;
        this.address = address;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }
    
        // Getter for Age
    public int getAge() {
        return age;
    }

    // Getter for Gender
    public String getGender() {
        return gender;
    }

    // Getter for Contact Info
    public String getContactInfo() {
        return contactInfo;
    }

    // Getter for Address
    public String getAddress() {
        return address;
    }


    public void display() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Address: " + address + "\n");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class PatientManagementSystem {
    private ArrayList<Patient> patients;
    private Scanner scanner;

    public PatientManagementSystem() {
        patients = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addPatient() {
        System.out.print("Enter Patient ID: ");
        String patientID = scanner.nextLine().trim();
        if (patientID.isEmpty()) {
            System.out.println("Patient ID cannot be empty!");
            return;
        }

        for (Patient p : patients) {
            if (p.getPatientID().equals(patientID)) {
                System.out.println("Patient ID already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty!");
            return;
        }

        System.out.print("Enter Age: ");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
            if (age < 0) {
                System.out.println("Age must be a non-negative integer!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age!");
            return;
        }

        System.out.print("Enter Gender (M/F): ");
        String gender = scanner.nextLine().toUpperCase();
        if (!gender.equals("M") && !gender.equals("F")) {
            System.out.println("Invalid gender! Please enter M or F.");
            return;
        }

        System.out.print("Enter Contact Info: ");
        String contactInfo = scanner.nextLine().trim();
        if (contactInfo.isEmpty()) {
            System.out.println("Contact Info cannot be empty!");
            return;
        }

        System.out.print("Enter Address: ");
        String address = scanner.nextLine().trim();

        Patient newPatient = new Patient(patientID, name, age, gender, contactInfo, address);
        patients.add(newPatient);
        System.out.println("Patient added successfully!");
    }

    public void removePatient() {
        System.out.print("Enter Patient ID to remove: ");
        String patientID = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getPatientID().equals(patientID)) {
                patients.remove(i);
                System.out.println("Patient removed successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Patient not found!");
        }
    }

    public void searchPatient() {
        System.out.print("Enter Patient ID or Name to search: ");
        String searchTerm = scanner.nextLine();

        for (Patient p : patients) {
            if (p.getPatientID().equals(searchTerm) || p.getName().equalsIgnoreCase(searchTerm)) {
                System.out.println("Patient found:");
                p.display();
                return;
            }
        }
        System.out.println("Patient not found!");
    }

    public void updatePatient() {
        
        
        System.out.print("Enter Patient ID to update: ");
        String patientID = scanner.nextLine();

        for (Patient p : patients) {
            if (p.getPatientID().equals(patientID)) {
                System.out.println("Leave field blank to keep current value.");
                
                System.out.print("New Name (current: " + p.getName() + "): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) p.setName(name);

                System.out.print("New Age (current: " + p.getAge() + "): ");
                String ageInput = scanner.nextLine();
                if (!ageInput.isEmpty()) {
                    try {
                        int age = Integer.parseInt(ageInput);
                        p.setAge(age);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input for age! Age not updated.");
                    }
                }

                System.out.print("New Gender (current: " + p.getGender() + "): ");
                String gender = scanner.nextLine();
                if (!gender.isEmpty()) p.setGender(gender);

                System.out.print("New Contact Info (current: " + p.getContactInfo() + "): ");
                String contactInfo = scanner.nextLine();
                if (!contactInfo.isEmpty()) p.setContactInfo(contactInfo);

                System.out.print("New Address (current: " + p.getAddress() + "): ");
                String address = scanner.nextLine();
                if (!address.isEmpty()) p.setAddress(address);

                System.out.println("Patient updated successfully!");
                return;
            }
        }
        System.out.println("Patient not found!");
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients in the system.");
        } else {
            System.out.println("Patient List:");
            for (Patient p : patients) {
                p.display();
            }
        }
    }
}

public class Patient {
    public static void main(String[] args) {
        PatientManagementSystem system = new PatientManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============================");
            System.out.println("\nPatient Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Display All Patients");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    system.addPatient();
                    break;
                case "2":
                    system.removePatient();
                    break;
                case "3":
                    system.searchPatient();
                    break;
                case "4":
                    system.updatePatient();
                    break;
                case "5":
                    system.displayAllPatients();
                    break;
                case "6":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
