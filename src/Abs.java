
abstract class Car {
    
    public abstract void drive();  

    abstract void Fly();

    public void PlayMusic(){
        System.out.println("Car is stopped");
    }

}

abstract class WagonR extends Car {
   
    
    public void drive(){
        System.out.println("WagonR is driving");
    }

}

class UpdatedWagonR extends WagonR {
    public void Fly(){
        System.out.println("WagonR is flying");
    }
} 




public class Abs {

    public static void main(String[] args) {
        
    

    Car obj = new UpdatedWagonR(); {
    obj.drive();
    obj.PlayMusic();
    obj.Fly();
    }
}

    

}
