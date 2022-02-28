package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class stud<T> implements Comparable<stud>
{
    int roll,marks;
    String name;

    public stud(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "stud{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(stud o) {
        return marks>o.marks?1:-1;
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
        List<stud> s=new ArrayList<>();
        s.add(new stud(23,4565,"prashant"));
        s.add(new stud(43,6747,"Trivedi"));
        s.add(new stud(24,4373,"surendra"));
        s.add(new stud(46,3485,"Archana"));
//        Collections.sort(s);
//        for(stud s1:s)
//        {
//            System.out.println(s1);
//        }
        //Collections.sort(s,Collections.reverseOrder());
        Collections.sort(s);
        for(stud s1:s)
        {
            System.out.println(s1);
        }


    }
}
