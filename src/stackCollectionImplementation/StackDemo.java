package stackCollectionImplementation;
import java.util.*;
public class StackDemo{
    public static void main(String[] args) {
        Stack<String>st1=new Stack<>();
        st1.push("A");
        st1.push("B");
        st1.push("C");
//        System.out.println(st1);
//        String s=st1.pop();
//        System.out.println(s);
//        st1.pop();
//        System.out.println(st1);
//        System.out.println(s);
        System.out.println(st1);
        st1.push("D");
        System.out.println(st1.peek());// it will return the top elements
        // search method-> it will return the element position from top elements
        st1.push("E");
        st1.push("F");
        System.out.println(st1.search("E"));
        // empty() method..
        //st1.clear();
        st1.removeAll(st1);// remove all the elemets from stack..
        System.out.println(st1.empty());

    }
}
