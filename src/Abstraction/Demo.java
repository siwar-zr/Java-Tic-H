package Abstraction;

abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("play music..");
    }
}

abstract class Toyota extends Car{
    public void drive() {
        System.out.println("Driving..");
    }
}

class AdvToyota extends Toyota{
    public void fly(){
        System.out.println("Flying..");
    }
}

public class Demo {

    public static void main(String a[]){

        Toyota obj = new AdvToyota();
        obj.drive();
        obj.playMusic();
    }
}
