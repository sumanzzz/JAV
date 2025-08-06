
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        //Adding elements to the list
        list.add("Apple");
        list.add("banana");
        list.add("cherry");

        //display the list
        System.out.println("ArrayList:"+" "+list);

        //access an element
        System.out.println("element at index 1:"+" "+list.get(1));

        //update a element
        list.set(1, "blueberry");
        System.out.println("Updated list:"+" "+list);

        //Remove an element
        list.remove("Apple");
        System.out.println("after removal:"+" "+list);

        //Iterate through the arraylist
        for(String item:list){
            System.out.println(item);
        }
    }
    
}