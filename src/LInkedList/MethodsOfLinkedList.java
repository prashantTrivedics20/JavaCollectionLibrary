package LInkedList;
import java.util.LinkedList;
public class MethodsOfLinkedList {
    public static void main(String[] args) {
        LinkedList<String> link1 = new LinkedList<>();
        link1.add("F");
        link1.add("A");
        link1.add("C");
        link1.add("B");
        link1.add("E");
        System.out.println(link1);
        //link1.clear();
        System.out.println("List after changing");
//        System.out.println(link1.poll());
//        System.out.println("List after changes"+link1);
        System.out.println(link1.pollFirst());// retrieve and removes the first element of this list
        // or returns the null if this list is empty..
        System.out.println("List after changes"+link1);
        System.out.println(link1.pollLast());//
        // retrieve and removes the Last element of this list
        // or returns the null if this list is empty..
        System.out.println(link1);
        // peek()
        System.out.println(link1.peek());//it will retrieve the first element but not delete the element
        System.out.println(link1);
        //peekFirst()
        System.out.println(link1.peekFirst());//it will retrieve the first element but not delete the element
        System.out.println(link1);
        // peekLast()
        System.out.println(link1.peekLast());// it will retrieve the Last element but not delete the element
        System.out.println(link1);



    }
}
