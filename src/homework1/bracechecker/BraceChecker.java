package homework1.bracechecker;

    public class BraceChecker {
        private String text;

        public BraceChecker(String text) {
            this.text = text;
        }

        public void check() {
            Stack stack = new Stack(text.length());

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                switch (ch) {
                    case '{':
                    case '[':
                    case '(':
                        stack.push(ch);
                        break;
                    case '}':
                        if (stack.isEmpty() || stack.pop() != '{') {
                            System.out.println("Error: opened { but closed } at " + i);
                            return;
                        }
                        break;
                    case ']':
                        if (stack.isEmpty() || stack.pop() != '[') {
                            System.out.println("Error: opened [ but closed ] " + ch +
                                    "at " + i);
                            return;
                        }
                        break;
                    case ')':
                        if (stack.isEmpty() || stack.pop() != '(') {
                            System.out.println("Error: opened ( but closed ) " + ch + " at " + i);
                            return;
                        }
                        break;
                }
            }

            if (!stack.isEmpty()) {
                char remainingBrace = stack.pop();
                System.out.println("Error: opened " + remainingBrace + " but not closed");
            } else {
                System.out.println("No errors found.");
            }
        }
    }







