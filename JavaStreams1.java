import java.util.Arrays;

public class JavaStreams1 {
    public static void main(String[] args) {
        
        // STREAMS in JAVA

        // What is Stream ?
        // Basically here we convert any type of collections into such a format such that we can perform different types of operations on it.

        // Old Approach of writing a code
        int [] arr = {1, 2, 3, 4};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        System.out.println("Without using stream the sum is = " + sum);


        // New Appoach
        int sum2 = Arrays.stream(arr).filter(x -> x % 2 == 0).sum();
        System.out.println("By using stream the sum is = " + sum2);

        // This approach is a lot better than old approach. No rocket science!

    }
}
