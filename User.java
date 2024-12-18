import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    // Default constructor
    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    // Parameterized constructor
    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Method to display user info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}
