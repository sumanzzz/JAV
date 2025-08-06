// Generic class
class GenericClass<T> {
    private T value;

    // Constructor
    public GenericClass(T value) {
        this.value = value;
    }

    // Getter
    public T getValue() {
        return value;
    }

    // Setter
    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericClassDemo {
    public static void main(String[] args) {
        // Using GenericClass with Integer
        GenericClass<Integer> intObj = new GenericClass<>(42);
        System.out.println("Integer Value: " + intObj.getValue());

        // Using GenericClass with String
        GenericClass<String> stringObj = new GenericClass<>("Hello, Generics!");
        System.out.println("String Value: " + stringObj.getValue());

        // Updating the value
        stringObj.setValue("Updated String");
        System.out.println("Updated String Value: " + stringObj.getValue());
    }
}
