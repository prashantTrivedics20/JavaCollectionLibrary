package GenericTutorial;

import  java.util.*;
public class Generic {
    public static void main(String[] args) {
        int value=5;
        List values=new ArrayList();// by default type is Object type -- Because we are all know that Object is super class of
//        // every child class it can contains  the reference of any type...
//        values.add("prashant");
//        values.add(5);
//        System.out.println(values);
        // but if you want to type safety then instead of we use Generic concept
        //List<Integer>values=new ArrayList<Integer>(); // by default type is Object type -- Because we are all know that Object is super class of
        // every child class it can contains  the reference of any type...
        // in 1.2 version we have introduced the concept Collection
        // in 1.5 version we have introduced the concept of Generic- List<Integer>values=new ArrayList<Integer>();
        // int 1.7 version we have introdused this type of representation List<Integer>values=new ArrayList<>();
        values.add(5);
        values.add(6);
        values.add(9);
        values.add("hello");
        int i=Integer.parseInt(values.get(3).toString());// it will give the number Formate exception
        // it will expected integer but we have provided it String
        System.out.println(i);
        System.out.println(values);
    }
}
