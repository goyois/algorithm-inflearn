package algorithm.demo.sec1.string;

import java.util.Scanner;

/**
 *
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * i : a#b!GE*T@S
 * o : S#T!EG*b@a
 *
 */


//5. 특정 문자 뒤집기
public class Main03 {
    public String solution(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if (!Character.isAlphabetic(arr[left])) {
                left++;
            } else if (!Character.isAlphabetic(arr[right])) {
                right--;
            } else {
                //값 스와프
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        String answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args){
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
