package day08;

import java.util.Scanner;

public class 과제 {

	static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 (1~9까지만) => 중복 X
		 * user가 3자리 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 없으면 out
		 * => 3 5 7
		 * 	  3 6 7 => 2s
		 * 	  3 5 7
		 * 	  3 7 6 => 1s 1b
		 * 	  3 5 7
		 * 	  7 3 5 => 3b
		 * 	  3 5 7
		 * 	  1 2 6 => out
		 * 
		 * 	  --야구게임 시작
		 * 	  컴퓨터가 숫자를 정했습니다.
		 * 	  숫자 입력(1~9, 3자리) : 
		 * 	  3 4 5
		 *    결과
		 *    3s 다맞으면 종료 (게임 횟수 출력)
		 * */
		int[] a = getNum();
		print(a); // 정답확인용
		System.out.println();
		System.out.println("=============야구게임==============");
		System.out.println("중복되지 않은 세자리 수의 정답을 입력해주세요.");
		game(a);
		
	}
	
	// 랜덤숫자 배열 저장
	public static int[] getNum() {
		int nums[] = new int[3];
		for(int i=0; i<nums.length; i++) {
			int r = (int)(Math.random()*9)+1;
			if(!contains(nums, r)) {
				nums[i] = r;
			} else {
				i--;
			}
		}
		return nums;
	}
	
	// 게임
	public static void game(int[] num) {
		int strike = 0;
		int ball = 0;
		int numberTry = 0;
		
		while(true) {
			numberTry++;
			int[] user = new int[3];
			for(int i=0; i<user.length; i++) {
				System.out.println(i+1+"째자리수를 입력해주세요.");
				user[i] = scan.nextInt();
			}
		}
	}
	
	// 스트라이크의 수
	public static int findStrike(int[] num, int[] user) {
		int strike = 0;
		for(int i=0; i < num.length; i++) {
			if(num[i] == user[i]) {
				strike++;
			}
		}
		return strike;
	} 
	
	// 볼의 수
	public static int findBall(int[] num, int[] user) {
		int balls = 0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<user.length; j++) {
				if(i != j && num[i] == user[j]) {
					balls++;
				}
			}
		}
		return balls;
	}
	
	// 중복확인
	public static boolean contains(int[] arr, int num) {
		for(int i : arr) {
			if(i==num) {
				return true; // 중복되면 트루
			}
		}
		
		return false;
	}
	
	// 배열출력
	public static void print(int[] arr) {
		for(int num : arr) {
			System.out.println(num + " ");
		}
	}
	
	
}