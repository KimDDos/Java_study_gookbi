package day12;

public class 상속2 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모 클래스에게 물려받은 메서드를 재정의 하는 것
		 * - 부모클래스의 메서드와 선언부가 일치해야한다.
		 * - 접근제한자는 같거나 더 넓은 범위 접근 제한자를 써야한다.
		 *   => 범위 축소는 안됨.
		 *   
		 * */
		
		Dog d = new Dog();
		d.setName("뽀삐");
		d.info();
		d.howl();
		
		
		Cat c = new Cat("나비", "고양이과");
		c.info();
		c.howl();
		
		Tiger t = new Tiger("어흥이", "고양이과");
		t.info();
		t.howl();
		
	}

}


class Tiger extends Animal{
	public Tiger(String name, String category) {
		// 부모의 생성자를 호출
		super(name, category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥~!!");
	}
	
	
}

class Cat extends Animal{
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("미야옹~!!");
	}
	
	
}

class Dog extends Animal{
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("멍멍~!!");
	}
	
	
}

class Animal{
	private String name;
	private String category;
	
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	// 정보 출력
	public void info() {
		System.out.println("이름:"+name);
		System.out.println("종:"+category);
	}
	
	// 울음소리
	public void howl() {
		System.out.println("=="+name+"의 울음소리==");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}