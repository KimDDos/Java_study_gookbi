package day03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/* num = 6 의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * */
		
		// 6/1=0, 6/2=0, 6/3=0, 6/4=2, 6/5=1, 6/6=0
		//1부터 num까지 1씩증가
		
		int num = 16;
		System.out.print(num + "의 약수 : ");
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("------------------");
		
		// num을 입력받아서 그 수의 약수를 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num1 = scan.nextInt();
		
		System.out.print(num1 + "의 약수 : ");
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("------------------");
		
		scan.close();
	}

}
