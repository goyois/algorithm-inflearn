package algorithm.demo.sec1.string;

import java.util.Scanner;

//9.숫자만 추출


//아스키 문자형 '0'(48) ~ '9'(57)

public class Main07 {
    public int solution(String str) {
//        String answer = 0;
          String answer = "";
        for (char x : str.toCharArray()) {
            //방법 1
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);

                //char 가 + 와 만나면 문자형으로 인식하여 숫자가 됨
//                  0  =  0 * 10 + 0
//                  1  =  0 * 10 + 1
//                  12  = 1 * 10 + 2
//                  120 = 12 * 10 +  0
//                  1205  = 120 * 10 + 5
//            }

            //방법 2
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);


//        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
