package models;

public class Mobile {

    public String brand;
    public long price;
    public static String category;

    static{
        System.out.println("In Static Block..");
    }

    public Mobile(){
        System.out.println("In Constructor..");
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+category);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand+" : "+obj.price+" : "+category);
    }

}
