package day07;

import java.util.Scanner;

public class 과제 {

	static Scanner sc = new Scanner(System.in);
	
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
		
		System.out.println("==사칙연산 계산기==");
		System.out.println("계산할 두 숫자를 입력해주세요.");
		int[] r = num();
		int choice = myChoice();
		
		switch (choice) {
		case 1:	add(r[0], r[1]); break;
		case 2:	sub(r[0], r[1]); break;
		case 3:	mul(r[0], r[1]); break;
		case 4:	div(r[0], r[1]); break;
		case 5:	rem(r[0], r[1]); break;
		default:
			System.out.println("프로그램을 다시 시행해주세요.");
			break;
		}
		System.out.println("계산기 종료~!!");
		
	}

	public static void add(int num1, int num2) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	public static void sub(int num1, int num2) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	public static void div(int num1, int num2) {
		System.out.println(num1+"/"+num2+"="+((double)num1/num2));
	}
	public static void rem(int num1, int num2) {
		System.out.println(num1+"%"+num2+"="+(num1%num2));
	}
	void m() {
		sc.next();
		
	}
	
	public static int[] num() {
		int[] num = new int[2];
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		return num;
	}

	public static int myChoice() {
		int choice = 0;
		System.out.println("--계산기--");
		System.out.println("--1: 덧셈--");
		System.out.println("--2: 뺄셈--");
		System.out.println("--3: 곱셈--");
		System.out.println("--4: 나누기--");
		System.out.println("--5: 나머지--");
		System.out.println("입력 > ");
		choice = sc.nextInt();
		while(0>choice || choice >5) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			choice = sc.nextInt();
		}
		return choice;
	}
	
}
