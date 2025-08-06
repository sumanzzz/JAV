class Student {
    String name;
    int age;

    // Parameterized Constructor
    public Student(String Name, int Age) {
        name = Name;
        age = Age;
    }

    // Method to display student details
    void display() {
        System.out.println("Student name: " + name + "\nStudent Age: " + age);
    }
}

public class parameterizedConstruc {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Student s1 = new Student("John", 18);
        s1.display();
    }
}
