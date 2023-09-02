package studentManager;

import java.util.Scanner;

public class StudentManager implements Program{
	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - Program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로
	 * - 학생 추가시 배열이 꽉찼다면... 배열을 늘려주는 기능 추가  
	 * */
	
	private int size = 5;
	private int cnt;
	private int count;
	private Student[] std = new Student[size];
	
	public void testSetting(String name, String subject) {
		std[cnt] = new Student(name);
		std[cnt].insertSubject(subject);
		std[cnt].insertSubject(subject);
		std[cnt].insertSubject(subject);
		std[cnt].insertSubject(subject);
		std[cnt].insertSubject(subject);
		cnt++;
	}
	
	@Override
	public void printStudent() {
		if(cnt==0) {
			System.out.println("현재 수강중인 학생이 없습니다.");
		}
		for(int i=0; i<cnt; i++) {
			std[i].printInfo();
		}
	}

	@Override
	public void insertStudent(Scanner sc) {
		String str = sc.next();
		if(cnt==std.length) {
			Student[] std1 = new Student[2*std.length];
			for(int i=0; i<std.length; i++) {
				std1[i] = std[i];
			}
			std = std1;
		}
		std[cnt] = new Student(str);
		cnt++;
	}

	@Override
	public void searchStudent(Scanner sc) {
		String str = sc.next();
		for(int i=0; i<cnt; i++) {
			if(std[i].equals(str)) {
				std[i].printInfo();
				count++;
			}
		}
		if(count==0) {
			System.out.println("[수강생"+str+"은 없습니다.]");
		}
	}

	@Override
	public void registerSubject(Scanner sc) {
		String str = sc.next();
		for(int i=0; i<cnt; i++) {
			if(str.equals(std[i].getName())) {
				System.out.println("수강신청할 과목을 입력해주세요.");
				str = sc.next();
				std[i].insertSubject(str);
				count++;
			} 
		}
		if(count==0) {
			System.out.println("[ 해당하는 학생이 없습니다!! ]");
		}
		count=0;
	}

	@Override
	public void deleteSubject(Scanner sc) {
		String str = sc.next();
		for(int i=0; i<cnt; i++) {
			if(str.equals(std[i].getName())) {
				System.out.println("수강철회 할 과목을 입력해주세요.");
				str = sc.next();
				std[i].deleteSubject(str);
				count++;
			} 
		}
		if(count==0) {
			System.out.println("[ 해당하는 학생이 없습니다!! ]");
		}
		count=0;
	}
	
	
}
