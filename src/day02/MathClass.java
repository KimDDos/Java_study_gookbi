package day02;

public class MathClass {

	public static void main(String[] args) {
		/* Math.method
		 * Math.round (반올림) : 소수점의 자리수는 무조건 0 
		 * Math.ceil 올림
		 * Math.floor 내림
		 * */
		
		double num = 34.66666;
		
		int roundNum = (int)Math.round(num); // return long
		
		System.out.println(Math.round(num));  // 35
		System.out.println(Math.ceil(num));   // 35.0
		System.out.println(Math.floor(num));  // 34.0
		
		//Math.max(a, b) 최대값  / Math.min(a, b) 최소값
		System.out.println(Math.max(3, 5));  // 5
		System.out.println(Math.min(3, 5));  // 3
		
		//Math.random : 0과 1사이의 아무값을 리턴(난수 출력)
		// 0 <= Math.random < 1
		// int num = (int)(Math.random() * n) + r;   => r 부터 n개의 정수를 얻는 공식임
		System.out.println(Math.random());  // 0은 포함! 1은 미포함!
		System.out.println((int)(Math.random()*10)+1);
	
	
	}

}
