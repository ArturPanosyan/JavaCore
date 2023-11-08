package chapter13;
// В этой версии программы ShowFile оператор try с ресурсами применяется для автоматического закрытия файла

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileTry {
    public static void main(String[] args) {
        int i;
        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
        // Ниже оператор try с ресурсами применяется сначала для открытия, а затем для автоматического
        //закрытия файла по завершении блока этого оператора
         try(FileInputStream fileInputStream = new FileInputStream(args[0])){
             do{
                 i = fileInputStream.read();
                 if(i != 1){
                     System.out.println((char) i);
                 }
             } while (i != -1);
         } catch (FileNotFoundException e){
             e.printStackTrace();
         } catch (IOException e){
             System.out.println("Пpoизomлa ошибка ввода-вывода");
         }


    }
}
