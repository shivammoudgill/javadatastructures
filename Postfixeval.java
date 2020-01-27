import java.util.*;

class Postfixeval {

    public static int postfixToInfix(String input) {

        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            //System.out.println(input.charAt(i));
            if (Character.isDigit(input.charAt(i))) {
                s.push(input.charAt(i)-'0');
                System.out.println(s.peek());
            } else if(input.charAt(i) == '*' || input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '/') {
                int op1 = s.pop();
               //System.out.println("op1 " + op1);
                int op2 = s.pop();
                //System.out.println("op2 " + op2);

                switch (input.charAt(i)) {
                    case '+':
                        s.push(op1 + op2);
                        break;

                    case '-':
                        s.push(op2 - op1);
                        break;

                    case '*':
                        s.push(op1 * op2);
                        break;

                    case '/':
                        s.push(op2 / op1);
                        break;

                }
            }
        }
        return s.pop();

    }

    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String input = sc.nextLine();
            System.out.println(postfixToInfix(input));
            //System.out.println(input);
            t--;
        }

    }
}
