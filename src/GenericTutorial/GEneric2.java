package GenericTutorial;

import java.util.ArrayList;

class Container1<T extends Number>//it means that this Container represent the type T
        // note ->
        // all the wrapper classes extends the Number class
        // so this T is support only number
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
    //public void Demo(ArrayList<Integer> obj)
    //public void Demo(ArrayList<? extends T> obj)
    // public void Demo(ArrayList<? super T> obj)// it will accept all the super classes(only)
    public void Demo(ArrayList<? extends T> obj)// it will work number it self
    {

    }
}
class GEberic2 {
    public static void main(String[] args) {
        //Container<?> obj=new Container<?();
        Container1<Number> obj=new Container1();
        //Container1<Integer> obj1=new Container1();
        obj.values=9;
        obj.show();
        obj.Demo(new ArrayList<Integer>());

    }
}
