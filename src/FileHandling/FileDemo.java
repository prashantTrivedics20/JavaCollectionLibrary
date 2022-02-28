package FileHandling;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f=new File("Demo.txt");// File is predefine class
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Demo content");
        FileInputStream fis=new FileInputStream(f);// here we are retr
        DataInputStream dis=new DataInputStream(fis);
        String str=dis.readUTF();
        System.out.println(str);
    }
}
