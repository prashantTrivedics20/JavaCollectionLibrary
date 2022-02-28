package LInkedList;
import java.util.LinkedList;
public class FunctionalityOfLinkedList {
    public static void main(String[] args) {
        LinkedList<String>link1 = new LinkedList<>();
        link1.add("F");
        link1.add("A");
        link1.add("C");
        link1.add("B");
        link1.add("E");
        link1.push("x");// it will add the element in front of linkedList
        System.out.println(link1);
        link1.pop();//it will pop the first element of the LinkedList
        System.out.println(link1);



    }
}
