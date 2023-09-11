package day17;

import java.util.HashMap;

public class Map02 {

	public static void main(String[] args) {
		/* map을 이용하여 과목과 점수를 입력하고,
		 * 합계와 평균을 출력
		 * -- 홍길동 점수
		 * 국어 89
		 * 영어 78
		 * 수학 96
		 * 합계 :
		 * 평균 :
		 * */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 89);
		map.put("영어", 78);
		map.put("수학", 96);
		
		System.out.println(map.get("과학"));
		
		int sum=0;
		double avg=0;
		
		for(String key : map.keySet()) {
			sum += map.get(key);
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("합계:"+sum);
		System.out.println("평균"+((double)sum/map.size()));
		
		
	}

}
