import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        try {
          
          int num = sc.nextInt();
            System.out.println(num);
          
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // int num = Integer.parseInt(br.readLine());
            // System.out.println(num);    br.close();
        }

        catch(Exception e) {
           System.out.println("Invalid input. Please Enter a number.");
        }
        

    }
}










// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.BufferedReader;

// public class UserInput {

//     public static void main(String[] args) {

//         System.out.println("Enter a number");
//         try {
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             int num = Integer.parseInt(br.readLine()); // Corrected ParseInt to parseInt
//             System.out.println( + num);
//         }
//         catch(IOException e) {
//             System.out.println("Error reading input");
//         }
//     }
// }


