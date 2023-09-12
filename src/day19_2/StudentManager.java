package day19_2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager implements Program{
	/* 멤버변수 : 학생 클래스를 리스트로 생성
	 * - Program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로
	 * - 학생 추가시 배열이 꽉찼다면... 배열을 늘려주는 기능 추가  
	 * */
	
	ArrayList<Student> std = new ArrayList<Student>();
	Student st = new Student();
	
	public void testSetting() {
		std.add(new Student("홍길동","1515","Java",1111));
		std.add(new Student("김나박이","5252","실용음악",2222));
		std.add(new Student("감나빗","8462","뱅",3333));
	}
	
	@Override
	public void printStudent() {
		std.stream().forEach(n->System.out.println(n));
	}

	@Override
	public void insertStudent(Scanner sc) {
		System.out.println("학생명을 입력해주십시요.");
		String stdName = sc.next();
		System.out.println("학번을 입력해주십시요.");
		String stdNum = sc.next();
		
		if(stdName==null || stdNum==null) {
			System.out.println("공백으로 입력하실수 없습니다.");
			return;
		}
		std.add(new Student(stdName,stdNum));
	}

	@Override
	public void searchStudent(Scanner sc) {
		System.out.println("검색할 학생 이름을 입력해주세요.");
		String search = sc.next();
		int cnt=0;
		for(int i=0; i<std.size(); i++) {
			if(search.equals(std.get(i).getName())) {
				System.out.println(std.get(i));
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("일치하는 학생이 없습니다.");
		}
	}
		
	@Override
	public void registerSubject(Scanner sc) {
		System.out.println("수강신청할 학생 이름을 입력해주세요.");
		String search = sc.next();
		int cnt=0;
		for(int i=0; i<std.size(); i++) {
			if(search.equals(std.get(i).getName())) {
				System.out.println("추가할 과목을 입력해주세요.");
				String subject = sc.nextLine();
				System.out.println("추가할 과목번호를 입력해주세요.");
				int subjectId = sc.nextInt();
				if(subject==null || subjectId==0) {
					System.out.println("제대로 입력되지 않았습니다.");
					return;
				}
				std.add(new Student(std.get(i).getName(),std.get(i).getStudentId(),subject,subjectId));
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("일치하는 학생이 없습니다.");
		}
	}

	@Override
	public void deleteSubject(Scanner sc) {
		System.out.println("수강철회할 학생 이름을 입력해주세요.");
		String search = sc.next();
		String subject = null;
		int cnt=0;
		for(int i=0; i<std.size(); i++) {
			if(search.equals(std.get(i).getName())) {
				System.out.println("삭제할 과목를 입력해주세요.");
				subject = sc.next();
				if(subject==null) {
					System.out.println("제대로 입력되지 않았습니다.");
					return;
				}
				for(int j=0; j<std.get(i).getSub().size(); j++) {
					if(std.get(i).getSub().get(j).getSubjectName().equals(subject)) {
						std.get(i).getSub().remove(j);
						System.out.println("삭제가 완료되었습니다.");
					}
				}
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("일치하는 학생이 없습니다.");
		}
	}
	
	
}
