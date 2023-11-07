package classwork.chapter9.hello;

public class ArmPerson extends Object implements SayHello, SayGoodBy {

        @Override
        public String sayGoodBy() {
            return "Ցտեսություն";
        }

        @Override
        public String sayHello() {
            return "Բարև";
        }
}
