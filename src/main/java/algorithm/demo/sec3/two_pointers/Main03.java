package algorithm.demo.sec3.two_pointers;

import java.util.Scanner;

//31.4. 연속부분수열 (범위 & 시간 복잡도 문제)
public class Main03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }

    }
}
