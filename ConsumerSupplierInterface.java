import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierInterface {
    public static void main(String[] args) {
        
        // Basically Consumer is a functional Interface in java which is having an accept() method that doesn't return anything because the return type of the abstract method is void but it can take any data as a parameter . 
        // Nothing rocket science !.

        Consumer<List<Integer>> listConsumer1 = (li) ->{
            for(Integer i : li){
                System.out.println(i + 100);
            }
        };

        Consumer<List<Integer>> listConsumer2 = (li) -> {
            for(Integer i : li){
                System.out.println(i);
            }
        };

        // listConsumer.accept(Arrays.asList(1,2,3,4));

        Consumer<List<Integer>> getResult = listConsumer2.andThen(listConsumer1); // Basically in this statement listConsumer2 run 1st and then listConsumer1 runs 2nd.  
        getResult.accept(Arrays.asList(1,2,3,4));




        // Supplier Interface in Java. 
        // Basically it will supply any type of data by returning that type of data. Nothing rocket science.
        Supplier<String> supplier = () -> "returns anything!!";
        System.out.println(supplier.get());

    }
}
