import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer number1, Integer number2){
        // return number1 - number2; // Default sorting order (ex. number1 = 5 and number2 = 3 ==> 5-3 = 2 (+ve) ==> descending order)
        return number2 - number1; // ascending order (ex. number1 = 3 & number2 = 5 --> 3-5 = -2 (-ve) ==> ascending order)
    }

    // The integer number that is going to be returned from this compare function will tell about the relative ordering between the 2 numbers

    /*
     * If the returned value is (-ve) than number1 comes 1st & then number2
     * 
     * else if the returned value is (0) than both the number1 & number2 are equal
     * 
     * else if the returned value is (+ve) than number2 comes 1st & then number1
     */
}


class StringComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){

        // For descending order the returned value must be -ve
        // return s1.length() - s2.length();

        // For ascending order the returned value must be +ve
        return s2.length() - s1.length();
    }
}

public class ComparatorInArrayList {

    public static void main(String[] args) {
        
        /*
         * Comparator In ArrayList
         * 
         */

        
        List<Integer> numberList = new ArrayList<>();

        numberList.add(30);
        numberList.add(20);
        numberList.add(10);

        // Suppose we want to sort the numbers and we do this

        // numberList.sort(null); // What does sort(null) means --> It means sort the numbers in descending order (i.e. Natural order of Sorting).
        // This sort() method is taking a comparator and it is a interface in java

        /*
         *  If we want to perform our custom sorting order then we have to write our own custom sorting logic inside the Comparator.
         *  
         * Since it is an Interface in java therefore a class must implements this interface to use the Comparator
         * 
         */

        // numberList.sort(new MyComparator()); // Here also instead of doing like this we can directly use lamda expression

        numberList.sort((a, b) -> b - a);

        System.out.println(numberList);



        // Now let's got for the Strings 

       List<String> stringList = Arrays.asList("Ok", "Bye", "Hello");

    //    Now we want to sort the Strings according to the length, therefore we have to define Comparator for it

        // stringList.sort(new StringComparator()); // Instead of creating an another class for Comparator we can directly use lamda expression
        
        stringList.sort((a, b) -> b.length() - a.length());

        System.out.println(stringList);

        // How to remember ascending & descending

        // Descending order means = decreasing order ( 'D' for decreasing )--> i.e. Big to small
        // Ascending order means = increasing order --> i.e. small to Big
    }
}
