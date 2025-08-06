class Animal {
    String type = "Animal";

    void sound() {
        System.out.println("Animals make sounds!");
    }
}

class Dog extends Animal {
    String type = "Dog";

    @Override
    void sound() {
        super.sound(); // Call parent class method
        System.out.println("Dog barks!");
    }

    void displayType() {
        System.out.println("Type from Child: " + type);
        System.out.println("Type from Parent: " + super.type); // Access parent class variable
    }

   
}
class superkeyword{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.displayType();
    }
}
