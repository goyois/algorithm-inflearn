package algorithm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

		int[] arr = {2,1,3,4,1};
		int[] answer = new int[arr.length];
		HashSet<Integer> set = new HashSet<>();


		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					int num = arr[i] + arr[j];
					System.out.println(num);
					set.add(num);
				}
			}
		}

		List<Integer> tmpList = new ArrayList<>(set);
		Collections.sort(tmpList);

		System.out.println(set);


		SpringApplication.run(DemoApplication.class, args);
	}
}
