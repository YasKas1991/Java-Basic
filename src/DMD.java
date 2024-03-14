class BankAccount {

    public void accountBenefits(){

        System.out.println("Bank account benefits");
    

}
}
// SavingsAccount.java
class SavingsAccount extends BankAccount {
    @Override
    public void accountBenefits() {
        System.out.println("Saving account: higher interest rate");
    }
}

// CheckingAccount.java
class CheckingAccount extends BankAccount {
    @Override
    public void accountBenefits() {
        System.out.println("Checking account: Daily transactions made easy");
    }
}

// BankDemo.java
public class DMD{
    public static void main(String[] args) {
        BankAccount account1 = new SavingsAccount(); // Upcasting
        BankAccount account2 = new CheckingAccount(); // Upcasting

        account1.accountBenefits(); // Dynamic Method Dispatch
        account2.accountBenefits(); // Dynamic Method Dispatch
    }
}



    // public class SavingsAccount extends BankAccount{

    //     public void accountBenefits(){
    //         System.out.println("Saving account: higher interest rate");
    //     }
    // }

    // public class CheckingAccount extends BankAccount{

    //     public void accountBenefits(){
    //         System.out.println("Checking account:" + "Daily transactions made easy");
    //     }
    // }



    //     public class BankDemo {
    //         public static void main(String[] args) {
    //             BankAccount account1 = new SavingsAccount(); // Upcasting
    //             BankAccount account2 = new CheckingAccount(); // Upcasting
        
    //             account1.accountBenefits(); // Dynamic Method Dispatch
    //             account2.accountBenefits(); // Dynamic Method Dispatch
    //         }
    //     }
        
    //     // public static void main(String[] args) {
            
    //     //     BankAccount account1 = new BankAccount(); // upcasting to super type class
    //     //     BankAccount account2 = new BankAccount(); // upcasting 

    //     //     account1.accountBenefits(); //Dynamic method
    //     //     account2.accountBenefits();
    //     // }
    // }




