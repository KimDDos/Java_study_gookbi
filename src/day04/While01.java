package day04;

public class While01 {

	public static void main(String[] args) {
		/* while : 반복문 중 하나.
		 * while(조건식) { // true 일때 반복}
		 * 실행문;
		 * 증감식;
		 * }
		 * */
		
		/* 1~10까지 출력
		 * */
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("-------------");
		
		int i = 1;  // 초기화
		while(i <= 10) {
			System.out.print(i + " ");
			i++;    // 증감식
		}
		System.out.println();
		System.out.println("-------------");
		
		/* 1~10까지 짝수만 출력
		 * */
		
		int j=1;
		while(j<=10) {
			if(j % 2 == 0) {
			System.out.print(j+" ");
			}
			j++;
		}
		
	}

}
