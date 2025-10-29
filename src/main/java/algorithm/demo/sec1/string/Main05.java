package algorithm.demo.sec1.string;

import java.util.Scanner;

//7. 회문 문자열(처음과 끝이 같은 문자인지)
public class Main05 {

    //방법 1
    //길이에서 절반 나눈 뒤 뒤에서부터는 인덱스 위치에 맞춰서 길이를 줄여준다.
    public String solution(String str) {
        String answer = "YES";
//        str = str.toUpperCase();
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return answer = "NO";
//            }
//        }


        //equalsIgnoreCase = 대소문자 구분 x
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {
            return answer = "NO";
        }


        return answer;
    }

    public static void main(String[] args){
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
