package algorithm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

		String s = "banana";
		int[] answer = new int[s.length()];
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				System.out.println(true);
				int v = map.get(c);
				answer[i] = i - v;
			}
			else answer[i] = -1;

			map.put(c,i);
		}



		for (int i : answer) {
			System.out.println(i);
		}



		SpringApplication.run(DemoApplication.class, args);
	}
}
