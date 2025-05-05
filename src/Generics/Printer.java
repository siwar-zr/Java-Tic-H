package Generics;

public class Printer <T> {
    T objToPrint;

    public Printer(T objToPrint){
        this.objToPrint = objToPrint;
    }

    public void print() {
        System.out.println(objToPrint);
    }
}
