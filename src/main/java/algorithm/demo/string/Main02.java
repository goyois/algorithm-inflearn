package algorithm.demo.string;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 *
 * i : 3 good time big
 * o : doog emit gib
 */

//4.문자 뒤집기
//String 연산이 많을 때 StringBuilder 를 쓰면 메모리 낭비없음 -> String 객체를 더 만들지 않아도 되기 때문
//public class Main02 {
//    public ArrayList<String> solution(String[] str, int n) {
//        ArrayList<String> answer = new ArrayList<>();
//
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;
//    }


    //특정 원소만 뒤집기
    public class Main02 {
        public ArrayList<String> solution(String[] str, int n) {
            ArrayList<String> answer = new ArrayList<>();

            for (String x : str) {
                char[] s = x.toCharArray();
                int left = 0;
                int right = x.length() -1;
                while (left < right) {
                    char tmp = s[left]; //왼쪽 값 구하기
                    s[left] = s[right]; //왼값에 오값 바로 할당
                    s[right] = tmp;     //오값에 왼값 할당
                    left++; //다음 문자
                    right--; //다음 문자
                }
                String tmp = String.valueOf(s);
                answer.add(tmp);
            }
            return answer;
        }


    public static void main(String[] args){
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String x : T.solution(str, n)) {
            System.out.println(x);
        }
    }
}
