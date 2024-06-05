// package margaya.college_walllah_HashMap;

import java.util.HashMap;
import java.util.Map;

public class lecture_60_hashmap {
    public static void main(String[] args) {
        Map<String,Integer> ob=new HashMap<>() ;//name,age

        //Inserting values in form of key and value
        ob.put("ayan",23);
        ob.put("pintu",27);
        ob.put("piku",30);
        ob.put("totan",33);
        ob.put("khuku",34);
        ob.put("papan",4);
        ob.put("bharu",30);

        //printing  the sets
        System.out.println(ob.entrySet());
        //updating the value
        ob.put("papan",5);
        System.out.println(ob.entrySet());


        //deleting the values
        //ob.remove()-->deletes data if present in map, and return type is boolean
        ob.remove("papan",7);//***VVI-->it will not delete as in the map there is no "papan" with value 7, if we try
        //to print it it will give false
        System.out.println(ob.remove("papan",7));//-->this will give false
        System.out.println(ob.remove("papan",5));//this will delete and give true,as it exists in map
        System.out.println(ob.remove("bharu"));//we can also delete with just "key", if exist it will delete without checking the value
        System.out.println(ob.entrySet());

        //if contains
        System.out.println(ob.containsKey("alo"));//check for key
        System.out.println(ob.containsValue(30));//check for value
        System.out.println(ob.containsKey("papu"));

        //generates hascode for the hashmap
        System.out.println(ob.hashCode());


        //puts if key is only absent
        ob.putIfAbsent("pintu",100);
        ob.putIfAbsent("alo",16);
        System.out.println(ob.entrySet());

        //gives the size of the hasmap
        System.out.println(ob.size());

        //prints only the values
        System.out.println(ob.values());

        //prints only the keys
        System.out.println(ob.keySet());

        //gives boolean value if empty or not
        System.out.println(ob.isEmpty());

        //gives the value according to the key, if not exists then returs null
        System.out.println(ob.get("piku"));
        System.out.println(ob.get("kirmada"));

       //traversing all entries -- multiple methods
        for(String key:ob.keySet()){
            System.out.print(key+"--"+ob.get(key)+"   ");
        }

        System.out.println();
        for(Map.Entry<String, Integer> entry :ob.entrySet()){
            System.out.print(entry+" ");
        }

        //for convinient use from java 8 in for-each loop there is use var
        System.out.println();
        for(var e:ob.entrySet()){
            System.out.print(e+" ");
        }


    }
}
