package algorithm.demo;

import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

		int[] emergency = {3, 76, 24};
		Integer[] tmp = new Integer[emergency.length];
		int[] answer = new int[emergency.length];

		for (int i = 0; i < emergency.length; i++) {
			tmp[i] = emergency[i];
		}
		Arrays.sort(tmp,Collections.reverseOrder());


		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < tmp.length; j++) {
				if (emergency[i] == tmp[j]) {
					answer[i] = j+1;
				}
			}
		}

		for (int x : answer) {
			System.out.println(x);
		}




		SpringApplication.run(DemoApplication.class, args);
	}
}
