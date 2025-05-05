package CollectionApi;

import java.util.*;

public class Demo {

    public static void main(String a[]){

        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(62);
        nums.add(54);
        nums.add(89);
        nums.add(21);
        //nums.add("5");


        //System.out.println(nums.indexOf(2));

        //System.out.println(nums.get(1));


       Iterator<Integer> values = nums.iterator();
       while(values.hasNext()){
           System.out.println(values.next());
       }



//        for(int n : nums){
//            System.out.println(n);
//        }
    }
}
