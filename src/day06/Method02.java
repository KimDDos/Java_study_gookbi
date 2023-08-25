package day06;

import java.util.function.BiConsumer;

public class Method02 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * / %
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 * + 일 때 호출  =>  메인에서 출력
		 * - 일 때 호출  =>  메인에서 출력
		 * * 일 때 호출  =>  메소드에서 출력
		 * / 일 때 호출  =>  메소드에서 출력  =>  리턴을 double로
		 * % 일 때 호출  =>  메소드에서 출력
		 * */
		
		int num1 = 25;
		int num2 = 14;
		
		int add = add(num1, num2);
		System.out.println(add);
		
		int sub = sub(num1, num2);
		System.out.println(sub);
		
		mul(num1, num2);
		div(num1, num2);
		rem(num1, num2);
		
		int method01 = Method01.sum(num1, num2);
		System.out.println(method01);
		
		// 다른 클래스에 있는 메서드를 사용 (static 있는 경우)
		// 클래스명.메서드명
		// 클래스 => 정의서 => 객체를 생성해서 메서드를 사용
		// 현재 시점에서 객체 생성없이 메서드를 사용할 수 있는 이유는 = static
		// (static이 없는 경우) - 선언만 해놓고 생성이 안되어있다는 것을 의미
		// 객체를 생성 => 클래스가 필요
		
		Method02 me = new Method02();
		int s = me.add(20,30);
		System.out.println("me 객체 생성 후 add 호출 : "+s);
		
		
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static void div(int num1, int num2) {
		System.out.println((double)num1 / num2);
	}
	
	public static void rem(int num1, int num2) {
		System.out.println(num1 % num2);
	}
	
}
