package studentManager;

import java.util.Scanner;

public interface Program {
	/* 1. 인터페이스
	 * - 학생 리스트 출력 메서드
	 * - 학생을 추가 메서드
	 * - 학생을 검색 메서드
	 * - 학생의 수강신청 메서드
	 * - 학생의 수강철회 메서드
	 * */
	
	void printStudent();
	void insertStudent(Scanner sc);
	void searchStudent(Scanner sc);
	void registerSubject(Scanner sc);
	void deleteSubject(Scanner sc);
	
}
