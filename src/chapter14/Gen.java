package chapter14;

public class Gen <T> {
    T ob;  // объявить объект типа т

    //передать конструктору ссылку на объект типа Т
    Gen(T o){
        ob = o;
    }

    //возвратить объект оЬ
    T getOb(){
        return ob;
    }

    //показать тип Т
    void showType(){
        System.out.println("Tипoм Т является " + ob.getClass().getName());

    }
}
