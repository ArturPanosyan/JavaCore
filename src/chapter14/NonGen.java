package chapter14;
// Класс NonGen - функциональный эквивалент класса Gen без обобщений
public class NonGen {
    Object ob;   //объект оЬ теперь имеет тип Object
    // передать конструктору ссылку на объект типа Object
    NonGen(Object o){
        ob = o;
    }

    // возвратить тип Object
    Object getOb(){
        return ob;
    }
    // показать тип объекта оЬ
    void showType(){
        System.out.println("Oбъeкт оЬ относится к типу " + ob.getClass().getName());
    }

}
