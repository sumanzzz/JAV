public class GenreicMethods {

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array of Integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        // Array of Strings
        String[] stringArray = {"Hello", "Generic", "Method"};
        System.out.print("String Array: ");
        printArray(stringArray);

        // Array of Doubles
        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.print("Double Array: ");
        printArray(doubleArray);
    }
}
