import java.util.Scanner;

// sort the element by using Collection framework
public class CollectionFramework {
    String name;
    int marks;
    int rollno;
    CollectionFramework(String name,int marks,int rollno)
    {
       this.name=name;
       this.marks=marks;
       this.rollno=rollno;
    }

}
class test
{
    public static void main(String[] args) {
        CollectionFramework arr[]=new CollectionFramework[3];
        Scanner readme=new Scanner(System.in);
        int marks[]=new int[3];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=new CollectionFramework(readme.next(),readme.nextInt(),readme.nextInt());
            marks[i]=arr[i].marks;
        }
        int max=marks[0];
        int result=0;
        for (int i = 0; i <marks.length; i++) {
            if(max<marks[i])
            {
                max=marks[i];
                result=i;
            }
        }
        System.out.println("Name of topper->: "+arr[result].name+"  :marks: "+arr[result].marks+"  :rollno: "+arr[result].rollno);



    }
}
