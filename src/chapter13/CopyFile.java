package chapter13;
/* Копирование файла.
Чтобы воспользоваться этой программой, укажите имена исходного и целевого файлов.
Например, чтобы скопировать файл FIRST.TXT в файл SECOND.TXT, введите в командной строке следующую команду:
 java CopyFile FIRST.TXT SECOND.TXT */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        // сначала убедиться, что указаны имена обоих файлов
        if(args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }
        // копировать файл
        try{
            // попытаться открыть файлы
            fileInputStream = new FileInputStream(args[0]);
            fileOutputStream = new FileOutputStream(args[1]);
            do{
                i= fileInputStream.read();
                if(i != - 1)
                    fileOutputStream.write(i);
            } while (i != -1);
        } catch (IOException e){
            System.out.println("Oшибкa ввода-вывода: " + e);
        } finally {
            try{
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e1){
                System.out.println("Oшибкa закрытия файла ввода");
            } try{
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e2){
                System.out.println("Oшибкa закрытия файла вывода");
            }
        }
    }

}
