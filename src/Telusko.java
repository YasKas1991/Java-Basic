public class Telusko {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        for (int i = 0; i < daysOfWeek.length; i++) { // Use the length of the daysOfWeek array
            System.out.println(daysOfWeek[i]); // Print the current day of the week
            for (int j = 0; j < 24; j++) { // Iterating through 24 hours
                String startHour = String.format("%02d:00", j); // Formatting start hour
                String endHour = String.format("%02d:00", (j + 1) % 24); // Formatting end hour, wrapping to 00:00 after 23:00
                
                System.out.println("    " + startHour + " - " + endHour);
                //learning.main(args);
            }
        }
    }
}

class learning{
    public static void main(String[] args) {
        
        //int nums [] = {1,2,3,4,5,6,7,8,9,10} //Array of 10 elements
        

        /*int nums[] = new int[5]; //Array of 5 element
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
       
        nums[0] = 10; //Index off
        int nums[][] = new int[3][3]; //2D array

        System.err.println(nums[0]);*/

        int nums[][] = new int[3][4];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];
       
        
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    nums[i][j] = (int)(Math.random() * 10);
                }
            }
            
            for (int n[]: nums) {
                for (int m: n) {
                    System.out.print(m + " ");
                }
                System.out.println();
            }
    }
}