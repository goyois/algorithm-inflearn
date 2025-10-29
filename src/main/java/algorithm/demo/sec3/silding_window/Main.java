package algorithm.demo.sec3.silding_window;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0; int answer = 0;

        //첫 합계 구함 idx 0+1+2
        for (int i = 0; i < k; i++) {
            sum += arr[i];
            answer = sum;
        }

        //1칸씩 이동
        // K = 3, i - k = 0
        // 다음 칸의 숫자와 1칸 더 이동하면서 필요없어진 칸의 숫자를 뺴준 뒤 sum 에 누적
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}
