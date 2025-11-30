package algorithm.demo.sec6;

import java.util.*;

//정렬파트. 선택정렬
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] answer = new int[arr.length];

//        나의 풀이,잦은 교환으로 효율성이 떨어짐
//        for (int i = 0; i < arr.length; i++){
//            int num = arr[i];
//            for (int j = i+1; j < arr.length; j++){
//                if (num > arr[j]){
//                    int tmp = arr[j];
//                    arr[j] = num;
//                    num = tmp;
//                }
//            }
//            answer[i] = num;
//        }


        //가장 낮은 값을 구하고 한번만 교환
        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        for (int x : arr) {
            System.out.println(x);
        }






    }
}
