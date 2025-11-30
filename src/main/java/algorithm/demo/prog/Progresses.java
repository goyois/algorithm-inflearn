package algorithm.demo.prog;

import java.util.*;

//프로그래머스 기능개발 문제
public class Progresses {
    public static void main(String[] args) {
        /**
         * progresses 원소를 갖는 queue 를 생성한다
         * speeds 의 원소를 하나씩 순회한다
         * progresses 에 있는 첫번째 원소 93 이 100이 될때까지 for 문을 실행한다
         * 100 이 될 때 순회한 횟수 = day
         * 93 = 7일이 걸린다
         * day = 7 이라는 값을 변수에 담고 93을 poll 한다
         * 다음 숫자가 100이 될때까지 걸린 일자가 7과 같거나 이하라면
         * 7이라는 해시맵에서 키가 7인 원소를 찾아서 1을 더해준다
         * 7 이상일 경우 새로운 키를 만들어서 1을 넣는다
         * 값이 7이상이라면 다음 순회 전에 day = tmp 로 초기화해준다
         *
         */

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        Queue<Integer> pq = new LinkedList<>();
        Queue<Integer> sq = new LinkedList<>();

        for (int x : progresses) {
            pq.offer(x);
        }
        for (int x : speeds) {
            sq.offer(x);
        }

        int fp = pq.poll();
        int fs = sq.poll();
        int day = 0;
        for (int i = fp; i < 100; i = i + fs) {
            day++;
        }
        map.put(day,1);


        for (int x : sq) {
            int prog = pq.poll();
            int tmp = 0;
            for (int i = prog; i < 100; i = i + x) {
                tmp++;
            }
            if (day >= tmp) {
                map.put(day, map.get(day) + 1);
            } else {
                map.put(tmp,1);
                day = tmp;
            }
        }

        int[] answer = new int[map.size()];
        int idx = 0;
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            answer[idx] = x.getValue();
            idx++;
        }
        for (int x : answer) {
            System.out.println(x);
        }


    }
}
