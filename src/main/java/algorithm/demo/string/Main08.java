package algorithm.demo.string;

import java.util.Scanner;


//10.가장 짧은 문자거리
public class Main08 {
    public int[] solution(String s,char t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = 0;
            } else
                p++;
            answer[i] = p;
        }

        p = 1000;
        for (int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else
                p++;
            answer[i] = Math.min(answer[i],p);
        }

        return answer;
    }

    public static void main(String[] args){
        Main08 T = new Main08();
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.next();
        char c = sc.next().charAt(0);
        for (int x : T.solution(sc1, c)) {
            System.out.print(x+" ");
        }
    }
}
