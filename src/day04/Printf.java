package day04;

public class Printf {

	public static void main(String[] args) {
		/* System.out.println : 줄바꿈을 포함하는 출력
		 * System.out.print : 줄바꿈이 없는 출력  // 값이 없으면 error
		 * System.out.printf : 지시자를 이용한 출력
		 * 
		 * 서식 지정자를 통해 출력할 데이터의 서식을 지정할 수 있음.
		 * %n : 줄바꿈 ( = \n )
		 * %d : 10진수(decimal) 정수의 형식으로 출력
		 * %f : 부동 소수점(floating-point)의 형식으로 출력
		 * %c : 문자 출력
		 * %s : 문자열 출력
		 * %x : 16진수(hexa-decimal) 출력
		 * %e : 부동소수점 포현방식
		 * 
		 * %00.00f => %전체자리.소수점아래자리f 라는 뜻임
		 * %00s : 00글자 출력, 글자가 모자라면 공백으로 채워줌
		 * %-00s : 00글자 출력단 왼쪽 정렬
		 * System.out.printf(지시자,변수);
		 * 
		 * */

		// (예시) 
		int year =2023;
		int age = 14;
		System.out.printf("age : %d, year : %d%n"  , age , year);
		//                      age        year
		// 통상적으로 %n(줄바꿈)은 문장 앞보다는 뒤에 넣는편임
		
		int num1 = 3;
		int num2 = 5;
		// 3 + 5 = 8
		System.out.printf("%d + %d = %d%n",num1,num2,(num1+num2));
		// 출력 : 3 + 5 = 8
		
		double num3 = 1.234;
		double num4 = 5;
		// 1.23 / 5 = 값;
		System.out.printf("%.2f / %.2f = %.2f%n",num3,num4,(num3/num4));
		// 출력 : 1.23 / 5.00 = 0.25
		// 실수형 출력간 %.2f 로 표현시에는 소수점자리 2자리까지 보여주고 나머지는 반올림 처리함 
		
		float f1 = .10f;     // 0.10, 1.0e-1
		// e는 지수표현임, 예시로 100,000을 표현할때 -> 1 * 10^5 = e+5 이라고 표현
		// e-1은 0.1.이 되는것임, 뒤에 소수점이 붙는 이유는 float형으로 자료형 타입을 선정했기 때문임
		String url = "www.naver.com";
		System.out.println(f1);
		float f2 = 1e1f;     // 10.0, 1.0e1, 1.0e+1
		System.out.println(f2);
		float f3 = 3.14e3f;  // 3140.0
		System.out.println(f3);
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		// 전체자리 지정
		// %00.00f => %전체자리.소수점아래자리f 라는 뜻임
		System.out.printf("d=%14.10f%n",d); 
		//                    ㄴ 전체 14자리 중 소수점 아래 10자리
		// 출력 : d=  1.2345678900
		//         ㄴ(공백 2자리) 
		
		System.out.printf("[%s]%n",url);     // 보통 출력
		System.out.printf("[%20s]%n",url);   // 20글자 출력, 오른쪽 정렬
		System.out.printf("[%-20s]%n",url);  // 20글자 출력간, 왼쪽 정렬
		System.out.printf("[%.8s]%n",url);   // 왼쪽에서 8글자만 출력
		// - 를 붙이면 반대로 출력됨
//		System.out.printf("[%.-8s]%n",url);   // 에러남 -는 없는걸로
//		System.out.printf("[%-.8s]%n",url);   // 에러남 -는 없는걸로
		
	}

}
