package day08;

import java.util.Scanner;

public class 과제02 {

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
		
		
		/* 1. 1~9까지 숫자를 저장하는 3개의 배열 생성하는 메서드
		 *    생성간에 일치하는 숫자를 제거하는 것도 시행
		 *    // 클래스로 만들어봐?
		 * 2. user가 3자리 숫자를 입력하는 메서드
		 * 3. 정답을 비교하는 메서드
		 * */
		
		game g = new game();
		
		int arr[] = getNum();
		int user[] = userNum();
		
			g.gameSet(arr, user);
			
				
		}
	
	/* 랜덤수를 생성하고 배열에 저장하는 메서드
	 * */
	public static int[] getNum() {
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*3)+1;
		}
		System.out.println("컴퓨터가 값을 설정하였습니다.");
		return arr;
	}
	
	/* user가 숫자값을 입력하는 메서드
	 * */
	public static int[] userNum() {
		int[] num = new int[3];
		for(int i=0; i<num.length; i++ ) {
			for(;;) {
				System.out.println(i+1+"번째 숫자를 입력해주세요. (1~9 중 하나)");
				num[i] = scan.nextInt();
				if(1>num[i] || num[i]>9) {
					System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
					num[i] = scan.nextInt();
				} else {
					break;
				}
			}
		}
		System.out.println("게임 시작~!");
		return num;
	}
	
}

/* 외부 클래스로 게임 구현
 * */
class game {
	public void gameSet(int[] arr, int[] nums) {
		int s = 0;
		int b = 0;
		int o = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == nums[i]) {
				s++;
			} 
			for(int j=0; j<arr.length; j++) {
				if(i!=j && arr[i] == nums[j]) {
					b++;
				}
			}
		}
		if(s==3) {
			o = 3;
			s = 0;
		}
		
		if(o==3) {
			System.out.println("3o");
			System.out.println("게임종료~!");
		} else {
			System.out.println(s + "S " + b +"B");
		}
	};
}
