package day02;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		/* 콘솔 입력 : 콘솔에서 값을 입력하여 받을 수 있게 해주는 클래스
		 * Scanner class -> 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 * */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자(정수)를 입력 해주세요!");
//		int num = scan.nextInt();
//		System.out.println("내가 입력한 수는 : " + num);
//		
//		// 콘솔에서 숫자를 하나 입력받아 수가 짝수인지, 홀수인지 출력
//		if(num % 2 == 0) {
//			System.out.println(num + " : 짝수");
//		} else {
//			System.out.println(num + " : 홀수");
//		}
//		
//		scan.close();
		
		// 숫자를 입력받아 양수인지, 음수인지, 0인지 판별하여 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요!");
		int num2 = scan.nextInt();
		
		if(num2 > 0) {
			System.out.println("양수");
		} else if(num2 < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		System.out.println("--------------");
		System.out.println("실수입력 > ");
		double num3 = scan.nextDouble();
		System.out.println("실수입력 > " +num3);
		
		System.out.println("한글자 입력 > ");
		// next() : 문자열 입력
		// next().charAt(index) : 문자열 중 index 번째 한글자를 추출
		//						  index는 0부터 시작함(문자열중 첫번째를 추출하고자 한다면 index는 0)
		
		char ch = scan.next().charAt(0);  // 문자열 입력받는 형태
		System.out.println("한글자 > " +ch);
		
		//문자열 입력 : next()이고 공백 포함 안됨
		System.out.println("문자열 > ");
		String s = scan.next();
		System.out.println("문자열 > " + s);
		scan.nextLine(); // enter 처리용
		// enter 처리용을 안 해놓을경우 공백이 포함되어 출력하는 nextLine()이 강제 실행되어서 입력을 하지못함!
		
		// 여러 문자 입력 : nextLine() 공백을 포함함
		System.out.println("여러 문자 >");
		String str = scan.nextLine();
		System.out.println("여러 문자 >" + str);
		
		scan.close();
		
	}

}
