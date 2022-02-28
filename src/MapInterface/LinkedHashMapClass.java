// write a program to print the occurrence of the element in an array by using hashMap..
package MapInterface;
import java.util.*;
public class LinkedHashMapClass {
    public static void main(String[] args) {
        //note
        // advantage of the LinkedHashMap over HashMap is that-->
        // LinkedHashMap fallow the properOrdering but HashMap is not fallow the ordering if you want to achieve the
        // proper ordering then you can use the LinkedHashMap class
        Map<Integer,Integer> map=new LinkedHashMap<>();
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],0);
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
            {
                int ctr=map.get(arr[i]);
                map.put(arr[i],++ctr);

            }
        }
        System.out.println(map);// it will give the value with properOrdering
    }
}

