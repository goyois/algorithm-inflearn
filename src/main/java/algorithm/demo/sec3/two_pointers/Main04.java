package algorithm.demo.sec3.two_pointers;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;
        int sum = 0;
        int lt = 0;

        //m 은 연속된 자연수가 2개 이상 조합되어야함
        int m = n/2+1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        System.out.println(answer);
    }
}
