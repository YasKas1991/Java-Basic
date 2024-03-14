import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Students implements Comparable<Students> {
    int age;
    String Name;

    public Students(int age, String name) {
        this.age = age;
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", Name='" + Name + '\'' + '}';
    }

    @Override
    public int compareTo(Students that) {
        // return 0;

        if(this.age > that.age) 
            return 1;
          else 
              return -1; 
        
    
    }
}
public class Sort {

    public static void main(String[] args) {
       

        Comparator <Students> com =  (i,j) -> i.age > j.age? 1:-1;
        //  if(i.age > j.age) 
        //     return 1;
        //   else 
        //       return -1;
         
        

        List<Students> studs = new ArrayList<>();
        studs.add(new Students(16, "Harry"));
        studs.add(new Students(18, "Leyth"));
        studs.add(new Students(22, "Imogen"));
        studs.add(new Students(19, "John"));

        Collections.sort(studs);

        for(Students s : studs)
        System.out.println(s);

    }

}
