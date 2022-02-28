package Collection;
import java.util.*;
class numcompare implements Comparator<Integer>
{ @Override
public int compare(Integer o1, Integer o2) {
    if(o1%10>o2%10)
    {
        return 1;
    }
    return -1;
}
}
public class Comparator1 {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>();
        Random r=new Random();
        Scanner readme=new Scanner(System.in);
        for (int i = 0; i <100 ; i++) {
            int r1= r.nextInt(1000)+1;
            num.add(r1);
        }
        //System.out.println(num);
        Comparator numco=new numcompare();// Comparator object Creation..
        Collections.sort(num,numco);
        for (Integer a:num) {
            System.out.println(a);
        }
    }
}
