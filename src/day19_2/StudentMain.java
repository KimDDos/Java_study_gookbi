package day19_2;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/* 메뉴를 출력하여 사용자로부터 어떤 기능을 수행할 것인지 처리
		 * 1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		int menu=0;
		
		sm.testSetting();
		
		do {
			System.out.println("---수강관리 프로그램---");
			System.out.println("1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료");
			System.out.println(">> 매뉴입력 >");
			menu=sc.nextInt();
			
			switch (menu) {
			case 1:	sm.insertStudent(sc); break;
			case 2:	sm.searchStudent(sc); break;
			case 3:	sm.printStudent(); break;
			case 4:	sm.registerSubject(sc); break;
			case 5:	sm.deleteSubject(sc); break;
			case 6:	 break;
			default: System.out.println("잘못된 입력입니다.");
			}
			
		} while(menu!=6);
		System.out.println("프로그램 종료");
	}
}
