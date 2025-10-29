package algorithm.demo.sec1.string;

import java.util.Scanner;

public class Main09 {

    public String solution(String str) {
        String answer = "";

        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }


        //나의 풀이
//        String answer = "";
//        answer += str.charAt(0);
//        int cnt = 1;
//        for (int i = 1; i < str.length(); i++) {
//            char c = answer.charAt(answer.length() -1);
//            if (c == str.charAt(i)) {
//                cnt++;
//                if (i == str.length() - 1) {
//                    answer += String.valueOf(cnt);
//                }
//            } else {
//                if (cnt > 1) {
//                    answer += String.valueOf(cnt);
//                    answer += str.charAt(i);
//                    cnt = 1;
//                } else answer += str.charAt(i);
//                }
//        }
        return answer;
    }

    public static void main(String[] args){
        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
