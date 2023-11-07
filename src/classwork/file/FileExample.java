package classwork.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException  {
        String property = System.getProperty("user.dir");
        System.out.println(property);
        String directoryPath = "C:\\Users\\artur\\JavaCore\\JavaCore\\src\\classwork\\file\\FileExample.java";
        String path = "C:\\Users\\artur\\JavaCore\\JavaCore\\src\\classwork\\file\\asdf";
        File file = new File(path);
        if(file.exists()){
            file.delete();
        }

        System.out.println(File.separator);
        long lastModififined = file.lastModified();
        Date date = new Date(lastModififined);

        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("isFile: " + file.isFile());
        System.out.println("file size" + file.length());

        File directory = new File(directoryPath);
        if(!directory.exists()){
            directory.mkdirs();
        }

        File[] list = directory.listFiles();
        for (File f : list) {
            if(f.isFile()){
                System.out.println("name: " + f.getName());
                System.out.println("size: " + f.length());
            }
        }

        boolean newFile = file.createNewFile();
        if(newFile){
            System.out.println("File Created: ");
        } else {
            System.out.println("File not created:");
        }
    }
}
