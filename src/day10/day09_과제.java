package day10;

public class day09_과제 {

	public static void main(String[] args) {
		// 클래스 객체 생성 (2명)
		// 값을 입력 후 정보출력
		Student std1 = new Student("홍길동",29);
		std1.setName("홍길동");
		std1.setAge(27);
		std1.setPhone("010-7485-9562");
		std1.setAddress("인천시 남동구");
		std1.stdPrint();
		
		Student std2 = new Student();
		std2.setName("추헌영");
		std2.setAge(26);
		std2.setPhone("010-5485-4462");
		std2.setAddress("서울시 관악구");
		std2.stdPrint();
		
		Student std3 = new Student();
		std3.input("감나빗", 23, "010-7794-8546", "인천시");
		std3.stdPrint();
		
		Student std4 = new Student("Kim Andy", 30, "010-7458-8520", "서울시");
		std4.stdPrint();
		
	}

}

// 클래스 생성
// 학생 클래스 생성
// 이름, 나이, 전화번호, 주소
// 출력
// 이름(나이) 전화번호
class Student{
	// 멤버변수
	private String name;
	private int age;
	private String phone;
	private String address;
	
	// 생성자 위치
	// 생성자 오버로딩 가능
	// 생성자 오버로딩 조건
	//  - 매개변수 개수가 다르거나, 매개변수 유형이 다르거나 (기존과 동일)
	public Student() {}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String phone, String address) {
		// 생성자 호출 - 반드시 첫줄에서만 가능함
		// 밑으로 내려가면 시행 X
		this(name, age);
		this.phone = phone;
		this.address = address;
	}
	
	public void stdPrint() {
		System.out.println(name+"("+age+")"+phone);
	}
	
	public void input(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	// getter / setter
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}