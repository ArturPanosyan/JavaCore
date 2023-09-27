package bracechecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {

        this.text = "Hello (from) [java}";
    }

    public void check() {
        int stackSize = text.length();
        Stack mystack = new Stack();
        Stack theStack = new Stack(stackSize);

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if( !theStack.isEmpty()) {
                        char ch1 = theStack.pop();
                        if ((ch == '}' && ch1 != '}') || (ch == '[' && ch1 != ']')
                                || (ch == '(' && ch1 != ')'))
                            System.err.println(" Error: opened [ but closed } at"
                                    + ch + " " + i);
                    } else
                        System.err.println(" Error: opened [ but closed } at"
                                + ch + " " + i);

                    break;
                default:
                    break;
            }


        }
        if(!theStack.isEmpty())
            System.err.println(" Error: opened [ but closed } at");

    }
}


























