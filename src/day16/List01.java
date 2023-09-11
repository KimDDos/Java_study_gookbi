package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// 하루일과를 저장하는 list를 생성 <String>

		List<String> list = new ArrayList<String>();
		list.add("기상");
		list.add("출근");
		list.add("수업");
		list.add("점심시간");
		list.add("수업");
		list.add("저녁시간");
		list.add("수업");
		list.add("퇴근");
		list.add("잠자기");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		// 향상된 for문으로 출력
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		
		// Iterator로 출력
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {  // 다음의 요소값이 있는지 확인
			String tmp = it.next();  // 요소 가져오기
			System.out.println(tmp+" ");
		}
		
		// Collections.sort(list);  // 오름차순만
		System.out.println();
		Collections.sort(list);
		System.out.print(list+" ");
		System.out.println();
		
		// sort(Comparator c) // 오름차순, 내림차순 가능
		list.sort(new Test());
		System.out.println(list);
		
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// comparteTo 메서드 사용 o2.compareTo(o1) : 내림차순
		return o2.compareTo(o1);
	}
	
}
