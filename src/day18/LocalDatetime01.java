package day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDatetime01 {

	public static void main(String[] args) {
		/* LocalDateTime : 현재 날짜 시간 처리
		 * LocalTime : 시간만
		 * LicalDate : 날짜만
		 * */
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr = today.toString();
		// T 기준으로 앞에 있는 연월일 추출
		String date = curr.substring(0,curr.indexOf("T"));
		System.out.println(date);
		
		// T 기준으로 뒤에 있는 시분초
		String time = curr.substring(curr.indexOf("T")+1,curr.indexOf("."));
		System.out.println(time);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd (a) HH:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 13, 30); // 날짜 생성
		System.out.println(sDate.format(dtf));
		System.out.println(sDate);
		
	}

}
