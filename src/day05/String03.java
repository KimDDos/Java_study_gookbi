package day05;

public class String03 {

	public static void main(String[] args) {
		// 		      01234
		String str = "ABCDE";    // str.length()는 5
		char ch = str.charAt(4);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1);
		String str4 = str.substring(1, str.length()); // 1~4 
		// to를 생략하면 끝까지 출력함 
		
		System.out.println(ch);
		// 문자 하나를 꺼내오는것
		System.out.println(str2);
		System.out.println(str3);  // BCD
		
		
		
		
		
	}

}
