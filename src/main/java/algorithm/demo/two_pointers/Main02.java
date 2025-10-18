package algorithm.demo.two_pointers;


import java.util.*;

//2.교집합 공통 원소 구하기 (two pointer)
public class Main02 {
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


        //오름차순으로 배열을 병합할 때는 대상 배열을 꼭 오름차순을 해야함
        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0; int p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) { //두 원소가 일치할 경우 두 배열 인덱스 전부 +1
                list.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) { //a[p1] 보다 b[p2]가 클 경우 b배열에는 a[p1] 보다 큰 수가 있을 수 없다 (오름차순이므로)
                p1++;
            } else {
                p2++;
            }
        }


        System.out.println(list);



    }
}
