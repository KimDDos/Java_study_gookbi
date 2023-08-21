package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와, 평균을 출력
		 * 최고점수
		 * */
		Scanner scan = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		double avg = 0;
		int max = 0;
		
		System.out.println("다섯명의 점수를 입력해주세요.");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 점수 입력 > ");
			score[i] = scan.nextInt();
			a: for (;;) { // 예외처리
				if (0 > score[i] || score[i] > 100) {
					System.out.println("점수를 다시 입력해주세요.");
					score[i] = scan.nextInt();
				} else {
					break a;
				}
			}
			sum += score[i];
			avg = (double) sum / score.length;
			if (score[0] < score[i]) {
				max = score[i];
			} else if (score[i] < score[0]) {
				max = score[0];
			} else {
				max = score[0];
			}
		}
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		System.out.println("최고점수 : " + max);
		
		
		scan.close();
	}

}
