package day07;

import java.util.Scanner;

public class Day06_과제풀이 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택
		 * (0=가위, 1=바위, 2=보)
		 * 나도 가위, 바위, 보 중 선택해서 입력 (숫자, 문자상관없음.)
		 * 결과 =>
		 * 컴퓨터 > 가위, 나 > 가위  => 결과 무승부입니다. 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("--가위바위보 게임 시작--");
		
		int comNum = (int)(Math.random()*3);
		System.out.println("컴퓨터가 결정을 완료했습니다.");
		System.out.print("가위/바위/보 중 하나를 선택하세요 > ");
		String myChoice = scan.next();  // 내 선택 (가위, 바위, 보)
		
		// 컴퓨터의 선택을 Stirng으로 변경
		String comChoice = (comNum==0)? "가위" : (comNum==1)? "바위" : "보";
		System.out.println("com 선택: "+comChoice);
		
		// 비교(문자끼리 비교 ==(x) equals를 사용하여 비교)
		if(comChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		} else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")?"이겼습니다.":"졌습니다.");
			} else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")?"이겼습니다.":"졌습니다.");
			} else {
				System.out.println(myChoice.equals("가위")?"이겼습니다.":"졌습니다.");
			}
		}
		
		scan.close();
		
	}

}
