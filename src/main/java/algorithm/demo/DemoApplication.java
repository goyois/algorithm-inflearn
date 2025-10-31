package algorithm.demo;

import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.*;


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


		//배열 원소를 셋으로 초기화
//		HashSet<Integer> set = Arrays.stream(nums)
//				.boxed()
//				.collect(Collectors.toCollection(HashSet::new));




//		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//		2번 수포자가 찍는 방식: 2 1,  2 3, 2 4, 2 5,
//		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

		int n = 3;
		System.out.println(n / 1234567);

		SpringApplication.run(DemoApplication.class, args);
	}
}
