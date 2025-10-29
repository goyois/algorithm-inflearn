package algorithm.demo.sec1.string;

import java.util.Scanner;

//12.암호
//문자열을 7개씩 자른다
//자른 문자열을 이진수로 바꿔준다
//이진수를 아스키코드로 바꾼다
//해당 아스키 코드의 문자를 누적하여 반환
public class Main10 {

    public String solution(String s,int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0,7)
                    .replace('#', '1')
                    .replace('*', '0'
                    );
            int num = Integer.parseInt(tmp,2);
            s = s.substring(7);
            System.out.println(tmp +" "+ num);
            answer += (char) num;
        }
        return answer;
    }

    public static void main(String[] args){
        Main10 T = new Main10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.print(T.solution(s,n));
    }
}
