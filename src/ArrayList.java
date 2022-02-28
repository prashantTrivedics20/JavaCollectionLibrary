//import java.util.ArrayList;
import java.util.*;
class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("plum");
        ArrayList<Integer> qty=new ArrayList<>();
        qty.add(10);
        qty.add(20);
        // set Element value
        qty.set(1,30);
        // remove elements from ArrayList
        qty.remove(0);
        fruits.remove("Mango");
        for(String s:fruits)
        {
            System.out.println(s);
        }
        System.out.println(fruits);
        System.out.println(qty);
        // size() of the ArrayList
        System.out.println(fruits.size());
        System.out.println(qty.size());
        // To access the value From the ArrayList we use the get() method
        System.out.println(fruits.get(1));
        // To remove all the elements from the ArrayList we use --> removeAll() method or we can use clear()
        //fruits.removeAll(fruits);// fruits.removeAll( object of ArrayList)
        fruits.clear();
        System.out.println(fruits.size());
        System.out.println(qty.isEmpty());// to check the ArrayList is empty or not use -> isEmpty() method
        System.out.println(fruits.isEmpty());
        // copy all elements to another ArrayList we use -> addAll()
        ArrayList<Integer> qty1=new ArrayList<>();
        qty1.addAll(qty);
        System.out.println("After copying the ArrayList ");
        System.out.println(qty1);
        // how to reverse a ArrayList
        qty1.add(40);
        qty1.add(50);
        System.out.println(qty1);
        // to reverse a ArrayList we use -> Collections  class
        Collections.reverse(qty1);
        //Collections.sort(qty1); to sort the element from ArrayList we use -> sort() methods from [Collections] class
        System.out.println(qty1);






    }
}
