package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

// Properties file
public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //Properties is inbuilt class of java.util package which is extends the Hashtable class(means which have key value pair)
        Properties p=new Properties();
        // because we know that file output stream is a abstract class so we can,t create the object of the OutputStream
        OutputStream os=new FileOutputStream("data.txt");
        p.setProperty("url","localhost:3306/myDb");
        p.setProperty("uname","prashant");
        p.setProperty("pass","0000");
        p.store(os,null);// to store the data into the file
    }
}
