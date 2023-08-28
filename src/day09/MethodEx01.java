package day09;

// class의 public은 파일명과 일치하는 class에만 가능
// 한 파일에 1개만 public class 존재
public class MethodEx01 {
	// 멤버변수 자리
	
	// 메서드 자리
	public static void main(String[] args) {
		/* num1, num2 숫자 두개를 주고 두수의 합을 리턴하는 메서드
		 * */
		// 메서드는 메서드를 선언하는 것으로 일을 독자적으로 하지 않음
		// 쉽게말해서 메서드(객체)는 요청에 대한 일을 수행만 함
		int a = 3;
		int b = 5;
		
		int sum = sum(a, b);
		System.out.println(sum);
		System.out.println(sum(a,b));
		
		sum1(a, b);
//		System.out.println(sum1(a, b));
//		void 타입으로 선언한 메서드는 sysout을 통해서는 출력 x 
//		>> why? 리턴할 값이 없기 때문에 출력문이 값을 출력 못 함
		
		MethodEx01  me = new MethodEx01();
		int num = me.sum2(a, b);
		System.out.println(num);
		
	}
	// 메서드 자리
	// 기능 : 두 정수의 합을 리턴하는 메서드
	// 리턴타입 : 타입만 >> int
	// 매개변수 : 두 정수 >> int num1, int num2
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 메서드 자리
	// 기능 : 두 정수의 합을 출력하는 메서드 
	// 매개변수 : 두 정수 => int num1, int num2
	public static void sum1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 메서드 오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것
	// 메서드 오버로딩이 가능하려면
	// 1. 매개변수의 종류가 다르거나, 개수가 달라야함.
	
	// 두 수의 합을 리턴하는 메서드
	// static 없는 메서드 만들어보기
	public int sum2(int num1, int num2) {
		return num1 + num2;
	}
}

// 클래스 자리
