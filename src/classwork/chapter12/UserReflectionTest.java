package classwork.chapter12;

import java.lang.reflect.Method;
import java.util.Date;

public class UserReflectionTest {
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {

//        User user = new User("Poxos", "Poxosyan", "poxos@mail.com", Language.RU);
//
//        Class<? extends User> uClass = user.getClass();
//
//        Method[] declaredMethods = User.class.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
////            if (declaredMethod.isAnnotationPresent(FirstAnnotation.class)) {
////                System.out.println(declaredMethod);
////            }
//            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
//            if (declaredAnnotations.length > 0) {
//                System.out.print(declaredMethod.getName() + " -> ");
//                for (Annotation declaredAnnotation : declaredAnnotations) {
//                    System.out.println(declaredAnnotation.annotationType());
//                }
//                System.out.println("---------------------");
//            }
//
//        }

//        Model annotation = User.class.getAnnotation(Model.class);
//        if (annotation != null) {
//            System.out.println(annotation.name());
//            System.out.println(annotation.val());
//        }
        try {
            Method printHello = User.class.getMethod("printHello1");
            new Date(2020, 7,20);
            System.out.println(printHello);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
