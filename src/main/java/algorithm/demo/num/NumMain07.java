package algorithm.demo.num;

import java.util.ArrayList;
import java.util.Scanner;

public class NumMain07 {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0; //정답 횟수

        for (int i = 0; i <n; i++) {
            if (arr[i] == 1) {
                    cnt++;
                    answer += cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args){
        NumMain07 T = new NumMain07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
