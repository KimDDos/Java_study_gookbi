package day12;

public class class06 {

	public static void main(String[] args) {
		
		
		
	}

}


/* 멤버변수 : 지점, 이름, 반, 전화번호
 * 생성자
 * 메서드 : 출력 (print 메서드) => toString 메서드
 * getter / setter
 */

/* 객체를 초기화 하는 방법 : 기본값(null, 0), 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수의 선언과 동시에ㅣ 초기값을 명시
 * 2. 초기화 블럭 : {  } 멤버변수를 초기화
 * 3. 생성자 : 객체를 초기화 하는 방법
 * 초기화 우선순위
 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자
 * */

class EzenStudent{
	private String gigum = "인천";
	private String nameString = "미상";
	private String group;
	private String tel;
	
	{
		// 초기화 블럭
		gigum = "incheon";
		group = "미정";
	}
	
	// 생성자
	public EzenStudent() {}
	
	public EzenStudent(String gigum, String nameString, String group, String tel) {
		this.gigum = gigum;
		this.nameString = nameString;
		this.group = group;
		this.tel = tel;
	}
	

	@Override
	public String toString() {
		return "EzenStudent [지점=" + gigum + ", 이름=" + nameString + ", 반=" + group + ", 전화번호=" + tel + "]";
	}

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
}