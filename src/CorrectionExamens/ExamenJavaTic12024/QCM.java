package CorrectionExamens.ExamenJavaTic12024;


final class A {
    final public void print(){
        System.out.print("Hello");
    }
}

//class B extends A{
//    @Override
//    public void print() {
////        super.print();
////        System.out.println(" Class");
//        System.out.println("Bonjour");
//    }
//}
public class QCM {
    public static void main(String[] args){
//        final int x = 5;
//        x=5;
//        B obj = new B();
//        obj.print();

//        for (int i = 0; i<7 ; i++){
//            if (i == 2)
//                continue;
//            if (i == 5)
//                break;
//            System.out.println(i);
//        }

         int x = 5;
         while (isAvailable(x)){

             System.out.println(x);
             x--;
         }
    }

    public static boolean isAvailable(int x){
        return x-- > 0 ? true : false;
    }
}
