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















		SpringApplication.run(DemoApplication.class, args);
	}
}
