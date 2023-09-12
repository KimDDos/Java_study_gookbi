package day19;

import java.util.Arrays;

public class Stream03 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * 중복제거 .distinct()
		 * */
		
		int[] arr = {5,6,1,2,4,7,8,9,3,2,4,7,8};
		Arrays.stream(arr).sorted().forEach(a->System.out.print(a+" "));
		System.out.println();
		System.out.println("----------------");
		
		Arrays.stream(arr)
		.sorted()
		.distinct()
		.forEach(a->System.out.print(a+" "));
		
		System.out.println();
		System.out.println("-----------------");
		
		// 배열로 리턴
		int result[] = Arrays.stream(arr)
				.filter(n->n%2==0)
				.sorted()
				.distinct()
				.toArray();
		for(int tmp:result) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		// reduce() : 계산 a = a-b
		// int a = 1; // 초기값
		int sum = Arrays.stream(arr)
				.filter(n->n%2==0)
				.distinct()
				.reduce(1, (a,b)->a*b);
		System.out.println(sum);
		
	}

}
