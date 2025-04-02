import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamOperation {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 5, 0, 0, 1, 6, 4, 9, 250, 455);

        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        // Filter will filter the list as per the conditon and those who matches the filter condition that number will be collected through collect method and convert back it to list using Collectors.toList() method.

        System.out.println(filteredList);


        // map() method

        // Basically this map method will perform a particular task by using a function that is defined using the lamda expression and then collect all those numbers and make a new updated list.
        List<Integer> newList = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(newList);


        // These 2 methods can be applied on a single line itself
        List<Integer> singleLineFilteredList = list.stream()
        .filter(x -> x % 2 == 0)
        .map(x -> x / 2)
        .distinct()
        .sorted()
        .peek(x -> System.out.println(x))
        .collect(Collectors.toList());
        System.out.println(singleLineFilteredList);

        // Now if we don't want repetation we can use distinct function on the above same line.
        // Now if we want all the numbers to be in sorted order we can use it by using the sorted() function.

        // But if we want our custom sorting order than we can pass a Comparator to it (i.e. (a, b) -> b - a ) , where a-b = default sorting order (i.e. smaller to bigger number) & b - a = descending order (i.e. bigger to smaller) 

        // limit() = limit means how many elements do you want from the starting position
        // skip() = skip means how many elemets you want to remove or skip from the starting posiiton
        // peek() = Suppose in the middle position we want to perform a operation (i.e. print the numbers) therefore with the help of peek operation we can do it.

        Integer minNumberFromList = list.stream()
        .filter(x -> x % 2 == 0)
        .map(x -> x / 2)
        .distinct()
        .sorted()
        .min((a, b) -> a - b)
        .get();

        System.out.println("Minimum element is = "+minNumberFromList);

        Integer maxNumberFromList = list.stream()
        .filter(x -> x % 2 == 0)
        .map(x -> x / 2)
        .distinct()
        .sorted()
        .max((a, b) -> a - b)
        .get();

        System.out.println("Maximum element is = "+maxNumberFromList);

        // To find out minimum element we can do it using the  = min((a, b) -> b - a)) function
        // To find out maximum element we can do it using the  = max((a, b) -> b - a)) function

        Long totalNumberOfElements = list.stream()
        .filter(x -> x % 2 == 0)
        .map(x -> x / 2)
        .distinct()
        .count();

        System.out.println(totalNumberOfElements);
        
        // To count the number of elements we can do it using the = count() function
    }
}
