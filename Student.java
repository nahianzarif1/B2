public class Student {
    private String name;
    private int id;

    public Student() { }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    // Main method to run the program
    public static void main(String[] args) {
        Student s1 = new Student("Nahian", 2107763);
        Student s2 = new Student("Ali", 2107764);

        System.out.println(s1);
        System.out.println(s2);
    }
}