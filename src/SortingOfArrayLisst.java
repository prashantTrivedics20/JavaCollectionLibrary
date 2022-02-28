import java.util.ArrayList;
import java.util.Collections;
// sorting of a ArrayList
public class SortingOfArrayLisst {
    public static void main(String[] args) {
//        ArrayList<String>alist=new ArrayList<>();
//        alist.add("C");
//        alist.add("A");
//        alist.add("AB");
//        System.out.println("Before Sorting"+alist);
//        Collections.sort(alist);
//        System.out.println("After Sorting"+alist);
//        Collections.sort(alist,Collections.reverseOrder());
//        System.out.println("After sorting(Desc)"+alist);
        ArrayList<Integer>alist=new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(10);
        alist.add(11);
        System.out.println("Before Sorting"+alist);
        Collections.sort(alist);
        System.out.println("After Sorting"+alist);
        Collections.sort(alist,Collections.reverseOrder());
        System.out.println("After sorting(Desc)"+alist);
    }
}
