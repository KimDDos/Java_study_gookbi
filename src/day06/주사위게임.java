package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지 랜덤수
		 * ex)
		 * 주사위 : 3
		 * 3칸 이동 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동 => ??칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 : 8번 완주
		 * */
		//랜덤값 (주사위 값 1~6까지 생성)
		//목표값=30, sum=합산거리, count=이동횟수
		
		Scanner sc = new Scanner(System.in);
		int move = 30;
		int num = 0;
		int sum = 0;
		int cnt = 0;
		
		while(sum <= 30) {
			int com = (int)(Math.random()*6)+1;
			sum += com;
			System.out.println("주사위 눈 > "+com+"칸 이동," +(move-sum)+ "칸 남았습니다.");
			cnt++;
		}
		System.out.println("도착~! 총"+cnt+"회 던지셨습니다." );
		
		sc.close();
		
	}

}
