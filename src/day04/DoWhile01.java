package day04;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/* do~while : 반복문 중 하나
		 * 
		 * do{
		 * 실행문;
		 * }while(조건식);
		 * 
		 * for, while문은 조건식이 처음부터 false면 한번도 실행이 안될 수 있음
		 * 실행문을 먼저 실행하고 나서 조건식을 비교하여 반복 여부를 결정
		 * 조건식이 false 더라도 무조건 1번은 실행함.
		 * 
		 * 메뉴 생성시 많이 사용
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		/* 1.저장하기
		 * 2.새로만들기
		 * 3.종료하기
		 * */
		
		int menu = 0;
		do {
			System.out.println("--Menu--");
			System.out.println("1.저장하기");
			System.out.println("2.새로만들기");
			System.out.println("3.종료하기");
			System.out.println("입력 >");
			
			menu = scan.nextInt();
			
			// 실제 기능 처리구문으로 switch 문을 많이 활용함
			
			switch(menu) {
			case 1:
				// 실제기능
				System.out.println("저장합니다.");
				break;
			case 2:
				// 실제기능
				System.out.println("새로만듭니다.");
				break;
			case 3:
				// 실제기능
				System.out.println("종료합니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
		} while(menu != 3);  // true면 반복이라서 3이 아니면 계속 실행
		scan.close();
		
	}

}
