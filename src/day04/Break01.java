package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		/* Break문 : 반복문을 빠져나오게 하는 키워드
		 * - 반복문에서 조건문을 동반하여 조건을 만족하면 반복문으 벗어나는 역할
		 * - 다중 for문에서는 나를 포함하는 for문만 벗어날 수 있음.
		 * - 바깥쪽 for문을 벗어나고 싶을 때는 for 이름을 붙여 벗어날 수 있음.
		 * 
		 * a: for() {
		 * 	if() {
		 *	  break a; 
		 * 	}
		 * }
		 * */
		
		/* 1~10까지 출력
		 * 조건식을 생략(무한루프) break를 이용하여 10이되면 벗어나게 설정
		 * */
		
		for(int i=1; ; i++) {
			System.out.println(i + " ");
			if(i==10) {
				break;
			}
		}
		
		/* 한글자를 입력받아서 글자를 그대로 출력(반복해서 출력)
		 * y를 입력받으면 종료
		 * a -> a, b -> b, ...y -> 종료
		 * */
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
			char ch = scan.next().charAt(0);
			if(ch == 'y' || ch == 'Y') {
				break;
			}
			System.out.println(ch);
		}
		scan.close();
		
		
	}

}
