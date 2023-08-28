package day09;

import java.util.Scanner;

import day08.Lotto;

public class day08_과제풀이 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성(1~9까지만) => 중복 X
		 * user가 3자리 숫자를 맞추는 게임
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 없으면 out
		 * 
		 * => 3 5 7
		 *    3 6 7 => 2s
		 *    3 5 7
		 *    3 7 6 => 1s 1b
		 *    3 5 7
		 *    7 3 5 => 3b
		 *    3 5 7
		 *    1 2 6 => out
		 *    
		 *    -- 야구게임 시작
		 *    컴퓨터가 숫자를 정했습니다.
		 *    3 4 5 
		 *    결과
		 *    3s 다맞으면 종료 (게임 횟수 출력)
		 * */
		
		// 1. 입력을 위한 스캐너 열기
		Scanner scan = new Scanner(System.in);
		
		// 2. 변수 선언
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		int count = 0;
		
		// 3. 컴퓨터가 결정한 3가지 숫자를 중복되지 않게 추출
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break; // for(j) 구문을 빠져나감
				}
			}
		}
		
		// 출력 확인용
		for(int tmp : comNum) {
			System.out.print(tmp+" ");
		}
		
		// lotto 메서드의 randomArray 배열과 printArray배열을 호출
		// static 메서드는 객체 생성없이 클래스명.메서드명()으로 호출이 가능
//		System.out.println();
//		Lotto.randomArray(comNum);
//		Lotto.printArray(comNum);
		
		// static이 아닌 경우, 객체를 생성하여 객체명.메서드명() 호출가능
//		Lotto l = new Lotto();
//		l.randomArray(comNum);
//		l.printArray(comNum);
		
		
		// 4. 사용자 숫자 입력받기
		while(true) {
			int s=0;
			int b=0;
			System.out.println("숫자 입력(1~9, 숫자 3개) > ");
			
			for(int i=0; i<myNum.length; i++) {
				myNum[i]= scan.nextInt(); 
			}
			count++;  // 게임 횟수 카운트 증가
			
			// 5. 숫자 비교
			for(int i=0; i<comNum.length;i++) {
				for(int j=0; j<myNum.length; j++) {
					// 스트라이크 기준 자리와 숫자가 일치
					if(comNum[i] == myNum[j] && i == j) {
						s++;
					} else if(comNum[i] == myNum[j] && i != j) {
						b++;
					}
				}
			}
			
			// 6. 출력
			if(s==0 && b==0) {
				System.out.println("out!");
			} else {
				System.out.println(s+"s"+b+"b");
				System.out.println("게임횟수 :"+count);
			}
			
			if(s==3) {
				System.out.println("정답~!!");
				System.out.println("게임횟수 :"+count);
				break;
			}
		}
		
		scan.close();
		
	}
	
}
