import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        
        Employee employee = () -> "Software Engineer";

        // Since Employee Interface is having a single abstarct method therefore we can use that particular method directly by using the lamda expression instead of creating a seperate implementation class for it.

        System.out.println(employee.getName());


        // How to use lamda expression to create thread using Runnable Interface ?

        // Since Runnable interface is having only a single abstract method only therefore we don't need to write a seperate implementation class for it, we can directly use lamda expression to invoke this method.

        Runnable runnable = () -> {
            for(int i = 1; i<=10; i++){
                System.out.print(i + " ");
            }
        };

        Thread myThread = new Thread(runnable);
        myThread.run();


        System.out.println();

        // How to use Comparator using lamda expression 
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(8);

       // Collections.sort(list); // Normal sorting order,
        // But now if we want our custom sorting order than we can use Comparator class in java
        // Where (a - b) = natural sorting order(i.e. Ascending order) & (b - a) = descending sorting order

        Collections.sort(list, (a, b) -> b - a );

        System.out.println(list);


        // Predicate Interface in java 

        // Basically Predicate is a Boolean valued function that returns true or false based on the condition given.
        // Basically Predicate holds a condition only
        
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(13));

        Predicate<String> startsWithLetterV = (str) -> str.toLowerCase().charAt(0) == 'v';
        Predicate<String> endsWithLetterL = (str) -> str.toLowerCase().charAt(str.length() -1) == 'l';

        Predicate<String> andOperation = startsWithLetterV.and(endsWithLetterL); // Basically this andOperation Predicate is the combination of startsWithLetterV and endsWithLetterL predicate.
        // That means both the condition must satisfy this condtion 
        // Other Predicates also there (i.e. or and negate)
        System.out.println(andOperation.test("Vishal")); 

    }
}