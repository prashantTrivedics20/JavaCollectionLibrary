package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class CollectionTrick {
    public static void main(String[] args) {
//         List<Integer> values=new ArrayList<Integer>();
        List<Integer> values= Arrays.asList(24,34,60,50);// it is only applicable if you know the value...
//        Scanner readme=new Scanner(System.in);
//        values.add(readme.nextInt());
//        values.add(34);
//        values.add(60);
//        values.add(50);
        for (int i:values) {
            System.out.println(i);
        }

    }
}