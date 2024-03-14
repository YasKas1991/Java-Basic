

interface Inter {

    int age = 32; // public static final int age = 32;
    String Location = "London"; // public static final String Location = "Bangalore";
    void show();
    void display();

}

interface Inter2 {
    void score();
}

class B implements Inter, Inter2{
    public void show() {
        System.out.println("In B show method");
    }

    public void display() {
        System.out.println("In B display method");
    }

    public void score() {
        System.out.println("In B score method");
    }
}



public class InterDemo {
    public static void main(String[] args) {
       
        Inter obj;
        obj = new B();
        obj.show();
        obj.display();
        Inter2 obj2;
        obj2 = new B();
        obj2.score();

        System.out.println("Age: " + Inter.age);
        System.out.println("Location: " + Inter.Location);
}
}