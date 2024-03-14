

class A {

    public void show(){
        System.out.println("In A");
    }

    // static class  B {
    //     public void Config(){
    //         System.out.println("Config B");
    //     }
    // }
}

public class Demo{
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In B");
            }
        };
        obj.show();

       
    }
}
// class A
// {
//     public void show1()
//     {
//         System.out.println("In A");
//     }
// }

// class B extends A
// {
//     public void show2()
//     {
//         System.out.println("In B");
//     }
// }

// public class Demo
// {
// public static void main(String[] args) {
//     A obj = new B(); //Upcasting
//     obj.show1();

//     B obj1 = (B)obj;
//     obj1.show2(); //Downcasting
//     }
// }   




// class Laptop {

//     String name;
//     int price;

//     public Laptop(int price, String name){
//         this.price = price;
//         this.name = name;
//     }

//     // public String toString(){
//     //     return name + " " + price;
//     // }

//    @Override
//     public String toString() {
//         return "Laptop [name=" + name + ", price=" + price + "]";
//     }



// public boolean equals(Laptop that)
//    {if (this.price == that.price && this.name.equals(that.name))
//    {
//        return true;
//    }
//    else
//    {
//        return false;
//    }
   
// }

// @Override
// public int hashCode() {
//     final int prime = 31;
//     int result = 1;
//     result = prime * result + ((name == null) ? 0 : name.hashCode());
//     result = prime * result + price;
//     return result;
// }

// @Override
// public boolean equals(Object obj) {
//     if (this == obj)
//         return true;
//     if (obj == null)
//         return false;
//     if (getClass() != obj.getClass())
//         return false;
//     Laptop other = (Laptop) obj;
//     if (name == null) {
//         if (other.name != null)
//             return false;
//     } else if (!name.equals(other.name))
//         return false;
//     if (price != other.price)
//         return false;
//     return true;
// }
// }

// public class Demo{
//     public static void main(String[] args) {
//         Laptop l1 = new Laptop(1000, "Dell");
//         Laptop l2 = new Laptop(1000, "Dell");
        
//         boolean result = l1.equals(l2);
        
//         System.out.println(result);
        
//     }
// }


// class Calc {

//     public final void show(){
//         System.out.println("In calc Show");

//     }

//     public void add(int a, int b){
//         System.out.println(a+b);
//     }

// }




// public class Demo{

//    public static void main(String[] args) {

//     Calc obj = new Calc();
//     obj.show();
//     obj.add(5, 6); 
//    }
    
// }
