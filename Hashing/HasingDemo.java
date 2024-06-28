package Hashing;
import java.util.*;

public class HasingDemo {
    public static void main(String[] args){
        Map<String, Integer> mp = new HashMap<>();

        mp.put("Nilesh", 20);
        mp.put("Kom", 45);
        mp.put("dan", 74);

        System.out.println(mp.get("Nilesh"));
        System.out.println(mp.get("rahul"));

// changing the value
        mp.put("Kom", 25);
        System.out.println(mp.get("Kom"));


        // removing the pair from the hashmap

         System.out.println( mp.remove("Nilesh"));
        System.out.println(mp.remove("riya"));

        // checking the key exist in the hashmap;
        System.out.println(mp.containsKey("Nilesh"));
        System.out.println(mp.containsKey("Kom"));


        // get all the key in the HashMap;

        System.out.println(mp.keySet());
        // get the value in the hashMap;
        System.out.println(mp.values());

        // get all the entries in the hashmap;

        System.out.println(mp.entrySet());

        // traversin the hasMap;


        for(String key: mp.keySet()){
            System.out.printf("age of %s %d\n", key,mp.get(key));
        }


        System.out.println();

        for(Map.Entry<String,Integer>  e : mp.entrySet()){
            System.out.printf("The age of %s is %d\n", e.getKey(), e.getValue());
        }











   
    }
    
}
