package Day01;

public class 연산자 {
	public static void main(String[] args) {
		// 연산자 정리
		/* 대입 연산자 : =, +=, -=
		 * =을 기준으로 오른쪽에 있는 값을 왼쪽의 변수에 저장(덮어써라)
		 * a = b : b를 a에 넣어라(저장해라)
		 * a는 반드시 변수여야만 한다.
		 * 1 = a (X)
		 * a += 1; -> a = a + 1;  // 기존의 a값과 1을 더해서 a에 저장
		 * */
		
		int a = 1;
		System.out.println(a);
		a = a + 1;
		System.out.println(a);
		a += 3;
		System.out.println(a);
		
		a -= 10;
		System.out.println(a);
		
		int b = 10;
		a = b;
		System.out.println(a);
		
		// 증감연산자 : ++(1씩 증가), --(1씩 감소)
		// 증감연산자의 위치에 따라 연산은 다르게 일어남
		int c = 10;
		System.out.println(c++); // 출력값 : 10
		// ++a : a에 1일 더해진 뒤에 연산
		System.out.println(c);  // 출력값 : 11
		System.out.println(++c); // 출력값 : 12
		System.out.println(c);  // 출력값 : 12
		// a++ : a 연산후 1이 더해짐, if문이나 while문에서 변수 i가 1씩 증감을 할때 1씩 증가되는 것을 표시하기 위해 많이 사용하나 지금으로는 보여줄 방법이 음슴
		
		// 산술연산자 : +, -, *, /, %
		/* 나누기(/)
		 * 정수 / 정수 = 정수 (10/3=3) 소수점 버림
		 * 정수 / 실수 = 실수 (10/3.0 = 3.33333)
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 실수
		 * 값 / 0 -> 예외발생
		 * */
		System.out.println("3 + 2 = " + (3 + 2));
		System.out.println("3 - 2 = " + (3 - 2));
		System.out.println("3 * 2 = " + (3 * 2));
		System.out.println("3 / 2 = " + (3 / 2));
		System.out.println("3 % 2 = " + (3 % 2));
		// % 나머지 연산 : 배수나 약수를 구할때, 짝수/홀수 구할때 사용
		
		/* 비교연산자 : 비교연산의 결과는 반드시 true / false 
		 * >=(이상), <=(이하), >(초과), <(미만)
		 * ==(같다), !=(같지않다)
		 * () && ()  (and) : 둘다 true 이여만 true 리턴
		 * () || ()  (or) : 둘중 하나만 true면 true 리턴
		 * */
		
		System.out.println("3 > 2 ? " + (3 > 2));
		System.out.println("3 < 2 ? " + (3 < 2));
		System.out.println("3 == 2 ? " + (3 == 2));
		System.out.println("3 != 2 ? " + (3 != 2));
		
		System.out.println(" && 연산자 : " + (3>2 && 4<3));
		System.out.println(" || 연산자 : " + (3>2 || 4<3));
		
		/* 조건선택 연산자 : 3항 연산자
		 * (조건식) ? true : false
		 * */
		System.out.println((3>2)? "참입니다." : "거짓입니다.");
		
		/* 문제 : num가 짝수인지 홀수인지 출력
		 * 조건선택 연산자를 이용
		 * 참고 : 짝수란 2로 나누었을때 나머지가 0인 값
		 * */
		
		int num = 10;
		System.out.println((num % 2 == 0)? "짝수" : "홀수" );
		// String : 문자열을 저장하는 클래스
		
		String result = (num % 2 == 0)? "짝수" : "홀수";  // 짝수
		System.out.println(num + "은 " + result);
		
	}
	
}
