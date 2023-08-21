package day04;

public class 이중For01 {

	public static void main(String[] args) {
		/* 별찍기
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * ***** 
		 * 5 * 5로 별찍기
		 * 
		 * */
		
		// for문
		for(int i=1; i <= 5; i++) {
			for(int j =1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		//while문
		int k = 1;
		while(k <= 5) {
			int u = 1;
			while(u <= 5) {
				System.out.print("*");
				u++;
			}
			k++;
			System.out.println();
		}
		
		System.out.println("--------------");
		
		/* *		i=1, j=1
		 * **		i=2, j=2
		 * ***		i=3, j=3
		 * ****		i=4, j=4
		 * *****	i=5, j=5
		 * */
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				if(j <= i) {    // 작성할때 언제나 for문의 중심인 변수가 무엇인지 고민해보고 해야됨
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		// 위와 동일한 예제
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 위와 동일한 예제
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		// if문을 이용하는 방법
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j <= 5-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		for(int i=1; i <= 5; i++) {
			// 공백
			for(int j=1; j <=5-i; j++) {
				System.out.print(" ");
			}
			// 별
			for(int o = 1; o <= i; o++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
