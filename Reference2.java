import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Students{

    private String name;

    public Students(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class Reference2 {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "BoB", "Jack");

        names.stream().map(x -> new Students(x)).collect(Collectors.toList());
        // Basically here we are converting the list into stream(). For the time being stream means we have converted this list into a certain thing such that we can perform many different types of operations on this list.

        // What is map() method ? --> Map method is mainly used when we want to transform the data into some another data. Map method takes Function interface as a parameter.

        // Here we are using map method because here we need to transform the data (i.e. Converting the names into an Object of Student class)

        // x -> new Students(x)  =  this lamda expression will take each an every indivisual student name as an input and make a new Object of the Student class for every indivisual data (i.e. Alice, Bob, Jack) inside the heap memory. 

        // collect() method will collect all those transformed data & then it will be stored inside a particular list by passing Collectors.toList() method as a parameter to the collect method.

        // Behind the Scene for this statement is:

        /*
         * map(x -> new Students(x))
         * 
         * Function<String, Students> f = (name) -> {
         *      Students sObj = new Students(name);
         *      return sObj;
         * }
         * 
         * System.out.println(f.apply("Alice"))
         * 
         * String = input Type
         * Students = Output Type (i.e. It will return a reference of the Students class Object)
         */
        

        List<Students> students2 = names.stream().map(Students::new).collect(Collectors.toList()); 
        // Since we know constructor reference in java therefore we can replace the lamda expression with constructor reference.

        // (Students::new) means --> Go to the Students Class & then refer to the Constructor of the Students class. (i.e. ::new means = Constructor of the Students class will be called)

        // It is just like this = new Students()

        // 1st Argument = Which Class :: 2nd Argument = which method we need to invoke  


        System.out.println(students2);




    }
}
