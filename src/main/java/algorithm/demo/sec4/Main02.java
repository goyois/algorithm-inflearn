package algorithm.demo.sec4;


import java.util.*;

public class Main02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String answer = "YES";

        HashMap<Character,Integer> map = new HashMap<>();
        for (char s : s1.toCharArray()) {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for (char s : s2.toCharArray()) {
            if (!map.containsKey(s) || map.get(s) == 0) {
                answer = "NO";
                break;
            }
            map.put(s,map.get(s)-1);
        }

        System.out.println(answer);
    }
}
