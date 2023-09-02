package studentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/* 메뉴를 출력하여 사용자로부터 어떤 기능을 수행할 것인지 처리
		 * 1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		String str = null;
		
		sm.testSetting("테스트", "자바");
		sm.testSetting("테스트", "자바");
		sm.testSetting("테스트", "자바");
		sm.testSetting("테스트", "자바");
		sm.testSetting("테스트", "자바");
		
		int menu = 0;
		do {
			System.out.println("==메뉴==");
			System.out.println("[1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료]");
			System.out.print("입력 > ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("등록할 학생의 이름을 입력해주세요.");
				sm.insertStudent(sc);
				break;
			case 2:
				System.out.println("검색할 학생의 이름을 입력해주세요.");
				sm.insertStudent(sc);
				break;
			case 3:
				System.out.println("학생 리스트를 출력합니다.");
				sm.printStudent();
				break;
			case 4:
				System.out.println("수강신청할 학생을 입력해주세요.");
				sm.registerSubject(sc);
				break;
			case 5:
				System.out.println("수강철회할 학생을 입력해주세요.");
				sm.deleteSubject(sc);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				break;
				default: System.out.println("잘못된 입력입니다.");
					break;
			}
			
		} while(menu!=6);
		
	}

}
