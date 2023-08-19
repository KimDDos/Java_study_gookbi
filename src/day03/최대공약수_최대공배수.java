package day03;

import java.util.Scanner;

public class 최대공약수_최대공배수 {

	public static void main(String[] args) {
		/*
		 * 최대공약수 정리 유클리드 호제법이라고 부르는 알고리즘으로 최대공약수를 구하는 것임 두양의 정수 a,b(a>b)에 대해여 a=bq+r(0
		 * <= r < b)이라 하면, a,b의 최대공약수는 b,r의 최대공약수와 같다. 즉 gcd(a,b) = gcd(b,r) r=0이라면 a,b의
		 * 최대공약수는 b가 된다.
		 * 
		 */

		
		
		// 값을 입력받아 최대공약수 및 최대 공배수 비교하는 예제
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int max = 0;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
		}

		int min = (num1 + num2) / max;

		System.out.println("최대공약수 : " + max);
		System.out.println("최소공배수 : " + min);

	}

}
