package day02;

import java.util.Scanner;

public class 과제_day02 {

	public static void main(String[] args) {
		/* 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 +, -, *, /, %
		 * ex)
		 * 3 2 +  -> 3+2=5 
		 * 6 3 /  -> 6/3=5
		 * 만약 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개를 입력해주세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("연산자(+,-,*,/,%) 1개를 입력해주세요.");
		char ch = scan.next().charAt(0);
		
		int sum;
		
		switch(ch) {
		case '+':
			sum = num1 + num2;
			System.out.println("" + num1 + " + " + num2 + " = " + sum);
			break;
		case '-':
			sum = num1 - num2;
			System.out.println("" + num1 + " - " + num2 + " = " + sum);
			break;
		case '*':
			sum = num1 * num2;
			System.out.println("" + num1 + " * " + num2 + " = " + sum);
			break;
		case '/':
			sum = num1 / num2;
			System.out.println("" + num1 + " / " + num2 + " = " + sum);
			break;
		case '%':
			sum = num1 % num2;
			System.out.println("" + num1 + " % " + num2 + " = " + sum);
			break;
			default: 
				sum = 0;
				System.out.println("잘못된 입력입니다.");
		}
	}

}
