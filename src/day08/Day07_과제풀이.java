package day08;

import java.util.Scanner;

public class Day07_과제풀이 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 계산기 만들기
		 * (+ - * / %) 각각 메서드 만들기 => 메서드에서 바로 출력
		 * ex) 3 5 => 메뉴
		 * - 원하는 계산을 선택해주세요
		 * - 1:덧셈 / 2:뺄셈 / 3:곱셈 / 4:나눗셈 / 5:나머지
		 * 각 기능 메서드 => 바로 출력 (3 + 5 = 8)
		 * 
		 * 1. 숫자를 입력받는 메서드 => 숫자를 배열에 담아 리턴
		 * 2. 메뉴 메서드 => 메뉴를 출력하고, 메뉴의 번호를 입력받아 리턴
		 * 3. 각 기능 메서드들
		 * 
		 * main에서 할일
		 * 1) 1번 메서드 호출 => 숫자의 배열을 받기
		 * 2) 2번 메서드 호출 => 내 선택 번호 가져오기
		 * 3) switch(번호)
		 * 4) 기능 메서드 호출
		 * */
		int nums[] = getNums();
		int select = getSelect();
		switch(select) {
		case 1: sum(nums); break;
		case 2: sub(nums); break;
		case 3: mul(nums); break;
		case 4: div(nums); break;
		case 5: rem(nums); break;
		default:
			System.out.println("잘못된 연산~!!");
			
		}
		System.out.println("계산기 종료~!!");
		
		
	}

	/* 숫자를 배열로 입력받는 메서드 
	 * 매개변수 : X
	 * 리턴타입 : 배열 => int[]
	 * 메서드명 : getNums()
	 * */
	public static int[] getNums() {
		int[] nums = new int[2];
		for(int i=0; i<nums.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력 >");
			nums[i] = scan.nextInt();
		}
		return nums;
	}
	
	/* 메뉴를 나타내는 메서드
	 * 매개변수 : X
	 * 리턴타입 : 메누에서 선택한 값 => int
	 * */
	public static int getSelect() {
		System.out.println("원하는 계산을 선택>");
		System.out.println("1.덧셈|2.뺄셈|3.곱셈|5.나눗셈|5.나머지");
		int select = scan.nextInt();
		return select;
	}
	
	/* 각 기능(+ - * / %)메서드 => 출력
	 * 리턴타입 : void
	 * 매개변수 : 배열 
	 * */
	
	public static void sum(int num[]) {
		System.out.println(num[0]+"+"+num[1]+"="+(num[0]+num[1]));
	}
	public static void sub(int num[]) {
		System.out.println(num[0]+"-"+num[1]+"="+(num[0]-num[1]));
	}
	public static void mul(int num[]) {
		System.out.println(num[0]+"*"+num[1]+"="+(num[0]*num[1]));
	}
	public static void div(int num[]) {
		System.out.println(num[0]+"/"+num[1]+"="+((double)num[0]/num[1]));
	}
	public static void rem(int num[]) {
		System.out.println(num[0]+"%"+num[1]+"="+(num[0]%num[1]));
	}
	
}
