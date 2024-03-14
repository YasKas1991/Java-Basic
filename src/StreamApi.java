import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
public static void main(String[] args) {

  
    
    List<Integer> nums = Arrays.asList(4,5,7,3,2,6);


    Stream<Integer> sortedValues = nums.stream()
                                .filter(n ->n%2==0)
                                .sorted();

    sortedValues.forEach(n -> System.out.println(n));
    
    // Predicate<Integer> p = n -> n%2==0; //how filter works
    
    // {

    //     // @Override
    //     // public boolean test(Integer n) {
            
    //         // return n%2==0;
    //         // if(n%2==0)
    //         // return true;
    //         // else
    //         // return false;
    //     }};


    // int result = nums.stream()
    //                 .filter(p)
    //                 .map(n -> n*2)
    //                 .reduce(0,(c,e) -> c+e);

    //                 System.out.println(result);


    // Stream<Integer> s1 = nums.stream();
    // Stream<Integer> s2 = s1.filter(n -> n%2==0);
    // Stream<Integer> s3 = s2.map(n -> n*2);
        // public void accept (Integer n){

            // System.out.println(n);

        // }

        // int result = s3.reduce(0, (c,e) -> c+e);
        // System.out.println(result);
        // s3.forEach(n ->  System.out.println(n));
        
    // nums.forEach(n -> System.out.println(n)); 
    // // int sum = 0;
    // for (int n : nums)
    // {
    //     if (n%2==0){
    //         n = n*2;
    //         sum = sum +n;
    //     }
    // }
    // System.out.println(sum);
}

}
