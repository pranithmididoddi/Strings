import java.util.Stack;

public class NewMain {

    public static void main(String[] args) {

        System.out.println(checkif("{}"));
    }

    public static boolean validParanthesis(String value) {

        Stack<Character> stack = new Stack<>();

        for (char c : value.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == ')' && !stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static boolean checkif(String value) {
        Stack<Character> stack = new Stack<>();

        for (char c : value.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == ')' && !stack.empty() && stack.peek() == '(') {
                    stack.pop();
                }
                else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                    stack.pop();
                }
                else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
            }
        }
