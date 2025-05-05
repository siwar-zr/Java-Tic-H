package Generics;

public class StringPrinter {

    String objToPrint;

    public StringPrinter(String objToPrint){
        this.objToPrint = objToPrint;
    }

    public void print(){
        System.out.println(objToPrint);
    }
}
