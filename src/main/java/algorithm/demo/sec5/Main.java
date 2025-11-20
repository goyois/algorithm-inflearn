package algorithm.demo.sec5;

import java.util.*;

//올바른 괄호
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (char c : a.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) answer = false;
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }
        System.out.println(answer);
    }

}
