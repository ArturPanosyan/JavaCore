package chapter12;

public class AskMe {
    static void answer(Answers result){
        switch (result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case МАУВЕ:
                System.out.println("Boзмoжнo");
                break;
            case SOON:
                System.out.println("Bcкope");
                break;
            case LATER:
                System.out.println("Пoзднee");
                break;
            case NEVER:
                System.out.println("Hикoгдa");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        answer(question.answers());
        answer(question.answers());
        answer(question.answers());
        answer(question.answers());

    }
}
