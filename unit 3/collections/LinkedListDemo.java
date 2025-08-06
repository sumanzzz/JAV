import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        //add elements
        list.add(10);
        list.add(30);
        list.add(50);

        //add elements at a specific position
        list.addFirst(40);
        list.addLast(60);

        //display
        System.out.println("Linked List:"+" "+list);

        //access first and last elements
        System.out.println("First element:"+" "+list.getFirst());
        System.out.println("Last element:"+" "+list.getLast());

        //remove elements
        list.removeFirst();
        list.removeLast();
        System.out.println("After Removal:"+" "+list);

        //iterate through linked list


        for(Integer item:list){
            System.out.println(item);
        }

    }
}
