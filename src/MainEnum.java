enum Laptop {
    HP(1600), Dell(1500), Lenovo(3100), Acer, Asus(670), Apple(1800);

    private int price;

    private Laptop() {
        price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class MainEnum {
    public static void main(String[] args) {

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
        // Laptop lap = Laptop.Apple;
        // System.out.println(lap);
        // System.out.println(lap.getPrice());
        
    }
}

// enum Status { 
//     Deposit, Withdraw, Transfer, Balance, Statement, Exit 
// }





// public class MainEnum {
    
//     public static void main(String[] args) {


//         Status s = Status.Deposit;
//         switch (s) {
//                 case Deposit:
//                 System.out.println("Deposited");
                    
//                     break;
//         // This block is executed if the 's' variable does not match any of the defined cases.
//         // It serves as a catch-all to handle unexpected or unhandled 'Status' enum values,
//         // indicating an error or an invalid state
//                 default:
//                 System.err.println("Invalid");
//                     break;
//         }
        // Status [] ss = Status.values();
        // System.out.println(ss);

        // for (Status s : ss) {
        //     System.out.println(s);
        // }
//     }
// }
