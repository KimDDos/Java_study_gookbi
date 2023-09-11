package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 *  - 값을 2개 저장, Key / Value 값으로 저장
		 *  - key는 중복불가, value는 중복가능
		 *  - HashMap을 가장 많이 사용
		 *  
		 *  HashMap<String, Integer> map = new HashMap<>();
		 *  Map은 값이 2개여서 Iterator를 map 자체로는 사용 불가
		 *  향상된 for문 / Iterator를 map 자체로는 사용불가
		 *  
		 *  list, set => .add()
		 *  map => .put() / keySet(), Value() => 추출
		 * */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료수", 2000);
		
		// Key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));
		
		// 향상된 for문으로 출력
		System.out.println("향상된 for문 출력");
		int sum=0;
		for(String tmp : map.keySet()) {
			sum = sum + map.get(tmp);
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println("합계:"+sum);
		
		System.out.println("-------------------");
		System.out.println("Iterator로 출력");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println(map.entrySet());
		
		System.out.println("-------------------");
		System.out.println("entrySet 이용한 출력");
		// enterSet 구성시 : getKey, getValue로 출력
		for(Map.Entry<String, Integer> tmp :map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
		System.out.println(map.entrySet());
		
	}

}
