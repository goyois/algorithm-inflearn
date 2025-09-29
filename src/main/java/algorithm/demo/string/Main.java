package algorithm.demo.string;

import java.util.*;

public class Main {

    /**
     * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
     * 문장속의 각 단어는 공백으로 구분됩니다.
     *
     * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
     *
     * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
     *
     * i : it is time to study
     * o : study
     */

    //알고리즘 시나리오
    //1.비교값을 담을 변수 선언
    //2.공백 기준으로 분리하여 배열 저장
    //3.순회하며 해당 인덱스의 길이 len 과 m 을 비교
    //4.순회하는 인덱스 배열의 길이가 더 크면 m 에 할당하여 갱신 및 해당 배열의 문자열도 갱신
    //6.길이가 같다면 가장 첫번째로 나온 문자열 반환해야하므로 > , >= 사용 시 뒷문자가 반환되기 때문

    //3.문장 속 단어
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;

        String[] s = str.split(" ");

        for (String x : s) {
            int len = x.length();
            if (m < len) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
