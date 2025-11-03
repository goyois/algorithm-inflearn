package algorithm.demo.sec3.two_pointers;

import java.util.*;

//6. 최대 길이 연속부분수열 O(n2) -> O(n)
public class Main05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int cnt = 0;
        int lt = 0;
//      1 1 0 0 1 1 0 1 1 0 1 1 0 1
//             [1 1 1 1 1 1 1 1] 정답: 8개

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                    lt++;
            }
            answer = Math.max(answer,rt-lt+1);
            System.out.println(answer);
        }
    }
}
