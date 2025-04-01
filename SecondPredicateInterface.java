import java.util.function.BiPredicate;

public class SecondPredicateInterface {
    public static void main(String[] args) {
        
        // Basically Bipredicate is a functional Interface in java that accepts 2 values and then checks whether both the values satisfy both the conditions or not. 
        // If yes then it returns true or else false.
        // Basically Bipredicate is same as predicate Interface but the difference is it accepts 2 values only whereas predicate accepts only 1 value.

        BiPredicate<Integer, Integer> isEven = (x, y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(isEven.test(2, 4));

    }
}
