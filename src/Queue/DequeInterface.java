package Queue;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeInterface {
    public static void main(String[] args) {
        Deque<Integer> d1=new ArrayDeque<>();
        d1.add(4);
        d1.add(5);
        d1.add(3);
        d1.addFirst(1);
        d1.addLast(9);
        d1.addLast(1);
//        d1.removeFirst();
//        d1.removeLast();
        d1.removeFirstOccurrence(1);
        d1.removeLastOccurrence(1);
        System.out.println( d1.peekFirst());
        Iterator<Integer> it=d1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
