package codility.medium;

import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        BracketsSolution bracketsSolution = new BracketsSolution();
        System.out.println(bracketsSolution.solution("{([])}"));
    }
}

class BracketsSolution {

    public int solution(String S) {


        Stack<Character> stack = new Stack<>();

        char[] chars = S.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
                continue;
            }

            if ('(' == stack.peek() && ')' == chars[i]) {
                stack.pop();
            } else if ('{' == stack.peek() && '}' == chars[i]) {
                stack.pop();
            } else if ('[' == stack.peek() && ']' == chars[i]) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
        }

        return stack.size() == 0 ? 1 : 0;

    }
}
