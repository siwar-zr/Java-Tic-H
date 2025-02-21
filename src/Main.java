import models.Calculatrice;
import models.Human;
import models.Mobile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Calculatrice calc = new Calculatrice();
        calc.n1 = 5;
        calc.n2 = 6;
        int res = calc.add();
        int res1 = calc.add(3,6);
        double res2 = calc.add(3.4,1);
        double res3 = calc.add(3,6);

        System.out.println(res+" "+res1+" "+res2+" "+res3);*/

        /*Mobile.category = "Smartphone";
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        //m1.category = "Smartphone";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1800;
        //m2.category = "Phone";




        m1.show();
        m2.show();
        Mobile.show1(m1);*/

        Human h1 = new Human(26,"Ali");
        h1.setAge(30);
        h1.setName("Mouhamed");

        System.out.println(h1.getAge());
    }
}