package Collection;
import java.util.*;
public class Collection1 {
    String name;
    int marks;
    int rollno;
    public Collection1(String name, int marks, int rollno) {
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }
    @Override
    public String toString() {
        return "Collection1{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", rollno=" + rollno +
                '}';
    }
}
class check implements Comparator<Collection1>
{
    public int  compare(Collection1 o1,Collection1 o2)
    {
        if(o1.marks>o2.marks)
        {
            return 1;
        }
        return -1;

    }
}
class test
{
    public static void main(String[] args) {
        ArrayList<Collection1> al = new ArrayList<>();
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter the student ");
        int n = readme.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(new Collection1(readme.next(), readme.nextInt(), readme.nextInt()));
        }
        Collections.sort(al,new check());
        System.out.println(al);
    }

}


