import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_In_Collection_Framework {
    public static void main(String[] args) {
        
        /*
         * "Copy" on "Write" means that whenever a write operation is happened 
         * 
         * Like adding or removing then,
         * 
         * instead of directly modifying the existing list
         * 
         * a new copy of the existing list is created & modification is applied to that copy only.
         * 
         * This ensures that the other threads reading the list while it's being modified is uneffected.
         * 
         * Read Operations: It is fast and direct, since they happen on a stable list without interferring from any kind of modifications.
         * 
         * Write Operations: A new Copy of list is created for every modifications.
         * 
         * Then the reference to the Original List is then updated such that in read operations it uses the new updated list.
         * 
         * 
         * Note: It should be used when there is high read Operations and less write Operations
         * 
         * 
         */

        //  Declaration of Copy On write ArrayList

        // CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // Example

        // List<String> items = new ArrayList<>();

        List<String> items = new CopyOnWriteArrayList<>();

        items.add("Milk");
        items.add("Bread");
        items.add("Eggs");

        // By Iterating we are reading and updating at the same time in the ArrayList then,
        // As a result it throws an exception because the arraylist is updating & it is not stable
        // That's why we use CopyOnWriteArrayList

        for(String element : items){
            System.out.println(element);
            // Try to modify the list while reading
            if(element.equals("Eggs")){
                // When we used CopyOnWriteArrayList a new copy is created and modification is done there, but reading is happening
                // on the old arrayList itself
                items.add("Butter");
                System.out.println("Adding Butter to the List");
            }

        }

        // After completion of the entire loop, new modified list is updated with the old list 

        System.out.println(items);

    }
}
