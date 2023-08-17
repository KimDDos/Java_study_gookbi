package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 입력받아서 
		 * 합계, 평균, 평가를 출력
		 * 평가는 평균 90이상이면 A
		 * 평균 80이상이면 B
		 * 평균 70이상이면 C
		 * 나머지 D
		 * 
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값으로 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요. (0~100)");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력해주세요. (0~100)");
		int eng = scan.nextInt();
		System.out.println("수학 점수를 입력해주세요. (0~100)");
		int math = scan.nextInt();
		
		if (kor < 0 || kor > 100) {
			System.out.println("국어점수를 잘못 입력하셨습니다.");
		}
		if (eng < 0 || eng > 100) {
			System.out.println("국어점수를 잘못 입력하셨습니다.");
		}
		if (math < 0 || math > 100) {
			System.out.println("국어점수를 잘못 입력하셨습니다.");
		}
		
		int sum = 0;
		double avg = 0;
		sum = kor + eng + math;
		avg = sum / 3.0;
		char ch = 'D';			
		
		if(avg >= 90) {
			ch = 'A';
		} else if(avg >= 80) {
			ch = 'B';
		} else if(avg >= 70) {
			ch = 'C';
		} else {
			ch = 'D';
		}
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg + ", 등급 : " + ch + "입니다.");
		System.out.printf("합계 : " + sum + ", 평균 : %.2f" + ", 등급 : " + ch + "입니다.", avg);
		
		// 소수점 자리 지정후 출력하기(prinf)
		// 별도 클래스로 작성 및 연습
		
		scan.close();
	}

}
