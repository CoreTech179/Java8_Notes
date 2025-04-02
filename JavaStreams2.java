import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams2 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4);

        // How to create stream ?

        // 1st method (from list)

        Stream<Integer> myStream = list.stream();

        // 2nd method (from array)

        String [] names = {"jack", "charlie", "john"};

        Stream<String> arrayStream = Arrays.stream(names);

        // 3rd method
        Stream<Integer> numberStream = Stream.of(1,2,3,4);

        // 4rd method
        Stream<Integer> newStream = Stream.iterate(0, n -> n + 1).limit(5);
        // this will create a stream of integer numbers starting from 0 to next number and it wil create it by using the lamda expression but this will create a infinite stream of numbers as a result we need to limit it. Therefore we have defined limit(5).
        // This limit(5) will stop generating the numbers beyond number 5

        // 5th method
        Stream.generate(() -> "hello").limit(3); // This will create stream of 3 times "hello" 

    }   
}
