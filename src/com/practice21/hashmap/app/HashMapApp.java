package com.practice21.hashmap.app;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        //Object declaration
        HashMap<Integer, String> myHash = new HashMap<Integer, String>();

        //Put string to map
        myHash.put(1,"Ary");
        myHash.put(2,"Christina");
        myHash.put(3,"Alex");

        //Visualize data in map
        for(int i = 0; i <= myHash.size(); i++)
        {
            //Validate if exits key in map
            if(myHash.containsKey(i))
            {
                System.out.println(myHash.get(i));
            }
        }

        //Visualize data in map with map entry
        for(Map.Entry<Integer, String> myMap: myHash.entrySet())
        {
            System.out.println(String.format("The key is: %d, value: %s",myMap.getKey(),myMap.getValue()));
        }


    }
}
