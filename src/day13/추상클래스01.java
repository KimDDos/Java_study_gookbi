package day13;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 추상클래스 : 미완성 클래스 => 객체를 생성할 수 없다.
		 * 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 
		 * 키워드 : abstract
		 * abstract 클래스명 / abstract 메서드명 앞에 추가
		 * 
		 * abstract 리턴타입 메서드명(매개변수);  // 추상메서드
		 *   - 부모클래스에서 상속 받았을때, 특정 메서드가 자식 클래스에서
		 *     자주 오버라이딩 될 때 해당 메서드를 추상 메서드로 작성
		 *   - 삭송을 받은 클래스에서 추상메서드가 있다면 반드시 구현해야 한다.
		 *   - 내 클래스도 추상 클래스가 됨.
		 * */
		
		Dog d = new Dog("뽀삐","개과");
		d.printInfo();
		d.howl();
		
	}

}

class Dog extends Animal{

	public Dog() {}
	
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.println("멍멍~!!");
		
	}
	
}


class Cat extends Animal{
	public Cat() {}
	public Cat(String name, String catrgory) {
		super.name = name;
		super.category = catrgory;
	}
	@Override
	public void howl() {
		System.out.println("미야옹~!");
	}
	
	
}


abstract class Animal{
	// 추상클래스에서는 퍼블릭을 많이 활용함
	
	public String name;
	
	public String category;
	
	public void printInfo() {
		System.out.println("----");
		System.out.println("이름: " +name);
		System.out.println("종류: " +category);
	}
	
	abstract public void howl();
}