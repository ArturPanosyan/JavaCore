package chapter12;
/* Усовершенствованная версия программы принятия решений из главы 9. В этой версии для представления
   возможных ответов используется перечисление,  а не переменные экземпляра */
import java.util.Random;

public class Question {
//Перечисление возможных ответов
    Random random = new Random();

    Answers answers() {
        int prob = (int) (100 * random.nextDouble());
        if (prob < 15)
            return Answers.МАУВЕ; //15%
        else if (prob < 30)
            return Answers.NO;   //15%
        else if (prob < 60)
            return Answers.YES;    //30%
        else if (prob < 75)
            return Answers.LATER;  //15%
        else if (prob < 98)
            return Answers.SOON;   //13%
        else
            return Answers.NEVER;   //2%

        }

    }

