import java.util.ArrayList;
import java.util.Arrays;
public class Conversion {
    public static void main(String[] args) {
        // ArrayList to Array..
        ArrayList<Integer>alist=new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        System.out.println("Arraylist"+alist);
        Integer s[]=new Integer[alist.size()];
        alist.toArray(s);// we use toArray()
        for(Integer i1:s)
        {
            System.out.println(i1);
        }
        System.out.println(s.length);
        //Array to ArrayList
//        String s[]={"A","B","C"};
//        for(String s1:s)
//        {
//            System.out.println(s1);
//        }
//        ArrayList<String>alist=new ArrayList<>(Arrays.asList(s));// for Array to ArrayList use (asList()) method
//        System.out.println("ArrayList: "+alist);
        // ArrayList to String
//        ArrayList<String>alist=new ArrayList<>();
//        alist.add("A");
//        alist.add("B");
//        alist.add("C");
//        System.out.println("ArrayList"+alist);
//        String s=alist.toString();// it will make the combine the string
//        System.out.println("string"+s);
//        System.out.println("Size of arraylist"+alist.size());
//        System.out.println("size of string"+s.length());// combine string



    }
}
