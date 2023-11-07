package classwork.file;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\artur\\JavaCore\\JavaCore\\src\\classwork\\file\\FileExample.java";

    public static void main(String[] args) {
        write();
        read();

    }

    public static void write() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bufferedWriter.write("fgffffff");
            bufferedWriter.write("java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read ()  {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}