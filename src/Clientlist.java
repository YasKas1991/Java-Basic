
class Client {
    private String name;
    private int id;
    
    // Constructor to initialize a new Client object
    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // Getter and Setter methods
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}

public class Clientlist {
    public static void main(String[] args) {
        // Creating client objects
        Client client1 = new Client("Alice", 1);
        Client client2 = new Client("Bob", 2);
        Client client3 = new Client("Charlie", 3);
        
        // Example usage
        System.out.println(client1.getName() + " has ID: " + client1.getId());
        System.out.println(client2.getName() + " has ID: " + client2.getId());
        System.out.println(client3.getName() + " has ID: " + client3.getId());
    }
}

























// class Human {
//     private int age = 25;
//     private String name = "Decarrey";    
    
//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     // public void setAge(int age) {
//     //     age = age;
//     // }

//     public void setName(String name) {
//         this.name = name;
//     }
// }
//  public class Demo  {
//     public static void main(String a[]) {
//         Human obj1 = new Human();
//         obj1.setAge(25);
//         obj1.setName("Decarrey");
//         System.out.println(obj1.getName() + " : " + obj1.getAge());
   
   
   
//     }

// }