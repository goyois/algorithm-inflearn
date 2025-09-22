package algorithm.demo.string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


//6.중복 문자 제거
public class Main04 {
    public String solution(String str) {


        // 자료구조를 통한 나의 풀이
//        String answer = "";
//        LinkedHashSet<String> set = new LinkedHashSet<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            String s = String.valueOf(str.charAt(i));
//            set.add(s);
//        }
//
//        for (String s : set) {
//            answer += s;
//        }

        //강의 풀이
        //indexOf 의 경우 해당 문자가 처음 나온 위치를 리턴하므로
        //현재 인덱스 위치인 i 와 처음 나온 위치(indexOf 리턴 값)가
        //다르다면 중복된 문자이므로 i == indexOf(str.charAt(i)) 값이 같을 때만 누적
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
