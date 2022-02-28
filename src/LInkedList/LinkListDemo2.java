package LInkedList;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> link1 = new LinkedList<>();
        link1.add("F");
        link1.add("A");
        link1.add("C");
        link1.add("B");
        link1.add("E");
        System.out.println(link1);
        List sublist=link1.subList(1,4);//list class
        System.out.println(sublist);
        sublist.remove(1);
        System.out.println(link1);
        System.out.println(sublist);//if we made changes perform from sublist it will reflect from the original LinkedList
        sublist.add("Z");
        System.out.println("SubList After Addition: -"+sublist);
        System.out.println("After changing subList then Original "+link1);
    }
}
