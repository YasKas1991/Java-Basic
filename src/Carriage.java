

class Understand{
public void show() throws ClassNotFoundException
{
     {
        Class.forName("drive");
    
    // catch(ClassNotFoundException e)
    // {
    //     System.out.println("Driver not found");
    // }
}
}

public class Carriage{
    static {
        System.out.println("static block");}
    public static void main(String[] args) {
        Understand u = new Understand();
        try {
            u.show();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
        System.out.println("good to go");
    }

}
}

// class YasException extends Exception
// {
//     public YasException(String s)
//     {
//         super(s);
//     }
// }
// public class Except {

//     public static void main(String[] args) {
//         int i = 20,j = 0;
       
//         try
//         {
//             j = 18/i;

//             if (j == 0)
//            throw new YasException("Cannot print due to math error");
            
//         }
//         catch(ArithmeticException e)
//         {
//             j=18/1;
//             System.out.println("Error, cannot divide by zero" + e );
//         }

//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Error, Array out of bounds" + e);
//         }
//         catch (Exception e) {
//             System.out.println("Error, something went wrong" + e);
//         }
//         // finally
//         // {
//         //     System.out.println("in finally");
//         // }

//         System.out.println(j);
//     }
// }
