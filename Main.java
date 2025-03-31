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

    }
}