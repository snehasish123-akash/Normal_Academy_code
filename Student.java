public class Student {
    private String name;
    private int rollNumber;
    private String department;
    private int graduationYear;

    // Constructor 1: Name and Roll Number
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        printStudentInfo();
    }

    // Constructor 2: Name, Roll Number, and Department
    public Student(String name, int rollNumber, String department) {
        this(name, rollNumber); // Invokes Constructor 1
        this.department = department;
        printStudentInfo();
    }

    // Constructor 3: Name, Roll Number, Department, and Graduation Year
    public Student(String name, int rollNumber, String department, int graduationYear) {
        this(name, rollNumber, department); // Invokes Constructor 2
        this.graduationYear = graduationYear;
        printStudentInfo();
    }

    // Method to print student information
    private void printStudentInfo() {
        System.out.println(name + " " + rollNumber + " " + department + " " + graduationYear);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an object using Constructor 3
        Student student1 = new Student("Akash", 562300, "CSE", 2023);
    }
}
