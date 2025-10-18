package algorithm.demo;

import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(bf.readLine());
//		String[] arr = new String[num];
//		for (int j = 0; j < num; j++) {
//			arr[j] = bf.readLine();
//		}

//		ArrayList<Integer> list = new ArrayList<>(Arrays.stream(arr)
//				.boxed()
//				.collect(Collectors.toList()));
//
//		int[] answer = list.stream()
//				.mapToInt(Integer::intValue)
//				.toArray();

		//for문 없이 리스트를 배열로
//		String[] answer = new String[list.size()];
//		list.toArray(answer);


		String[] cards1 = {"i", "water", "drink"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};


		String answer = "Yes";
		int p1= 0; int p2 = 0;

		for (String g : goal) {
			if (p1 < cards1.length && cards1[p1].equals(g)) {
				p1++;
			} else if (p2 < cards2.length && cards2[p2].equals(g)) {
				p2++;
			} else {
				answer = "No";
			}
		}


		System.out.println(answer);

		SpringApplication.run(DemoApplication.class, args);
	}
}
