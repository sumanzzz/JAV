class Rectangle {
    int length;
    int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method that takes another Rectangle object as a parameter
    public void copy(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class ObjectAsParameter {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);  // Create the first rectangle
        Rectangle r2 = new Rectangle(0, 0);  // Create another rectangle with default values

        System.out.println("Before copying:");
        r2.display();

        // Copy values from r1 to r2
        r2.copy(r1);

        System.out.println("After copying:");
        r2.display();
    }
}
