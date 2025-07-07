import java.util.Arrays;

public class JavaStreams1 {
    public static void main(String[] args) {
        
        // STREAMS in JAVA

        // What is Stream ?
        // Steam simply means a moving path that carries data one by one such that we can work with them. 


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

        // filter() method will check the given condition & if it matches it will keep that data otherwise it will remove that particular data completely.

    }
}
