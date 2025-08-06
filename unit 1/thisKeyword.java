class Student {
    String name;
    int age;

    // Constructor to initialize instance variables using `this`
    Student(String name, int age) {
        this.name = name; // Refers to the instance variable
        this.age = age;   // Refers to the instance variable
    }

    // Method to display details using `this`
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Calling another constructor using `this`
    Student() {
        this("Default Name", 18); // Calls the parameterized constructor
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        student1.display();

        Student student2 = new Student(); // Calls the default constructor
        student2.display();
    }
}
