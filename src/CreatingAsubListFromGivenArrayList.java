import java.util.ArrayList;

// alist.subList(start index,end index)
public class CreatingAsubListFromGivenArrayList {
    public static void main(String[] args) {
        ArrayList<String>alist=new ArrayList<>();
        alist.add("A");
        alist.add("B");
        alist.add("C");
        alist.add("D");
        ArrayList<String>al=new ArrayList<>(alist.subList(1,3));// subList from 1 to 3 index
        System.out.println("subList"+al);


    }
}
