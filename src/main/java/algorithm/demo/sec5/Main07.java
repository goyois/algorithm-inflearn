package algorithm.demo.sec5;

import java.util.*;

//교육과정 설계
public class Main07 {

    public String solution(String a,String b) {

        String answer = "YES";
        Queue<Character> q = new LinkedList<>();

        for (char c : a.toCharArray()) q.offer(c);

        for (char c : b.toCharArray()) {
            //플랜의 필수과목이 큐에 첫번째로 있어야 YES
            //플랜에 있는 과목이 큐에 있으나 첫번째가 아니라면 NO
            if (q.contains(c)) {
                if (c != q.poll()) return "NO";
            }
        }
        //다 돌고난 뒤에도 큐에 필수 과목이 남아있다면 NO
        if (!q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a,b));

    }
}
