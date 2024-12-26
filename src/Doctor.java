/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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

    public boolean isAvailability() {
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
        
        // Get doctor details from user
        System.out.print("Enter Doctor ID: ");
        int doctorID = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Specialty: ");
        String specialty = scanner.nextLine();
        
        System.out.print("Enter Contact Info: ");
        String contactInfo = scanner.nextLine();
        
        System.out.print("Is the doctor available? (true/false): ");
        boolean availability = scanner.nextBoolean();
        
        // Create and return a new Doctor object
        return new Doctor(doctorID, name, specialty, contactInfo, availability);
    }

    public static void main(String[] args) {
        // Get input from the user
        Doctor doctor = inputDoctorDetails();
        
        // Display the doctor information
        doctor.displayDoctorInfo();
    }
}
