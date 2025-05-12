package GarbageCollector;

class Human{
    public void talk(){
        System.out.println("talking...");
    }
}
public class Demo {
    public static void main(String[] args){
        doStuff();
        System.out.println("Goodbye..");
    }

    private static void doStuff(){
        Human h1 = new Human();
        h1.talk();
        h1 = new Human();
        h1 = null;
    }

}
