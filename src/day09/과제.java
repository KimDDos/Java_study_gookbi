package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 클래스 객체 생성(2명
		// 값을 입력 후 정보출력
		int member = 2;
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student();
		student1.setName("추성훈");
		student1.setAge(18);
		student1.setGrade(2);
		student1.setPhonNumber("010-8521-7456");
		student1.setAdress("인천광역시 부평구 00동 00아파트");
		student1.print();
		
		Student student2 = new Student();
		student2.setName("박정훈");
		student2.setAge(17);
		student2.setGrade(1);
		student2.setPhonNumber("010-6485-0200");
		student2.setAdress("인천광역시 남동구 구월동 00빌라");
		student2.print();
		
		// 메서드 하나로 한번에 입력하기
		Student student3 = new Student();
		student3.selfInput("감나빗", 18, 2, "010-8547-9658", "인천광역시 남동구");
		//                   이름,  나이,학년,    핸드폰번호,           주소
		student3.print();
		
		
//		// Scanner로 입력받는 메서드만들어서 출력해보기
//		Student student4 = new Student();
//		student4.input();
//		student4.print();
		
		
		
	}

}

// 클래스 생성
// 학생 클래스 생성
// 이름, 나이, 전화번호, 주소, 학년
// 출력
// 학년 이름(나이) 전화번호
class Student{
	private int grade;
	private String name;
	private int age;
	private String phonNumber;
	private String adress;
	
	public void print() {
		System.out.println(grade+"학년 "+name+"("+age+") "+phonNumber);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보를 입력해주세요.");
		System.out.println("학생의 이름은?");
		setName(sc.nextLine());
		System.out.println("학생의 나이는?");
		setAge(sc.nextInt());
		System.out.println("학생의 학년은?");
		setGrade(sc.nextInt());
		System.out.println("학생의 핸드폰 번호는?");
		setPhonNumber(sc.nextLine());
		System.out.println("학생의 주소는?");
		setAdress(sc.nextLine());
		System.out.println("입력이 완료되었습니다.");
		sc.close();
	}
	
	public void selfInput(String name, int age, int grade, String phNum, String adress) {
		setName(name);
		setAge(age);
		setGrade(grade);
		setPhonNumber(phNum);
		setAdress(adress);
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
}
