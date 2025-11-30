package algorithm.demo.prog;

import java.util.Arrays;
import java.util.Collections;

public class MakeMin {
    public static void main(String[] args) {


        int[] a = {1,2};
        int[] b = {3,4};

        int answer = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        int idx = b.length -1;
        for (int i = 0; i < a.length; i++){
            answer += a[i] * b[idx];
            idx--;
        }

        System.out.println(answer);
    }
}
