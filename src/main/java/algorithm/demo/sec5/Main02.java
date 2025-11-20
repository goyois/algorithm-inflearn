package algorithm.demo.sec5;

import java.util.*;

//괄호 문자 제거
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //나의 풀이
//        Stack<Character> stack = new Stack<>();
//        StringBuilder sb = new StringBuilder();
//        for (char c : a.toCharArray()) {
//            if (c == '(') {
//                stack.push(c);
//            } else if (c == ')') {
//                if (!stack.isEmpty()) stack.pop();
//            } else if (Character.isAlphabetic(c)) {
//                if (stack.isEmpty()) sb.append(c);
//                else continue;
//            }
//        }
//        System.out.println(sb.toString());


        //교안
        Stack<Character> stack = new Stack<>();
        for (char c : a.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }
        System.out.println(sb.toString());



    }
}
