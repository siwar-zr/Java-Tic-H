package Exceptions;

class ZeroResultException extends Exception{
    public ZeroResultException(String ch) {
        super(ch);
    }
}

public class Demo {
    public static void main(String args[]){

        int i = 20;
        int j = 0;

        try{
            j=18/i;
            if (j==0){
                throw new ZeroResultException("The output musn't be 0");
            }
        }
        catch (ZeroResultException e){
            j=18/1;
            System.out.println("That's the default output..." + e);
        }


        System.out.println(j);
        System.out.println("Bye");
    }
}
