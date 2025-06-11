
/*
 * Garbage Collection Example
 */

class Phone{

    String brand, model;

    Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void print(){
        System.out.println("Brand is = " + brand + " &" + " Model is = " + model);
    }

}



public class GarbageCollectionInJava {
    public static void main(String[] args) {
        
        /*
         * To get started with Weak Hash Map, first of all we need to know what is Garbage Collection in Java.
         */

        Phone objectReference = new Phone("Apple", "16 Pro max"); // Here a Object of Phone class is created with the following data inside the heap memory & this objectReference is storing the memory address of this object.

        // Now if we assign null to the objectReference variable

        objectReference = null; // Now it is not pointing or storing the memory address to that specific object. But the object is still remain stored inside the heap memory as a result the JVM comes & see that for this particular object there is no reference or pointer as a result it will deallocate this memory automatically & free up the space. This is known as Garbage Collection in Java. 

        objectReference.print();


        // Weak HashMap is not important as a result we can skip this.


    }
}
