package classwork.file;

import java.io.*;

public class DataIOStream {
    private static final String FILE_PATH = "C:\\Users\\artur\\JavaCore\\JavaCore\\src\\classwork\\file\\example.txt";

    public static void main(String[] args) throws IOException {
       // write();
        read();
    }

    public static void write() throws IOException {
          DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
          out.write(33);
          out.writeUTF("Java 2023");
          out.close();
    }

    public static void read() throws IOException{
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readUTF());
        inputStream.close();
    }
}
