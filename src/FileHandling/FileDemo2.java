package FileHandling;

import java.io.*;
import java.util.Properties;
// this is all about to fetch the data from the file
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        InputStream is=new FileInputStream("data.txt");
        p.load(is);
        System.out.println(p.getProperty("uname"));
        System.out.println(p.getProperty("url"));
        p.list(System.out);// if you want to print all the value from the file on the console you have to use the p.list(System.out)

    }
}
