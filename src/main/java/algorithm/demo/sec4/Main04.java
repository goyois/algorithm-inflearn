package algorithm.demo.sec4;

import java.util.HashMap;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //bacaAacba
        String b = sc.next(); //abc

        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        //비교 대상 abc 를 해시맵에 문자형으로 잘라 넣는다.
        for (char c : b.toCharArray()){
            bm.put(c,bm.getOrDefault(c,0)+1);
        }

        //대상 문자를 2자리까지만 윈도우 세팅한다
        int l = b.length() -1;
        for (int i = 0; i<l; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = l; rt < a.length(); rt++) {
            //1.index(rt) 가 2인 문자를 넣는다.
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            //2.해시맵을 비교하며 카운트한다.
            if (am.equals(bm)) answer++;
            //3.비교 후 rt 증가하기전에 am에서 lt 지점 벨류 1 차감
            am.put(a.charAt(lt),am.get(a.charAt(lt))-1);
            //4.차감된 lt 지점 벨류가 만약 0이라면 삭제하고 lt 증가
            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }
        System.out.println(answer);
    }
}
