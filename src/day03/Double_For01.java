package day03;

public class Double_For01 {

	public static void main(String[] args) {
		
		/* 별찍기를 이중 for문으로 시행해보기
		 * 
		 * */
		
		// 별 10개 반복 출력
		for(int i=1; i<=10; i++) {
			System.out.print("*");  // 출력값 : ********** 
		}
		
		System.out.println();
		
		// 별의 모양을 갖춰서 출력은 어떻게 할까? 
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  위와 같이 출력해보자
		 * */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
	}

}
