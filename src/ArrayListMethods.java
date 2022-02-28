import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(1);
        al.add(5);
        al.add(5);
        al.add(9);
        System.out.println(al.indexOf(5));// it will give the first Occurence incase of the duplicacy
        System.out.println(al.lastIndexOf(5));// it will give the last occurence

    }
}
