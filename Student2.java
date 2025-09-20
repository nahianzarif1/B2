public class Student2 {
    private String name;
    private int id;

    // Default constructor
    public Student2() {}

    // Parameterized constructor
    public Student2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of Student2 using the parameterized constructor
        Student2 s1 = new Student2("John Doe", 123);

        // Printing the details of the student
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student ID: " + s1.getId());
    }
}
