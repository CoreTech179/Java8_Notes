import java.util.Arrays;
import java.util.List;

public class Reference1{

    public static void print(String s){ // The lamda expression that is defined inside the forEach loop below is working same as this method will perform the same thing. Therefore we can replace that lamda expression with :: operator 
        System.out.println(s);
    }

    public static void main(String[] args) {
        
        List<String> students = Arrays.asList("Alice", "BoB", "Jack");

        System.out.println("By simple Lamda expression");

        students.forEach(x -> System.out.println(x)); // This lamda expression will just print the name of the students because forEach loop is taking only a method of Consumer Interface.
        // The Consumer Interface method only consumes element and prints it but it doesn't return anything.

        System.out.println("By using Method reference");

        students.forEach(Reference1::print); // Basically :: operator is known as method reference in java. By using this operator we can refer to any method without invoking it. Hence it makes our code look more cleaner and readable.
        // It can be used in the place of lamda expression
        // (References::print) meaning of this statement is = go to the References class and refer to the print method 

        // Internally how method reference works

        /*
         * for(String x : students){
         * 
         *      Reference1.print(x);
         * 
         * }
         * 
         * --> For Each & every element of the Students List call the print method of the Reference1 class & print the names.
         * 
         */

    }
}
