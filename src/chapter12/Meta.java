package chapter12;

import java.lang.reflect.Method;

public @interface Meta {
       // аннотировать метод
 //   @MyAnno(str = "Пример аннотации", val = 100){
         //  public static void myMeth() {
//       Meta ob = new Meta();
//         // получить аннотацию из метода и вывести значения ее членов
//   //      try{
//             // сначала получить объект типа Class, представляющий данный класс
//                     Class<?> c = ob.getClass();
//             // затем получить объект типа Method, представляющий данный метод
//             Method m = c.getMethod("myMeth");
//             // далее получить аннотацию для данного класса
//             MyAnno anno = m.getAnnotation(MyAnno.class);
//             // и наконец, вывести значения членов аннотации
//             System.out.println(anno.str() + " " + anno.val());
//         } catch (NoSuchMethodException exc) {
//             System.out.println("Meтoд не найден.");
//         }
//     }
 }
//
