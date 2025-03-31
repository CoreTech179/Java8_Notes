@FunctionalInterface 
// Basically this annoatation will restrict a user to define another abstract method inside this interface because if someone is already using a lamda expression than it will throw an error.  
public interface MyInterface {

    public void sayHello(); // only 1 single abstarct method
    
    default void sayBye(){
        System.out.println("Bye"); // No boundation on default methods and static methods.
    }

    public static void ok(){
        System.out.println("Ok");
    }
} 
