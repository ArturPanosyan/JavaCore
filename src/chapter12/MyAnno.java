package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str () ;
    int val();
}
