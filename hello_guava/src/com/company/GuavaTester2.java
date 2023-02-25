package com.company;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class GuavaTester2 {
    public static void main(String args[]){

        //Multimap<String,String> multimap = ArrayListMultimap.create();
        Multimap<String,String> multimap = ArrayListMultimap.create();

        //Multimap<String,String> multimap = new Multimap();
        //java: com.google.common.collect.Multimap是抽象的; 无法实例化

        multimap.put("lower", "a");
        multimap.put("lower", "b");
        multimap.put("lower", "c");
        multimap.put("lower", "d");
        multimap.put("lower", "e");

        multimap.put("upper", "A");
        multimap.put("upper", "B");
        multimap.put("upper", "C");
        multimap.put("upper", "D");

        System.out.println(multimap);


        Multimap<String, String> multimap2 = ArrayListMultimap.create();
        multimap2.put("name", "Jack");
        multimap2.put("name", "Jack");
        multimap2.put("name", "Tom");
        multimap2.put("age", "10");
        multimap2.put("age", "12");
        System.out.println(multimap2);
        System.out.println(multimap2.get("name").size());




    }
}


