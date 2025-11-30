package algorithm.demo.prog;

import java.util.*;

//주식가격 (스택으로 풀어볼 것)
public class StockPrice {
    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 2, 3};
        Queue<Integer> answer = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int x : prices){
            q.offer(x);
        }

        while (q.size() > 1){
            int tmp = q.poll();
            int res = 0;
            for (int x : q){
                if (tmp <= x){
                    res++;
                } else if (tmp > x){
                    res++;
                    break;
                }
            }
            answer.offer(res);
        }
        answer.offer(0);
        System.out.println(answer);
    }
}
