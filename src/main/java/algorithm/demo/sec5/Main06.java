package algorithm.demo.sec5;


import java.util.*;

//공주 구하기 (queue)
public class Main06 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            for(int i = 1; i < k; i++){
                q.offer(q.poll());
            }
            q.poll();
        }

        System.out.println(q.poll());




    }
}
