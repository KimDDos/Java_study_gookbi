package day11;

public class EzenComputerMain {

	public static void main(String[] args) {
		// EzenComputer의 객체 생성 후 출력
		EzenComputer s1 = new EzenComputer("홍길동", "1999-08-01", 25, "010-7458-9856", "인천");
		s1.totalPrint();
		s1.insertCourse("java", "6개월");
		s1.insertCourse("DB", "1개월");
		s1.totalPrint();
		
		EzenComputer s2 = new EzenComputer("이영이", "1998-05-13", 26, "010-5555-8888", "서울");
		s2.insertCourse("java", "6개월");
		s2.insertCourse("HTML", "2개월");
		s2.totalPrint();
		
		EzenComputer[] std = new EzenComputer[7];
		std[0] = new EzenComputer("영이", "980101", 25, "2222", "인천");
		std[1] = new EzenComputer("영이", "980101", 25, "2222", "인천");
		std[2] = new EzenComputer("영이", "980101", 25, "2222", "인천");
		std[3] = new EzenComputer("영이", "980101", 25, "2222", "인천");
		std[4] = new EzenComputer("영이", "980101", 25, "2222", "인천");
		std[5] = s1;
		std[6] = s2;
		std[0].insertCourse("DB", "1개월");
		std[1].insertCourse("java", "6개월");
		std[2].insertCourse("HTML", "2개월");
		std[3].insertCourse("HTML", "2개월");
		
		
		/* 학생 이름으로 검색       => 모든정보 출력
		 * 지점 정보로 검색         => 학생정보만 출력
		 * 과목을 수강하는 학생만 검색 => 학생정보, 수강정보 출력
		 * */
		
		String searchName = "홍길동";
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {
				std[i].printInfo();
			}
		}
		
		
		String searchBranch = "인천";
		for(int i=0; i<std.length; i++) {
			if(std[i].getBranch().equals(searchBranch)) {
				std[i].printInfo();
			}
		}
		
		String searchCourse = "java";
		
	}

}
