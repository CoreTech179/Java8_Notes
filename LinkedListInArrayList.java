import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListInArrayList {
    public static void main(String[] args) {
        
        /*
         * Declaration of LinkedList in Java Collection Framework
         */

         LinkedList<Integer> list = new LinkedList<>();

         list.add(10); // Adding element to the Linkedlist
         list.add(20);

        // Add element to the first position of the LinkedList

         list.addFirst(0); // O(1)

        //  Add element to the last position of the LinkedList

         list.addLast(100); // O(1)

        //  retrive an element based on the index number

         list.get(3); // O(n) because we have to traverse from the first node 

        //  retrive first element from the linkedList

         System.out.println(list.getFirst()); // O(1)

        //  retrive last element from the LinkedList

         list.getLast(); // O(1)

        //  Print the LinkedList

         System.out.println(list);

        // Removing an element from the LinkedList

        list.remove(2);

        // Remove Last element & also remove first element

        list.removeLast();

        list.removeFirst();



        /*
         * Creating Linked List on the Fly
         */

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog","Horse"));
    }
}
