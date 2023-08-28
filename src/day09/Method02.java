package day09;

public class Method02 {

	public static void main(String[] args) {
		// 두 정수의 사칙연산(+ - * / %)을 처리
		
		Method02 me = new Method02();
		int a = 10;
		int b = 20;
		
		
		System.out.println(me.sum(a, b));
		System.out.println(me.sub(a, b));
		System.out.println(me.mul(a, b));
		System.out.println(me.div(a, b));
		System.out.println(me.rem(a, b));
		
	}

	// 사칙연산 메서드 생성 static 없이 생성
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	public double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	public int rem(int num1, int num2) {
		return num1 % num2;
	}
}
