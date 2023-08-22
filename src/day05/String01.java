package day05;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다"; // 일반 자료형처럼 이용이 가능
		 * index는 0부터 시작
		 * */
		
		String str = "Hello world~!";
		System.out.println(str);
		
		//charAt(index) : index번지에 있는 한글자를 반환
		System.out.println("--charAt--");
		System.out.print(str.charAt(0) + " ");
		System.out.print(str.charAt(1) + " ");
		System.out.print(str.charAt(2) + " ");
		
		//length : 문자열의 전체 길이 공백포함
		System.out.println("--length--");
		System.out.println(str.length());
		
		//compareTo(str) : str문자열과 비고하여 같으면 0
		//사전순으로 앞이면 -1, 뒤면 1 // 문자열 정렬시 사용
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a")); 
		// 문자열이 "b"보다 "a"가 앞서기 때문에 1
		System.out.println("b".compareTo("b")); 
		// 문자열과 같아서 0
		System.out.println("b".compareTo("c")); 
		// 문자열이 "b"보다 "c"가 후행이기 때문에 -1 
		
		//equals(str) : 두 문자열이 같은지 확인(대소문자 구분)
		// == : 객체 주소가 같은지 확인 / equals : 내용이 같은지 확인
		// boolean 값을 가지고 있기에 값은 true / false로 출력
		System.out.println("--equasl--");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("def"));
		
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능
		// 찾는 문자가 없으면 -1을 리턴
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("f"));
		String email = "ehdus0731@naver.co.kr";
		// 시작번지는 포함, 끝번지는 포함 X
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf("."));
		System.out.println(email.lastIndexOf("."));
		// indexOf는 문자의 위치를 찾지만 중간값을 찾는 방법은 없음
		// 따라서 중간에 위치를 찾을때는 순차적으로 앞에서 다음꺼 찾는 for문을 활용하던지 함
		
		
		//substring : 문자열 추출
		System.out.println("--substring--");
		System.out.println(email.substring(0, email.indexOf("@")));
		// substring은 indexOf와 활용시 0번째 위치부터 "@"위치까지 추출
		// 출력 : ehdus0731
		System.out.println(email.substring(0, email.indexOf("@")+1));
		// 출력 : ehdus0731@
		// indexOf("@")+1은 "@" 다음 위치까지 추출로 이해할수 있다.
		// 이때 +n / -n 은 ("str")괄호밖에 위치시켜야 한다. 
		// 주의할 것은 범위의 끝은 포함되지 않는다 것임
		// 출력물을 보면 알겠지만, 범위의 끝은 포함되지 않는다는 것임.
		
		
		//trim : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("          Hello         ".trim());
		// 주로 보안메시지를 주고 받거나 네트워크 정보를 주고 받을때 활용하는 클래스 함수임
		
		
		// replace : 글자 치환
		System.out.println("--replace--");
		System.out.println("Hello world~!".replace("world", "JAVA"));
		// 대소문자를 구분함
		
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
		String[] str2 = str1.split(",");
		for(String s : str2) {
			System.out.println(s);
		}
		
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1 + num2);
		// num1과 num2는 문자열로 인식되기에 +연산자로 문자가 결합됨
		
		//parseInt : 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3 + num4);
		
	}

}
