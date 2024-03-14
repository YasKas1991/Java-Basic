
// class Print implements Runnable{

//     public void run() {

//         for (int i = 0; i <=10; i++)
//         {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }   
//         }
//     }
// }
// class C implements Runnable{
// public void run() {

//     for (int i = 0; i <=10; i++)
//     {
//         System.out.println("Hello");
    
//         try { 

      
//         Thread.sleep(10);
//         } catch (InterruptedException e) 
//           {e.printStackTrace();}
//     }
// }
// }

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}

public class MultiThread {
public static void main(String[] args) throws InterruptedException {

    Counter c = new Counter();

    Runnable obj = () -> {
    for (int i = 0; i <=1000; i++)

        {
           
            c.increment();
            // System.out.println("hi");
            // try {
            //     Thread.sleep(10);
            // } catch (InterruptedException e) {

            //     e.printStackTrace();
            // }   
        }
        };

    Runnable obj1 = () -> {
        for (int i = 0; i <=1000; i++)
            {

                c.increment();
                // System.out.println("hi");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {
    
                //     e.printStackTrace();
                // }
            }
        };
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj1);

    t1.start();
    t2.start();
    // t1.setPriority(Thread.MAX_PRIORITY);
    t1.join();
    t2.join();
    System.out.println(c.count);
}
}


    // obj.start();
    // try {
    //     Thread.sleep(5);
    // } catch (InterruptedException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }
    // obj1.start();
   
    // System.out.println(obj.getPriority());
    // obj1.setPriority(Thread.MAX_PRIORITY);
    
// }
// }
