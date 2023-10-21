package chapter9;
// Реализовать интерфейс MyIF
public class MyIFImp  implements  MyIF{
      /*В этом классе должен быть реализован только метод getNumЬer(), определенный в интерфейсе MyIF
       А вызов метода getString() разрешается по умолчанию */

    @Override
    public int getNumber() {
        return 100;
    }

}
