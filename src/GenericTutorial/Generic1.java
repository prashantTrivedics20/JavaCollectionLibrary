package GenericTutorial;
class Container<T>//it means that this Container represent the type T
{
    T values;

    public T getValues() {
        return values;
    }

    public void setValues(T values) {
        this.values = values;
    }

    public void show()
    {
        System.out.println(values.getClass().getName());// it will give the output like that->  java.lang.Integer
        // if we provide the integer value..
    }
}
public class Generic1 {
    public static void main(String[] args) {
        //Container<?> obj=new Container<?();
        Container<Integer> obj=new Container();
        obj.values=9;
        obj.show();

    }
}
