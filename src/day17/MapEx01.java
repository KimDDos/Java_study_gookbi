package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* map을 이용한 성적 관리 프로그램을 생성
		 * --menu--
		 * 1.성적추가
		 * 2.성적조회(전체출력) : 합계/평균 같이 출력
		 * 3.성적조회(과목조회) : 국어 => 98점 서치후 일치하는 과목 출력
		 * 4.성적수정 : 서치후 수정
		 * 5.성적삭제
		 * 6.종료
		 * CRUD
		 * C(create) 생성
		 * R(read) 읽기(조회)
		 * U(update) 수정
		 * D(delete) 삭제
		 * */
		Scanner sc = new Scanner(System.in);
		Subject sb = new Subject();
		int menu=-1;
		
		do {
			sb.printMenu();
			menu = sc.nextInt();
			switch(menu){
			case 1: sb.insert(sc); break;
			case 2: sb.print(); break;
			case 3: sb.printSub(sc); break;
			case 4: sb.modify(sc); break;
			case 5: sb.delete(sc); break;
			case 6: break;
			default : System.out.println("잘못된 입력입니다.");
			}
			
		} while(menu != 6);
		System.out.println("프로그램 종료!!");
	}

}


class Subject{
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public void printMenu() {
		System.out.println("==성적관리 프로그램==");
		System.out.println("1.성적추가 | 2.성적조회(전체출력) | "
				+ "3.성적조회(과목조회) | 4.성적수정 | 5.성적삭제 |  6.종료");
		System.out.println("> menu 입력");
	}
	// 성적추가
	public void insert(Scanner sc) {
		System.out.println("과목과 성적을 입력해주세요. (ex 국어 90)");
		String subject = sc.next();
		int score = sc.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		if(map.get(subject)==null) {
			map.put(subject, score);
		} else {
			System.out.println(subject+"는 이미 존재합니다.");
		}
		
		}
	
	public void print() {
		int sum=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			sum += map.get(tmp);
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println("합계"+sum);
		System.out.println("평균"+(double)sum/map.size());
	}
	
	public void printSub(Scanner sc) {
		System.out.println("조회할 과목 입력:");
		String subject = sc.next();
		Integer score = map.get(subject);
		if(score==null) {
			System.out.println(subject+"는 없는 과목입니다.");
		} else {
			System.out.println(subject+":"+score);
		}
	}
	
	// 과목 수정
	public void modify(Scanner sc) {
		System.out.println("수정할 과목과 성적 입력 : ");
		String subject = sc.next();
		int score = sc.nextInt();
		if(score<0 || score>100) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		map.put(subject, score);  // key 중복불가 기존의 key를 받으면 덮어씀
		map.replace(subject, score);  // key를 수정
		System.out.println(subject+"과목이 "+score+"로 변경되었습니다.");
	}
	
	// 성적 삭제
	public void delete(Scanner sc) {
		System.out.println("삭제할 과목을 입력:");
		String subject = sc.next();
		if(map.get(subject)==null) {
			System.out.println(subject+"는 없는 과목입니다.");
		} else {
			map.remove(subject);
			System.out.println(subject+"과목이 삭제되었습니다.");
		}
		
	}
	public HashMap<String, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
}





