package day02;

public class 과제 {

	public static void main(String[] args) {
		/* 매일 마지막 시간 과제 출제
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 조건선택 연산자 이용
		 * 평균이 80이상이면 '결과 : 합격', 아니면 '결과 : 불합격' 출력
		 * */
		
		// 본인 작성 코드
		int kor = 88;
		int eng = 85;
		int math = 91;
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("합계 : "+sum+", 평균 : "+avg);
		System.out.println("결과 : " + (avg >= 80 ? "합격" : "불합격"));
		
		// 강사풀이
		int kor1 = 78;
		int eng1 = 45;
		int math1 = 23;
		// 지역변수는 반드시 초기화를 해야한다.
		int sum1 = 0;
		double avg1 = 0;
		sum1 = kor1 + eng1 + math1;
		avg1 = sum / 3.0;
		System.out.println("합계 : " + sum1 + ", 평균 : " + avg1);
		System.out.println("결과 : " + (avg1 >=80 ? "합격" : "불합격"));
		
		// 조건선택 연산자 -> if문 변경
		if(avg1 >= 80) {
			System.out.println("결과 : 합격");
		} else {
			System.out.println("결과 : 불합격");
		}
		
		
		/* 개선사항
		 * 지역변수의 초기화를 고려해서 코드를 작성할 것
		 * 1) 지역변수를 초기화 해야하는 이유는? 
		 *  - 지역변수의 경우 호출 스택(call stack)에 저장되는데, 호출스택은 재사용이 빈번하다. 즉 다른 메서드에서 이전에 사용한 지역변수가 사용될 수도 있다는 것임
		 *  - 지역변수는 메서드가 실행될 때만 사용되고, 메서드 종료시 사라진다. 재사용이 빈번한데 메서드가 호출될 때마다 메모리 공간을 0으로 넣으면 성능이 떨어지기에 메서드는 빨리 실행되고 제거되어야 한다.
		 *    그래서 하나의 과정을 생략 가능한 점에서 성능이 올라가기도 하고, 메서드를 다시 사용할때, 해당 메서드 안의 지역변수가 이전에 메서드를 사용함으로 지역변수가 어떻게 값이 바뀌었는지 알 수 없기에 
		 *    메서드가 실행될때마다 새로운 값을 덮어쓰게 함으로써 메서드 사용자가 원하는 값으로 도출할 수 있도록 지역변수를 초기화 해주어야 한다.
		 *  - 힙 메모리에 저장되는 인스턴스 변수나 클래스 변수의 경우 선언시 값을 초기화 하지 않아도, 타입의 기본값에 맞는 값으로 자동적으로 초기화된다.
		 * 2) 지역변수와 전역변수란?
		 * 	public static void main(String[] args) {
				int i = 0;                              // 전역변수(i)
				while(i<1) {                            //
					int result = 100;                   // 지역변수(result)
					i++;
					System.out.println(result);
				}
               //System.out.println(result);   ->  변수 result는 while문에서만 활용되고 삭제되기에 출력 X, 에러
			}
		 *  - 지역변수
		 *    : 함수 속에서 선언하여 해당 함수 속에서만 사용 가능한 변수, 함수의 실행이 종료되면 함께 사라짐
		 *  - 전역변수
		 *    : 함수 밖에서 선언하여 클래스 전체에서 사용가능한 변수, 
		 * */
		
	}

}
