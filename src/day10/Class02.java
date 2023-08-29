package day10;

public class Class02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : name, year, color, power, speed 
		 * 메서드 : 전원on, 전원off, 스피드up, 스피드down
		 * getter / setter
		 * 생성자
		 * */
		
		Car c = new Car();
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
	}

}

class Car{
	// 멤버변수
	private String name;
	private int year;
	private String color;
	private boolean power;
	private int speed;
	
	// 생성자
	public Car() {}
	
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	// 메서드
	public void print() {
		System.out.println("모델명 :"+name+", 출고년도: "+year);
	}
	
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void powerOff() {
		if(speed == 0) {
		power = false;
		System.out.println("전원이 꺼졌습니다.");
		} else {
			System.out.println("속도를 먼저 줄여주세요.");
		}
	}
	
	public void speedUp() {
		if(power = true) {
			speed += 10;
			System.out.println("현재속도"+speed);
		} else {
			System.out.println("시동부터 켜주세요~!!");
		}
	}
	
	public void speedDown() {
		if(speed == 0) {
			System.out.println("더 이상 속도를 줄일 수 없습니다.");
		} else {
			speed -= 10;
			System.out.println("현재속도"+speed);
		}
	}
	
	
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}
