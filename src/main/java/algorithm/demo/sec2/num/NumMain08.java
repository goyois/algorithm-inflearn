package algorithm.demo.sec2.num;

import java.util.ArrayList;
import java.util.Scanner;

//8.등수 구하기 (나의 풀이)
public class NumMain08 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    rank++;
                }
            }
            answer.add(rank);
        }
        return answer;
    }

    public static void main(String[] args){
        NumMain08 T = new NumMain08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.println(x+ " ");
        }
    }
}
