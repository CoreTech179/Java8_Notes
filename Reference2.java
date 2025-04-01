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
        // map() means --> it will map every students and make a new Student using the lamda expression.
        // x -> new Students(x)  =  this lamda expression will take each student name and make a new student using the Student class
        // collect(Collectors.toList()) = this will simply convert it back into the list on the fly

        List<Students> students2 = names.stream().map(Students::new).collect(Collectors.toList()); 
        // Since we know constructor reference therefore we can replace it with constructor reference.
        // (Students::new) this means go to Students class and refer to the Student constructor.

        System.out.println(students2);




    }
}
