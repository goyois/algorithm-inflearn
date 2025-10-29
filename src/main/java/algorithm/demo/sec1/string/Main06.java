package algorithm.demo.sec1.string;

import java.util.Scanner;

//유효한 팰린드롬
public class Main06 {
    public String solution(String str) {
        String answer = "NO";

        //알파벳 대문자가 아니면(^ : 부정)
        str = str.toUpperCase().replaceAll("[^A~Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        Main06 T = new Main06();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
