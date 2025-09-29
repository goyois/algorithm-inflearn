package algorithm.demo.num;

import java.util.ArrayList;
import java.util.Scanner;

//4.피보나치 수열
public class NumMain04 {

    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);

        for (int i = 1; i < n -1; i++) {
            if (i == 1) {
                answer.add(i);
            } answer.add(answer.get(i) + answer.get(i-1));
        }
        return answer;
    }






    public static void main(String[] args){
        NumMain04 T = new NumMain04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x+ " ");
        }
    }
}
