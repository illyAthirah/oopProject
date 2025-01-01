public class Patient {
    private String patientID;
    private String name;
    private int age;
    private String gender;
    private String contactInfo;
    private String address;

    // Constructor with all fields
    public Patient(String patientID, String name, int age, String gender, String contactInfo, String address) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactInfo = contactInfo;
        this.address = address;
    }

    // Constructor with only name (used in Main.java)
    public Patient(String name) {
        this("", name, 0, "", "", "");
    }

    // Getters
    public String getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getAddress() {
        return address;
    }

    // Setters
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

    // Method to display patient details
    public void display() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Address: " + address + "\n");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID='" + patientID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}