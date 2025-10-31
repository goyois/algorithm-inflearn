package algorithm.demo.sec4;

import java.util.*;

//hash 학급 회장
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        HashMap<Character,Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        char answer = ' ';
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            int num = map.get(key);
            if (max < num) {
                max = num;
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
