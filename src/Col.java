import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Col {
    public static void main(String[] args) {

            Map<String, Integer> students = new Hashtable<>();

            students.put("Yaser", 45);
            students.put("Larissa", 100);
            students.put("John", 91);
            students.put("Sarah", 55);

       

            // System.out.println(students.get("Yaser"));
            System.out.println(students.keySet());

            for(String Key : students.keySet()){
                System.out.println("Key" + ":" + students.get(Key));

            }
    }

}
        
    //     Set<Integer>nums = new TreeSet<Integer>();
    //     nums.add(6);
    //     nums.add(8);
    //     nums.add(4);
    //     nums.add(2);
        
    //     // System.out.println(nums.indexOf(5));
    //     // System.out.println(nums.get(2));
    //     Iterator<Integer> values = nums.iterator();
        
    //     while(values.hasNext())
    //     System.out.println(values.next());
    //     // for(int n : nums)
    //     // {
    //     //     // int num = (Integer)n;
    //     //     System.out.println(n);
    //     // }
    //     // System.out.println(nums);
    //     }
    // }


