package algorithm.demo.sec2.num;

import java.util.ArrayList;
import java.util.Scanner;

//6.뒤집은 소수
//배열에 담긴 숫자를 뒤집고 해당 숫자가 소수라면 리턴
public class NumMain06 {

    public boolean isPrime(int num){
        if (num == 1)
            return false;

        //2부터 해당 res 까지 약수가 있다면 false : true
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) { //tmp = 123
                int t = tmp % 10; // 3 -> 일의 자리 구함
                res = res * 10 + t; // res(0) * 10 * t(3)
                tmp = tmp / 10; // 1의 자리 버림
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args){
        NumMain06 T = new NumMain06();
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
