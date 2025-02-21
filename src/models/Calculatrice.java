package models;

public class Calculatrice {
    public int n1;
    public int n2;

    public int add(){
        return n1 + n2;
    }

    public int add(int n3, int n4){
        return n1 + n2 + n3 + n4;
    }

    public double add(double n3, int n4){
        return n1 + n2 + n3 + n4;
    }
}
