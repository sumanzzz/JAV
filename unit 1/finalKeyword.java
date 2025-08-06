class Circle {
    // Final variable (constant)
    final double PI = 3.14159;

    double calculateArea(double radius) {
        // PI = 3.14; // Error: Cannot assign a value to final variable
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of Circle: " + circle.calculateArea(5));
    }
}
