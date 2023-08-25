package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택
		 * (0=가위, 1=바위, 2=보)
		 * 나도 가위, 바위, 보 중 선택해서 입력 (숫자, 문자상관없음.)
		 * 결과 =>
		 * 컴퓨터 > 가위, 나 > 가위  => 결과 무승부입니다. 
		 * */
		
		Scanner sc = new Scanner(System.in);
		String[] game = {"가위","바위","보"};
		int comNum = (int)(Math.random()*3);
		/* 가위:0 , 바위:1, 보:2 */
		System.out.println("가위, 바위, 보 혹은 숫자 0~2중 하나를 입력해주세요.");
		System.out.println("가위 : 0, 바위 : 1, 보:2");
		String str = sc.next();
		int choice = 5;
		
		for(;;) {
			if(str.equals("0") || str.equals("가위")) {
				choice = 0;
				break;
			} else if(str.equals("1") || str.equals("바위")) {
				choice = 1;
				break;
			} else if(str.equals("2") || str.equals("보")) {
				choice = 2;
				break;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
				str = sc.next();
			}
		}
		
		switch(choice) {
		case 0: 
			if (comNum == 0) {
				System.out.println("나 > " +game[0]+" / 컴퓨터 > "+game[comNum]+ " 비겼습니다.");
			} 
			if(comNum == 1) {
				System.out.println("나 > " +game[0]+" / 컴퓨터 > "+game[comNum]+ " 졌습니다.");
			}
			if(comNum == 2) {
				System.out.println("나 > " +game[0]+" / 컴퓨터 > "+game[comNum]+ " 이겼습니다.");
			}
			break;
		case 1: 
			if (comNum == 0) {
				System.out.println("나 > " +game[1]+" / 컴퓨터 > "+game[comNum]+ " 이겼습니다.");
			} 
			if(comNum == 1) {
				System.out.println("나 > " +game[1]+" / 컴퓨터 > "+game[comNum]+ " 비겼습니다.");
			}
			if(comNum == 2) {
				System.out.println("나 > " +game[1]+" / 컴퓨터 > "+game[comNum]+ " 졌습니다.");
			}
			break;
		case 2: 
			if (comNum == 0) {
				System.out.println("나 > " +game[2]+" / 컴퓨터 > "+game[comNum]+ " 졌습니다.");
			} 
			if(comNum == 1) {
				System.out.println("나 > " +game[2]+" / 컴퓨터 > "+game[comNum]+ " 이겼습니다.");
			}
			if(comNum == 2) {
				System.out.println("나 > " +game[2]+" / 컴퓨터 > "+game[comNum]+ " 비겼습니다.");
			}
			break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
		}
		
	}

}
