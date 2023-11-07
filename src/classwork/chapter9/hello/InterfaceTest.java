package classwork.chapter9.hello;

public class InterfaceTest {

    ArmPerson armPerson = new ArmPerson();
    EnglishPerson ep = new EnglishPerson();


    static void printHelloAndGoodBy(SayHello sayHello) {
        System.out.println(sayHello.sayHello());
        if (sayHello instanceof SayGoodBy) {
            SayGoodBy sayGoodBy = (SayGoodBy) sayHello;
            System.out.println(sayGoodBy.sayGoodBy());
        }
    }
}
