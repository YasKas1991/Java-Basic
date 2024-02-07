
class Pathway {
    String brand;
    String certificate;
    int price;
    static String type;



public void display() {
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + certificate);
    System.out.println("Price: " + price);
    System.out.println("Type: " + type);
}


public Pathway() {
    brand = "CFA";
    certificate = "IMC";
    price = 1000;
    type = "Finance";
}
}
public class myDemo {

    public static void main(String a[]) {
        Pathway.type = "Finance"; //Course Pathway

        Pathway p1 = new Pathway();
        p1.brand = "CFA";
        p1.certificate = "IMC";
        p1.price = 1000;

        Pathway p2 = new Pathway();
        p2.brand = "CFA";
        p2.certificate = "Level 1";
        p2.price = 1000;


        p1.display();
        p2.display();
    }
}





// StringBuffer sb = new StringBuffer("Yaser");
        // System.out.println(sb.capacity());
    //     String name = "Yaser";

    //     String name2 = "Yaser";
    //     String name3 = ("Yaser");
        
    //     //new String("Yaser");
    //     System.out.println(name);
    //    // System.out.println(name.hashCode());
    // }