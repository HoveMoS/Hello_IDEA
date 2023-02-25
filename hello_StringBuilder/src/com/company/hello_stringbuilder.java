package com.company;

public class hello_stringbuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder(10);

        sb.append("Run");
        System.out.println(sb);
        //Run

        sb.append("!");
        System.out.println(sb);
        //Run!

        sb.insert(3, ",Java");
        System.out.println(sb);
        //Run,Java!

        sb.delete(3,8);
        System.out.println(sb);
        //Run!

        System.out.println(sb.capacity());
        //10

        System.out.println(sb.length());
        //4

        sb.reverse();
        System.out.println(sb);
        //!nuR
        sb.reverse();

//        sb.replace(1,3, "RR");
//        System.out.println(sb);
        //RRR!
        //sb.replace(1,3, "RRR"); RRRR!
        //sb.replace(1,3, "R"); RR!

        System.out.println(sb.substring(1,2));
        //u
        System.out.println(sb.substring(1));
        //un!

        sb.setLength(15);
        System.out.println(sb.capacity());

        //subSequence
        //lastIndexOf



    }
}
