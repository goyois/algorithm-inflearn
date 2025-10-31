package algorithm.demo.sec4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) +1);
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
