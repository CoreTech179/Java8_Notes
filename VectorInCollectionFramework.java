import java.util.Vector;

public class VectorInCollectionFramework {
    public static void main(String[] args) {
        
        /*
         * Constructors of Vectors
         * 
         * 1. Vector(): Creates a vector with initial capacity as 10
         * 
         * 2. Vector(int initialCapacity): Creates a Vector with a specified initial Capacity.
         * 
         * 3. Vector(int initialCapacity, int capacityIncrement) : Creates a Vector with initial capacity & growth factor (i.e. how much the Vector should increase its size when the capacity is full)
         * 
         * 4. Vector(Collection): Creates a Vector containing the elements of the specified collection.
         * 
         */

         /*
          * Declaration of Vectors
          */

        Vector<Integer> vector = new Vector<>(3, 3); // initial capacity is 10

        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println(vector.capacity());
        
        vector.add(40);

        System.out.println(vector.capacity());

        // In Vector all the methods are same as ArrayList
        // i.e. add, remove, isEmpty, contains, set, size, get,....., etc.
    }
}
