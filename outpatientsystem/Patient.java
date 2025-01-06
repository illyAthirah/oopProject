// Patient class
public class Patient {
    int patientID;
    String name;
    int age;
    String gender;
    String contactInfo;
    String address;

    Patient(int id, String name, int age, String gender, String contact, String address) {
        this.patientID = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactInfo = contact;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Contact Info: " + contactInfo + ", Address: " + address;
    }
}
