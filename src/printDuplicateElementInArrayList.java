import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;

public class printDuplicateElementInArrayList {
    public static void main(String[] args) {
//        List<Integer> values=new ArrayList<Integer>()// if you want to add the value while creating the object itself..
//        {
//            {// instance initialization
//                Scanner readme = new Scanner(System.in);
//                add(readme.nextInt());
//                add(readme.nextInt());
//                add(readme.nextInt());
//            }
//
//        };// this is anonymous class
        ArrayList<Integer>al=new ArrayList<>();
        // return type of add method is boolean
        al.add(1);
        al.add(5);
        al.add(1);
        al.add(2);
        al.add(5);
        al.add(4);
        al.add(3);
        al.add(2);
        Set<Integer>s=new HashSet<>();// set contains unique element
        for(int i1:al)
        {
            if(s.add(i1)==false)
            {
                System.out.println(i1);
            }
        }

    }
}
