package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 5자리의 숫자를 입력 받아서 입력 받은 숫자를 거꾸로 출력
		 * 각 자리의 합계 출력
		 * ex) 11456 -> 65411 -> 6+5+4+1+1
		 * ex) 19547 -> 74591 -> 7+4+5+9+1
		 * */
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int input = 0;
		int sum = 0;
		
		System.out.println("5자리 정수를 입력해주세요.");
		for (;;) {  // 무한루프 for문을 통한 예외처리 구문
			input = sc.nextInt();
			if (0 > input || input > 99999) {
				System.out.println("잘못된 값을 입력하셨습니다.");
				input = sc.nextInt();
			} else {
				break;
			}
		}
		
		int i = 0;
		while(input > 0) {
			int b = input % 10;  // 마지막 자리를 나머지로 받기
			num[i] = b;
			sum += b;
			input = input / 10;  // 5자리를 1자리씩 계속 줄여주는 역할
			i++;
			/* 위에 while문 구동 예시
			 * 입력 > 12345
			 * i = 0; 12345 % 10 = 5; num[0] = 5; input = 1234;
			 * i = 1; 1234 % 10 = 4; num[1] = 4; input = 123;
			 * i = 2; 123 % 10 = 3; num[2] = 3; input = 12;
			 * i = 3; 12 % 10 = 2; num[3] = 2; input = 1;
			 * i = 4; 1 % 10 = 1; num[4] = 1; input = 0;
			 * num[5] 이기에 구문 종료
			 * */
			
			
		}
		
		System.out.println("sum: " + sum);
		
		/* String s = "12345";
		 * String s1[] = new String[5];
		 * 
		 * s1 = s.split("");  // 특정 문자를 기준으로 나누기
		 * int sum = 0;
		 * for(int i=0; i<s1.length; i++) {
		 * 	  System.out.println(s1[4-i]);
		 * 	  sum += Integer.parseInt(s1[i]);  // 문자를 숫자로 바꾸기
		 * }
		 * system.out.println(sum)
		 * */
		
		sc.close();
		
	}
	
}
