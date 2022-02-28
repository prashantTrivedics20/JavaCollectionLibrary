package Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer>p1=new PriorityQueue<>();
        p1.add(5);
        p1.add(3);
        p1.add(1);
        p1.offer(6);
        System.out.println(p1);
        // removal
        System.out.println("before removal"+p1);
        p1.remove();
        System.out.println("After removal"+p1);
        p1.remove();
        System.out.println(p1);
        int i=p1.peek();// it will retrieve the first element and dosen't delete the element
        System.out.println(i);
        System.out.println(p1);
        //p1.clear();
        System.out.println(p1);
        Iterator<Integer>it=p1.iterator();// Iterator method..........
        while(it.hasNext())
        {
            System.out.println(it.next());

        }
    }
}
