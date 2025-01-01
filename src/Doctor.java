
package doctor;

import java.util.Scanner;

public class Doctor {
    private int doctorID;
    private String name;
    private String specialty;
    private String contactInfo;
    private boolean availability;

    // Constructor
    public Doctor(int doctorID, String name, String specialty, String contactInfo, boolean availability) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialty = specialty;
        this.contactInfo = contactInfo;
        this.availability = availability;
    }

    // Getters and Setters
    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Method to display doctor information
    public void displayDoctorInfo() {
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    // Method to input doctor details from user
    public static Doctor inputDoctorDetails() {
        Scanner scanner = new Scanner(System.in);
        int doctorID = -1;
        String name = "";
        String specialty = "";
        String contactInfo = "";
        boolean availability = false;

        // Input Doctor ID
        while (true) {
            System.out.print("Enter Doctor ID (positive integer): ");
            if (scanner.hasNextInt()) {
                doctorID = scanner.nextInt();
                if (doctorID > 0) {
                    break; // Valid input
                } else {
                    System.out.println("Invalid input. Doctor ID must be a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.nextLine();  // Consume the newline

        // Input Name
        while (true) {
            System.out.print("Enter Name: ");
            name = scanner.nextLine();
            if (!name.trim().isEmpty()) {
                break; // Valid input
            } else {
                System.out.println("Invalid input. Name cannot be empty.");
            }
        }

        // Input Specialty
        while (true) {
            System.out.print("Enter Specialty: ");
            specialty = scanner.nextLine();
            if (!specialty.trim().isEmpty()) {
                break; // Valid input
            } else {
                System.out.println("Invalid input. Specialty cannot be empty.");
            }
        }

        // Input Contact Info
        while (true) {
            System.out.print("Enter Contact Info: ");
            contactInfo = scanner.nextLine();
            if (!contactInfo.trim().isEmpty()) {
                break; // Valid input
            } else {
                System.out.println("Invalid input. Contact Info cannot be empty.");
            }
        }

        // Input Availability
        while (true) {
            System.out.print("Is the doctor available? (true/false): ");
            if (scanner.hasNextBoolean()) {
                availability = scanner.nextBoolean();
                break; // Valid input
            } else {
                System.out.println("Invalid input. Please enter true or false.");
                scanner.next(); // Clear invalid input
            }
        }

        // Create and return a new Doctor object
        return new Doctor(doctorID, name, specialty, contactInfo, availability);
    }

    // Method to edit doctor details
    public void editDoctorDetails() {
        Scanner scanner = new Scanner(System.in);
        
                // Ask if the user wants to make changes
        System.out.print("\nDo you want to make any changes to the doctor details? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();

        if (!response.equals("yes")) {
            System.out.println("Exiting the editing process.");
            return; // Exit the method if the user does not want to make changes
        }

        boolean continueEditing = true;

        while (continueEditing) {
            System.out.println("\nWhat would you like to change?");
            System.out.println("1. Specialty");
            System.out.println("2. Contact Info");
            System.out.println("3. Availability");
            System.out.println("4. Exit editing");
            System.out.print("Enter your choice (1-4): ");
            int choice = -1;

            // Validate user input for menu choice
            while (true) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        break; // Valid input
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Clear invalid input
                }
            }
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Change Specialty
                    System.out.print("Enter new Specialty: ");
                    String newSpecialty = scanner.nextLine();
                    if (!newSpecialty.trim().isEmpty()) {
                        setSpecialty(newSpecialty);
                    } else {
                        System.out.println("Specialty cannot be empty. No changes made.");
                    }
                    break;

                case 2: // Change Contact Info
                    System.out.print("Enter new Contact Info: ");
                    String newContactInfo = scanner.nextLine();
                    if (!newContactInfo.trim().isEmpty()) {
                        setContactInfo(newContactInfo);
                    } else {
                        System.out.println("Contact Info cannot be empty. No changes made.");
                    }
                    break;

                case 3: // Change Availability
                    System.out.print("Is the doctor available? (true/false): ");
                    if (scanner.hasNextBoolean()) {
                        setAvailability(scanner.nextBoolean());
                    } else {
                        System.out.println("Invalid input. Availability remains unchanged.");
                        scanner.next(); // Clear invalid input
                    }
                    break;

                case 4: // Exit editing
                    continueEditing = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Display updated doctor information after each change
            System.out.println("\nUpdated Doctor Information:");
            displayDoctorInfo();
        }
    }

    public static void main(String[] args) {
        // Get input from the user
        Doctor doctor = inputDoctorDetails();
        
        // Add a new line before displaying the doctor information
        System.out.println(); // New line for better readability
        
        // Display the doctor information
        doctor.displayDoctorInfo();

        // Edit doctor details
        doctor.editDoctorDetails();

        // Final display of the updated doctor information
        System.out.println(); // New line for better readability
        System.out.println("Final Doctor Information:");
        doctor.displayDoctorInfo();
    }
}
