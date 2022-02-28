// clone()
import java.util.*;
public class CloneMethodInArrayList {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        System.out.println("Original List: "+al);
        ArrayList<String>alclone=(ArrayList<String>)al.clone();//after cloning one ArrayList to another
        // now if we perform the any operation on the original it will not reflect the clone list
        System.out.println("Cloned List"+alclone);
        System.out.println("Adding New Element to Original List"+alclone);
        al.add("D");
        System.out.println("Original List"+al);
    }
}
