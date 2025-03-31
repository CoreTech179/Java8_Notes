public class Main{
    public static void main(String[] args) {
        
        Employee employee = () -> "Software Engineer";

        // Since Employee Interface is having a single abstarct method therefore we can use that particular method directly by using the lamda expression instead of creating a seperate implementation class for it.

        System.out.println(employee.getName());

    }
}