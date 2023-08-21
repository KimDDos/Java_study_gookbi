package day04;

public class While02 {

	public static void main(String[] args) {
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * ...
		 * 42 44 46 48 50
		 * 
		 * 1~ 50까지 짝수만 출력
		 * 5개씩 한줄로
		 * 
		 * */
		//복습풀이
		for(int i=1; i<=50; i++) {
			if(i % 2 ==0) {
				System.out.print(i + " ");
			} 
			if(i % 10 ==0) {
				System.out.println();
			}
		}
		
		System.out.println("---------------");
		// 강사풀이
		for(int i=1; i<=50; i++) {
			if(i % 2 ==0) {
				System.out.print(i + " ");
				if(i % 10 ==0) {
					System.out.println();
				}
			} 
		}
		System.out.println("---------------");
		
		int k = 0;
		while(k<=50) {
			k++;
			if(k % 2 == 0) {
				System.out.println(k + " ");
			}
			if(k % 10 == 0) {
				System.out.println();
			}
		}
		
		
	}

}
