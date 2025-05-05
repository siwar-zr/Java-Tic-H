package CollectionApi;

import java.util.HashMap;
import java.util.Map;

public class MapExemple {

    public static void main(String[] args){

        Map<String,Integer> students = new HashMap<>();

        students.put("Ali",10);
        students.put("Med",18);
        students.put("Sonia",16);
        students.put("Ahmed",12);

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key +" : "+ students.get(key));
        }

        //System.out.println(students);
    }
}
