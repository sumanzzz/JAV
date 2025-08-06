class Student {
    String name;
    int age;
    String course;

    // Constructor with no parameters
    public Student() {
        name = "Unknown";
        age = 0;
        course = "Not enrolled";
    }

    // Constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not enrolled";
    }

    // Constructor with all three parameters
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class OverloadingConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();                          // Calls the no-argument constructor
        Student s2 = new Student("Alice", 20);               // Calls the constructor with two parameters
        Student s3 = new Student("Bob", 22, "Mathematics");  // Calls the constructor with three parameters

        s1.display();
        s2.display();
        s3.display();
    }
}
