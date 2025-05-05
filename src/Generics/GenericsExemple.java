package Generics;

public class GenericsExemple {

    public static void main(String[] args){
        Printer<Integer> printer = new Printer<>(24);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(30.5);
        doublePrinter.print();
    }
}
