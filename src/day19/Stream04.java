package day19;

import java.util.ArrayList;

public class Stream04 {

	public static void main(String[] args) {
		// Student 클래스를 가지는 List 생성
		// 5명 정도의 값을 추가
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 90));
		list.add(new Student("김순이", 76));
		list.add(new Student("강감찬", 48));
		list.add(new Student("이순신", 89));
		list.add(new Student("바둑이", 45));
		
		// stream 구성후 출력
		// toString 존재할 경우
		list.stream().forEach(System.out::println);
		System.out.println("----------------");
		
		// toString이 없을 경우
		// {} 처리구문이 많을 경우
		list.stream().forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+":"+score);
		});
		
		// 성적 합계 출력
		int sum = list.stream()
				.mapToInt(n->n.getScore())
				.sum();
		System.out.println("== 성적합계 ==");
		System.out.println(sum);
		
		// 점수가 70점 이상인 인원수 출력
		Long count = list.stream()
				.mapToInt(n->n.getScore())
				.filter(n->n>=70)
				.count();
		System.out.println("70점 이상인 인원수:"+count);
		
		
	}

}
