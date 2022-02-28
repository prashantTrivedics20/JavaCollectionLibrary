package GenericTutorial;

// Collection and Generic in java...
// Collection provide the Dynamic type of Array we can shrink and expands the value of the array
// Collection is a collection of the object
public class Generic3 {
    @Override
    public String toString() {
        return "Generic3{}";
    }
    public static void main(String[] args) {
        int values[]=new int[4];
        Object val[]=new Object[5];
        val[0]="hello";
        val[1]="2";
        for(Object i:val)
        {
            System.out.println(i);
        }
        // we use the Iterator with the Collection..
        // to fetch the value from the collection we use Iterator...
        // when we are not certain that how many value stored in the collection
        //  then we use the while loop instead of for loop
        // Iterator have one method called hasNest() it will check do we have the next element
        // if we have the element it will print it otherwise stop..
    }
}
