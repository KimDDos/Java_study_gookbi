package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		Point p = new Point();
		p.print();
		
		p.setX(3);
		p.setY(5);
		p.print();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		p.setX(10);
		p.print();
		System.out.println("---------------");
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		p1.print();
		
	}

}

class Point{
	// 멤버변수 자리
	// 멤버변수는 일반적으로 private 사용
	private int x;
	private int y;
	// print 
	// 같은 클래스의 멤버변수는 모든 메서드에서 공유된다
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	
	// getter : 멤버변수의 값을 가져오는 역할의 메서드
	// setter : 멤버변수의 값을 변경하는 역할의 메서드
	
	public int getX() {
		return x;
	}
	public void setX(int x) { // 매개변수 x와 멤버변수 x는 다름
		// this 내 클래스의 멤버변수를 지칭하는 키워드
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}