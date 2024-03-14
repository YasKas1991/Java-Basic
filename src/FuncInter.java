

@FunctionalInterface

interface express
{
    void abc(int i);
   
}

// class DemoImp implements Demo
// {
//     public void abc()
//     {
//         System.out.println("in abc");
//     }
// }

public class FuncInter {
    public static void main(String[] args) {

       express obj = i -> System.out.println("I am in void abc "  + i);
                
        obj.abc(5);
        
    }

}

