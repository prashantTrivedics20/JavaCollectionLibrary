package LInkedList;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>link1=new LinkedList<>();
        link1.add("A");
        link1.add("B");
        link1.add(1,"C");// add at index 1
        link1.addFirst("F");// it will add the node first
        link1.addLast("E");
        System.out.println("LinkedList"+link1);
        LinkedList<String>link2=new LinkedList<>();
        link2.addAll(link1);
        System.out.println(link2);
        // removing elements
        link1.remove("E");
        System.out.println(link1);
        link1.remove(3);
        System.out.println(link1);
        // removeFirst
        link1.removeFirst();
        System.out.println(link1);
        // removeLast
        link1.removeLast();
        System.out.println(link1);
        //removeAll()
        link1.removeAll(link1);
        System.out.println(link1);
        // set new value
        link2.set(1,"G");
        System.out.println(link2);
        // get() by using get() you can retrive the value from linkList
        System.out.println(link2.getFirst());// it will give the first value of LinkList
        System.out.println(link2.getLast());// it will give the Last value of the LinkList



    }
}
