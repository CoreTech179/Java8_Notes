import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierInterface {
    public static void main(String[] args) {
        
        // Basically Consumer is a functional Interface in java that only consumes any type of input and print result. Nothing rocket science.

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
        // Basically it can return anything. Nothing rocket science.
        Supplier<String> supplier = () -> "returns anything!!";
        System.out.println(supplier.get());

    }
}
