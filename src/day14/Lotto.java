package day14;

import java.util.Scanner;

public class Lotto {

	private int[] nums = new int[6];
	private int bonusNum;
	private int cnt;
	
	
	// 수동 입력
	public void insertNums(Scanner sc) {
		int num = sc.nextInt();
		if(0>num || num>45) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	// 예외처리(중복)
	public void exception() {
		
	}
	
	
}
