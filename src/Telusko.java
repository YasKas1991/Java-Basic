public class Telusko {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        for (int i = 0; i < daysOfWeek.length; i++) { // Use the length of the daysOfWeek array
            System.out.println(daysOfWeek[i]); // Print the current day of the week
            for (int j = 0; j < 24; j++) { // Iterating through 24 hours
                String startHour = String.format("%02d:00", j); // Formatting start hour
                String endHour = String.format("%02d:00", (j + 1) % 24); // Formatting end hour, wrapping to 00:00 after 23:00
                
                System.out.println("    " + startHour + " - " + endHour);
            }
        }
    }
}

