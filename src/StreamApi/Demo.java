package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(4,5,7,6,3,2);

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2==0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int result = s3.reduce(0,(c,e) -> c+e);


//        int result = nums.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * 2)
//                .reduce(0, (c, e) -> c + e);


        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();

        sortedValues.forEach(n -> System.out.println(n));

        //s3.forEach(n -> System.out.println(n));


        //System.out.println(nums);

//        for(int n : nums){
//            System.out.println(n);
//        }


//        int sum =0;
//        for(int n : nums){
//            if (n%2==0){
//                n = n*2;
//                sum = sum+n;
//            }
//        }
//        System.out.println(sum);
    }

}
