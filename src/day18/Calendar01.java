package day18;

import java.util.Calendar;
import java.util.Date;

public class Calendar01 {

	public static void main(String[] args) {
		/* 날짜 시간 클래스
		 * Date 클래스 : 잘 안쓰는 클래스
		 * Calendar 클래스 사용 => 추상 클래스
		 * 직접 객체를 생성할 수 없음.
		 * new 연산자를 통해 객체 구현 X
		 * getInstance()를 통해 구현한 인스턴스를 가져올수 있음
		 * 
		 * month : (0월~11월) +1
		 * day : 1일 ~ 31일
		 * week : 1=일, 2=월 ...
		 * am_pm : am=0, pm=1
		 * */ 
		
		Date d = new Date(); // 직접 객체 생성.
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH);
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		// hour, minute, second
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour);
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = now.get(Calendar.SECOND);
		System.out.println(second);
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
		
		// 2023-09-11 (월)
		// dhwjs 09:43
		
		String weekString = null;
		switch(week) {
		case 1: weekString="일"; break;
		case 2: weekString="월"; break;
		case 3: weekString="화"; break;
		case 4: weekString="수"; break;
		case 5: weekString="목"; break;
		case 6: weekString="금"; break;
		case 7: weekString="토"; break;
		default: break;
		}
		System.out.println(year+"-"+month+"-"+day+" {"+weekString+")");
		System.out.println((ampm == 0 ? "오전":"오후")+" "+hour+":"+minute+":"+second);
		
	}

}
