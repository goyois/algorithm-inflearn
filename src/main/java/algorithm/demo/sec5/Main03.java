package algorithm.demo.sec5;

import java.util.Scanner;
import java.util.Stack;

//크레인 인형뽑기 카카오 기출
public class Main03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]=sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        //input
//        5  (5*5 2차원 배열 크기)
//        0 0 0 0 0
//        0 0 1 0 3
//        0 2 5 0 1   (인형뽑기 안)
//        4 2 4 4 2
//        3 5 1 3 1

//        8  (8번의 움직임)
//        1 5 3 5 1 2 1 4


        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) { //열 길이만큼 반복
                if (board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(tmp);
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
