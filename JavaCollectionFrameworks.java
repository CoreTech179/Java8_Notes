import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCollectionFrameworks {

    public static void main(String[] args) {
        
        /*
            Declaration of ArrayList

            1. List<Integer> list = new ArrayList<>();

            2. ArrayList<Integer> list = new ArrayList<>();


            Both are same, no difference! 

            Note: List class is the Parent class of the ArrayList class 
        
        */ 

        List<Integer> list = new ArrayList<>();

        

        // Adding elements to the List

        list.add(10); // Index - 0
        list.add(20); // Index - 1
        list.add(30); // Index - 2

        // Adding an element to a specific position in the ArrayList

        list.add(2, 40); // Adds 40 to the 2nd position and the element that is already at the 2nd index goes to 3rd index number.

        // setting an element into a particular index number

        list.set(1, 100); // Here element at the index number 1 is replaced with the new element inside the list


        // Add All method in ArrayList

        List<Integer> list2 = List.of(500,600,700);

        list.addAll(list2); // Output: [10, 20, 30, 500, 600, 700]
       
        // Removing an element by Value

        // Case-1:

           List<String> stringList = new ArrayList<>();

            stringList.add("Apple");
            stringList.add("Mango");
            stringList.add("Banana");

        
        stringList.remove("Mango"); // Output: [Apple, Banana]

        // Case-2:

        List<Integer> numberList = new ArrayList<>();

        numberList.add(100);
        numberList.add(200);
        numberList.add(300);

        // Now If we want to remove by element

        // numberList.remove(200); // Then this 200 is acting like an Index number therefore we need to convert it into an Object
        numberList.remove(Integer.valueOf(200)); // Now 200 will be removed from the ArrayList


        // Converting a ArrayList into an Array

        Integer [] numberArray = list.toArray(new Integer[0]); // new Integer[0] is just a convension for creating an entire new array of Integer type.

        // We can write (new Float[0]), (new String[0]), ......,etc. for creating an entire new array of that type.


       /* 
       
            // Accessing elements from the ArrayList

            System.out.println(list.get(0));


            // Printing the size of the ArrayList

            System.out.println(list.size());


            // Loop-wise printing the elements of the ArrayList

            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }


            // We can also run a special type of for-loop & it is only used in collections

            for(int element : list){
                // Here "element" is the data itself of the list
                System.out.println(element);
            }


            // Removing element

            list.remove(20);

            
            // Creating ArrayList on the fly
    
            List<Integer> list = Arrays.asList(1,2,3); // Here we can't add or remove any data from it but yes we can replace element only. It is fixed size array. 
    
            // In new Java versions we can also create a list using List.of() method
    
            List<Integer> list2 = List.of(1,2,3);
    
            // Difference between asList VS .of() method is that, in .of() method we can't replace elements also. It is a unmodifyable list

        */


    }
}