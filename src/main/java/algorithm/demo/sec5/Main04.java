package algorithm.demo.sec5;

import java.util.Scanner;
import java.util.Stack;

//후위식 연산(postfix)
public class Main04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //352+*9-

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        int lt = 0;
        int rt = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c-48); //아스키에서 추출된 숫자 삽입
            } else {
                    rt = stack.pop();
                    lt = stack.pop();
                    if (c == '+') stack.push(lt+rt);
                    else if (c == '-') stack.push(lt-rt);
                    else if (c == '*') stack.push(lt*rt);
                    else if (c == '/') stack.push(lt/rt);
            }
        }

        answer = stack.get(0);
        System.out.println(answer);
    }
}
