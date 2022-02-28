package LInkedList;
import java.util.LinkedList;
public class LinkListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> link1=new LinkedList<>();
        link1.add("F");
        link1.add("A");
        link1.add("C");
        link1.add("B");
        link1.add("E");
        link1.add("B");
        System.out.println("Link"+link1);
        System.out.println("Index of C->"+link1.indexOf("B"));// it will give the first Occurence of the B
        System.out.println("Last Index Of C->"+link1.lastIndexOf("C"));
        System.out.println("Last Index Of C->"+link1.lastIndexOf("B"));//it will give the last occrrence of the B
        System.out.println(link1.indexOf("L"));// because Z element is not present in the linkedList so it will return the
        // value (-1) as the output...
        // java is a case-sensitive language..
        LinkedList<String> link2=new LinkedList<>();
        link2.addAll(link1);
        if(link1.contains("f"))
        {
            System.out.println("F is  present");
        }
        else
        {
            System.out.println("f is not present");
        }
        if(link2.containsAll(link1))
        {
            System.out.println("true");

        }
        else
        {
            System.out.println("false");
        }
        
    }
}
