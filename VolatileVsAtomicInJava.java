import java.util.concurrent.atomic.AtomicInteger;

class SharedResource{

    // Basically this class is mainly used for doing 2 task 
    // 1. Writer Thread makes the flag = true
    // 2. Reader Thread only print the flag value when its true otherwise it will do nothing.

    private volatile boolean flag = false;

    public void makeFlagTrue(){
        System.out.println("Writer Thread made the flag True!");
        flag = true;
    }

    public void printFlagIfTrue(){
        while(!flag){
            // do nothing
        }

        // if True then --> print true
        System.out.println("Flag is True now!");
    }
}

class AtomicCounter{
    // private int counter = 0; // Instead of this 

    private AtomicInteger counter = new AtomicInteger(0); // Do like this

    public void increment(){
        // counter++; 
        counter.incrementAndGet(); // increment the value by 1
    }

    public int getCounter(){
        // return counter;
        return counter.get(); // returns the final result
    }
}

public class VolatileVsAtomicInJava {
    public static void main(String[] args) throws InterruptedException {
        
        /*
         * What is Volatile Keyword in Java ?
         * 
         * Basically Volatile Keyword in Java is used to tell a specific thread not to read any data from it's cache memory rather read any type of updated data directly from the main memory.
         * 
         * But Volatile Keyword is also having it's own disadvantages & we get to know with the help of  Atomicity concept in Java.
         * 
         */

        // Let's create an object of SharedResource class

        SharedResource sharedResourceRef = new SharedResource();

        // Now let's create 2 threads 

        Thread writerThread = new Thread(() -> {
            try{
                Thread.sleep(1000); // Pause for 1 sec
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
            // After a pause of 1 Sec then it will make Flag true
            sharedResourceRef.makeFlagTrue();
        });

        // Since there is a pause of 1 sec therefore CPU will execute the readerThread & it will get stuck inside the wile loop until the Flag is true. This is what we expect ? right !!

        // But it will not happen as we expect because all though we have make the flag true but every Thread is having it's own cache memory & it stores the copy of the local variable. When we try to print it see in its cache memory that flag is still false as a result nothing is printed on the console. 

        // Therefore we have to tell that dont see on your cache memory, directly retrieve it from the main memory & we can do this wil the help of "volatile keyword in Java".

        Thread readerThread = new Thread(() -> {
            sharedResourceRef.printFlagIfTrue();
        });

        // writerThread.start();
        // readerThread.start();


        /*
         * 
         */

        AtomicCounter acRef = new AtomicCounter();
        // Let's create another 2 Threads

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                acRef.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                acRef.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for t1 & t2 Thread to complete its execution fully.
        t1.join();
        t2.join();

        System.out.println(acRef.getCounter());
        // If we do like this then it will give an inconsistent result because both the 2 thread is accessing the same resource at the same time. Therefore to prevent this inconsistency we can use Atomic class in Java

    }
    
}
