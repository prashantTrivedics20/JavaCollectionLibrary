//swapping two Element from an ArrayList...
import java.util.*;
public class SwapTwoElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println("Before swapping:"+al);
        Collections.swap(al,1,3);
        System.out.println("After swapping:"+al);
    }
}
