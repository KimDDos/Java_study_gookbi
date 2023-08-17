package day02;

import java.util.Scanner;

public class IF01 {

	public static void main(String[] args) {
		/* 조건문 : 조건식이 참일경우 실행문을 실행하는 문
		 * if문, switch문
		 * if문(조건식) { 실행문; }
		 * 실행문은 한줄일 경우 생략이 가능하나, 숙달되고서 하는 것을 추천함, 나중에 에러나서 못 찾는 경우가 허다함
		 * 조건식이 참일때 실행문을 실행
		 * */
		
		int num = 0;
		// num이 0보다 크면 양수
		if(num > 0) {
			System.out.println("양수");
		}
		
		// num이 0보다 크면 양수, 아니면 음수
		if(num > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		
		// num이 0보다 크면 양수, 아니면 음수, 0이면 0
		if(num > 0) {
			System.out.println("양수");
		} else if(num == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		
		// num이 0보다 크면 양수 (10보다 크면 10보다 크다.) / 아니면 음수 / 0이면 0
		num = 0;
		if(num > 0) {
			System.out.println("양수");
			if(num > 10) {
				System.out.println("10보다 크다.");
			}
		} else if(num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		// 위와 같이 if안에 if문을 넣는 다중 if문을 활용 할 수 있음
		
		// num2 값을 저장하고, num2가 짝수인지 홀수인지 콘솔에 찍기
		
		int num2 = 8;
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}

}
