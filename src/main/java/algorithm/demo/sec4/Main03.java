package algorithm.demo.sec4;

import java.util.*;

public class Main03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//      7 4
//      20 12 20 10 23 17 10
//      3 4 4 3

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<k-1; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            list.add(map.size());
            map.put(arr[lt],map.get(arr[lt]) -1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }

        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
