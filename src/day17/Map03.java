package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map03 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 과목 : 점수, 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복 (종료키워드 =0)
		 * 과목 > 국어 점수 > 89
		 * 다시 입력? 종료(0) >
		 * 종료 후 과목: 점수, 합계, 평균 출력
		 * */
		
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		int exit=-1;
		
		while(exit!=0) {
			// 입력
			System.out.println("과목, 점수 >");
			String subject = sc.next();
			int score = sc.nextInt();
			
			map.put(subject, score);
			System.out.println("계속:1, 종료:0");
			exit = sc.nextInt();
		}
		
		int sum=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			sum += map.get(subject);
			System.out.println(subject+":"+map.get(subject));
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+(double)sum/map.size());
		
		sc.close();
	}

}
