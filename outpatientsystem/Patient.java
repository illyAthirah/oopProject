// Patient.java
public class Patient extends Person {
    private int age;
    private String gender;
    private String address;

    public Patient(int id, String name, String contactInfo) {
        super(id, name, contactInfo);
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Getters and Setters
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Patient: " + super.toString() + ", Age: " + age + ", Gender: " + gender + ", Address: " + address;
    }
}