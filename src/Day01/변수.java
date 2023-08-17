package Day01;

public class 변수 {

	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수 선언 + 초기화
		 *  int     num1  = 120;
		 * 자료형(타입) 변수명 = 값;
		 * */
		
		int num = 123;
		System.out.println(num);
		
		// int num = 456; // 중복선언 불가능
		
		num = 456;  // = : 대입연사자로 앞의 변수에 뒤에 있는 값을 저장(덮어쓰기)
//		변수 <- 값 : 왼항의 변수에 오른항의 값(리터럴)을 저장 
		System.out.println(num);
		
		int num1 = 78, num2 = 45, num3 =89; // 같으 자료형에서는 왼쪽과 같이 동시에 값 선언이 가능함 
		
		num1 = 789;
		System.out.println(num1);
		
//		8개의 기본 자료형은 지역변수 범위(scope)를 가짐 {   } : 하나의 메서드에는 변수를 가지고, 변수의 범위는 중괄호 안에만 해당함

		// 명령어{}
		int a = 0;
		// 아래의 if 중괄호 안에서 int a = 10; 선언시 연산 종료후 가비지 컬렉터가 중괄호 안에 저장된 리터럴 값을 제거함, 그래서 if문 다음에 오는 a출력은 값이 안 나옴
		// 그렇지만 main method 안에 선언된 a의 값은 if문 안의 a값에도 영향을 미침, why? main method의 메모리에 저장된 a 변순의 리터럴 값이 삭제되지 않았기 때문임
		if(true) {
			a = 10;
			System.out.println(a);
		}
		System.out.println(a);
		
		// 한글자만 저장 가능한 자료형은 char ch = '';
		char ch = 'a'; // "" -> 문자열(String)  /  '' -> 한글자(char)
		double dou = 3.0;
		byte b = 1;
		boolean boo = true;   // 논리형의 값은  true 또는  false 로만 저장 가능함
		
		// float / long 자료형은 접미사를 반드시 붙여야함
		// float(f F) , long(l L)
		float f = 1.2f;
		long l = 1L;
		
		num2 = 010; // 8진수로 인식 (0~7까지 8 -> 10)
		num3 = 0x10; // 16진수 인식 (0~15(10이후로는 ABCDE까지) 16 -> 10)
		
		// 산술연산자 : +, -, /, *, %
		// 국어점수(kor), 영어점수(eng), 수학점수(math) 변수를 선언하고, 값을 입력하여, 세 점수의 합을 콘솔에 출력
		int kor = 78;
		int eng = 98;
		int math = 100;
		int sum = kor + eng + math;
		System.out.println("국어, 영어, 수학점수 합계 : " + sum); // + 문자열을 연결하는 연산자로도 활용함
		System.out.println("합계 : " + kor + eng + math); // 출력 : 합계 : 7898100
														 // 제일 첫 항이 문자열이면 뒤에 이어지는 변수도 문자열로 취급됨
		System.out.println("합계 : " + (kor + eng + math)); // 따라서 숫자 연산까지 하고싶으면 괄호로 닫고 처리해야됨
		
		
	}

}
