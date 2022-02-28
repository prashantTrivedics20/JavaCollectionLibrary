package VectorWithExamle;
import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String>vect1=new Vector<>();
        vect1.add("A");
        vect1.add("B");
        vect1.add("D");
        vect1.add(2,"C");
        System.out.println(vect1);
        // copy a vector
        Vector<String>vect2=new Vector<>();
        vect2.addAll(vect1);
        System.out.println(vect2);
        // to Access the value
        System.out.println(vect2.get(2));
        // remove...
        vect1.remove(1);
        System.out.println(vect1);
        vect2.remove("B");
        System.out.println(vect2);
        vect2.clear();
        System.out.println(vect2);
        vect1.removeAll(vect1);
        System.out.println(vect1);
        System.out.println(vect1.size());

    }
}
