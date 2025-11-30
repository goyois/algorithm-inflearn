package algorithm.demo.prog;

import java.util.*;

//프로그래머스 프로세스 문제
public class Process {

    class Cons{
        private int priorities;
        private int location;

        public Cons(int priorities, int location) {
            this.priorities = priorities;
            this.location = location;
        }
    }


    public int sol(int[] priorities,int location) {
        int answer = 0;
        Queue<Cons> queue = new LinkedList<>();
        for (int i = 0; i< priorities.length; i++){
            queue.offer(new Cons(priorities[i],i));
        }

        for (Cons c : queue) {
            System.out.println("location : "+c.location);
            System.out.println("prior : "+c.priorities);
        }


        while (!queue.isEmpty()) {
            Cons tmp = queue.poll();
            for (Cons x : queue) {
                if (tmp.priorities < x.priorities) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (location == tmp.location) return answer;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Process T = new Process();
        int location = 0;
        int[] priorities = {1, 1, 9, 1, 1, 1};
        System.out.println(T.sol(priorities,location));
    }
}
