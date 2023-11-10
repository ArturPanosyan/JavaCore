package fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\artur\\JavaCore\\JavaCore\\src\\fileutil\\fileimput.txt";
        String fileName = "C:\\Users\\artur\\JavaCore\\JavaCore\\src\\fileutil\\FileUtil.java";

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static boolean fileSearch(String path, String fileName) {
        File  file = new File(path);
        File[] files = file.listFiles();

        if (files != null) {
            for (File folder : files) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    System.out.println("File found: " + file.getAbsolutePath());
                    return true;
                }
            }
        }
        System.out.println("File not found.");
        return false;
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch(String path, String keyword) {
        File folder = new File(path);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try (Scanner fileScanner = new Scanner(file)) {
                        while (fileScanner.hasNextLine()) {
                            String line = fileScanner.nextLine();
                            if (line.contains(keyword)) {
                                System.out.println("File: " + file.getName());
                                break;
                            }
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines(String txtPath, String keyword) throws IOException {
        try (Scanner fileScanner = new Scanner(new File(txtPath))) {
            int lineNumber = 1;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains(keyword)) {
                    System.out.println("Line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage(String path) {
        File folder = new File(path);
        File[] files = folder.listFiles();

        long totalSize = 0;
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    totalSize += file.length();
                }
            }
        }

        System.out.println("Total size of package: " + totalSize + " bytes");
    }


    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը


    static void createFileWithContent(String path, String fileName, String content) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("NewFileName"))) {
            bufferedWriter.write(content);
            bufferedWriter.newLine();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("FileImput"));
             bufferedReader.readLine();
            System.out.println("File created successfully: ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}