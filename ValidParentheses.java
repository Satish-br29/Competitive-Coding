import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket
            else {
                // If stack empty -> invalid (no matching opening bracket)
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop(); // remove last opening bracket

                // Check mismatch
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        System.out.println(vp.isValid("()"));      // true
        System.out.println(vp.isValid("()[]{}"));  // true
        System.out.println(vp.isValid("(]"));      // false
        System.out.println(vp.isValid("([)]"));    // false
        System.out.println(vp.isValid("{[]}"));    // true
    }
}
