package algorithm.demo.sec3.two_pointers;


import java.util.*;
//1.두 배열 합치기
//투포인터를 활용해 2개의 오름차순된 배열의 값을 1개의 배열로 통합하여 오름차순 정렬하는 방법
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0; int p2 = 0;
        //2개 포인터의 인덱스 값보다 배열의 길이가 크다면 참
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                list.add(a[p1++]);
            } else list.add(b[p2++]);
        }
        //p1 과 p2 중 거짓인 포인터는 알 수 없으므로 추가적인 while 문으로
        //나머지 원소를 다 넣어준다
        while (p1 < n) list.add(a[p1++]);
        while (p2 < m) list.add(b[p2++]);

    }
}
