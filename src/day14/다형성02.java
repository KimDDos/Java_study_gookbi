package day14;

public class 다형성02 {

	public static void main(String[] args) {
//		Human h = new Human();
//		h.eating();
//		h.move();
		
		// 부모 클래스를 이용하여 자식 클래스 생성
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
//		Tiger t = new Animal();  // 자식 클래스로부터 부모클래스를 생성하는 케이스는 안 됨
		
		다형성02 test = new 다형성02();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		// Tiger h = (Tiger)hAnimal;
		Tiger t = (Tiger)tAnimal;
		// h.hunting();
		t.hunting();
		
		
		// instanceof 연산자  true, false
		// 객체명 instanceof 클래스명
		System.out.println(hAnimal instanceof Tiger);
		System.out.println(tAnimal instanceof Tiger);
		
		if(hAnimal instanceof Tiger) {
			Tiger t1 = (Tiger)hAnimal;
		}
		
		// 배열을 생성
		Animal[] aniList = new Animal[5];
		int cnt=0;
		aniList[cnt] = hAnimal;
		cnt++;
		aniList[cnt] = tAnimal;
		cnt++;
		aniList[cnt] = eAnimal;
		cnt++;
		System.out.println("--DownCasting--");
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public void testDownCasting(Animal[] list, int cnt) {
		for(int i=0; i<cnt; i++) {
			Animal ani = list[i];
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readbook();
			} else if(ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			} else if(ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.fiying();
			} else {
				System.out.println("Casting Error");
			}
		}
	}
	
	
}


class Animal{
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
	public void eating() {
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readbook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void fiying() {
		System.out.println("독수리가 멀리멀리 날아갑니다.");
	}
}