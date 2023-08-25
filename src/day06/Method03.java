package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 + - * / %
		 * 두 수와 연사자를 입력받아서 메서드를 활용하여 연산
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--java 계산기--");
		System.out.println("연산자를 입력해주세요.");
		String op = sc.next();
		
		System.out.println("두 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// 메서드 완성
		switch(op) {
		case "+":
			add(op, num1, num2);
			break;
		case "-":
			int r = sub(num1, num2);
			System.out.println(r);
			break;
		case "*":
			mul(op, num1, num2);
			break;
		case "/":
			div(op, num1, num2);
			break;
		case "%":
			// rem2를 호출하여 몫과 나머지를 출력
			rem(op, num1, num2);
			double[] d = rem2(num1, num2);
			System.out.println(d[0]+"..."+d[1]);
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}
		
		sc.close();
		
	}
	
	// 값을 연산자까지 매개변수로 받아 리턴없이 출력한 메서드
	public static void add(String op, int num1, int num2) {
		System.out.println(num1 + op + num2 +"="+(num1+num2));
	} 
	// 두 정수를 매개변수로 받아 결과를 리턴 받는 형태의 메서드
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static void mul(String op, int num1, int num2) {
		System.out.println(num1+op+num2+"="+(num1*num2));
	}
	public static void div(String op, int num1, int num2) {
		System.out.println(num1+op+num2+"="+((double)num1/num2));
	}
	public static void rem(String op, int num1, int num2) {
		System.out.println(num1+op+num2+"="+(num1%num2));
	}
	public static double[] rem2(int num1, int num2) {
		double d[] = new double[2];
		d[0] = num1/num2;
		d[1] = num1 % num2;
		return d;
	}
}
