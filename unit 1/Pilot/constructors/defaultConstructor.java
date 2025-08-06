class Student{
    String name;
    int Age;

    void Student(){
       name = "unknown";
       Age =0;
    }

    void display(){
        System.out.println("Student name:"+" "+name+"\n"+"Student Age:"+" "+Age);
    }
}
class defaultConstructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}