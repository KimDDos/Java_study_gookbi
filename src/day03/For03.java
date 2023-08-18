package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/* 단을 입력받아서 입력받은 단을 출력
		 * ex) 2 => 
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * ...
		 * 2*9=19
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num = scan.nextInt();
		
		System.out.println(num+"단");
		for(int i=1; i<10; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
		scan.close();
	}

}

