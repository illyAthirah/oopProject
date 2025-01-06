// Receptionist.java
public class Receptionist extends Person {
    public Receptionist(int id, String name, String contactInfo) {
        super(id, name, contactInfo);
    }

    @Override
    public String toString() {
        return "Receptionist: " + super.toString();
    }
}