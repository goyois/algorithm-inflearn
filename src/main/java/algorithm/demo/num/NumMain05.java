package algorithm.demo.num;

import java.util.Scanner;

//5.소수 찾기 (에라토스테네스 체)
//자연수 N 이 입력되면 1부터 N까지 소수의 개수를 출력
public class NumMain05 {

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1]; //n만큼 순회해야하므로 length+1 동적 배열 생성
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j= j+i) { // 2 부터 n까지 2-4-6-8... 같이 배수의 배열만 순회
                    ch[j] = 1; //n 까지 i 를 배수로 갖는 수를 지우며 소수를 카운트
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        NumMain05 T = new NumMain05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
