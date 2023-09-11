package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1.햄버거:7000
		 * 2.피자:15000
		 * 3.음료수:2000
		 * 4.과자:1000
		 * 5.사탕:500
		 * 6.프로그램 종료
		 * 
		 * 메뉴선택 > 1
		 * 수량 > 2
		 * => 1번 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 1
		 * 메뉴선택 > 3
		 * 수량 > 2
		 * => 3번 음료 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0 
		 * 
		 * --선택한 메뉴
		 * 1.햄버거 2개
		 * 2.음료 2개
		 * 총 지불금액 000원
		 * */
		FoodManager fm = new FoodManager();  // add 완료
		System.out.println(fm.getList1());
		System.out.println(fm.getList2());
		
		ArrayList<Integer> order = new ArrayList<Integer>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);

		int menu = -1;
		do {
			fm.printMenu();  // 메뉴출력
			menu = scan.nextInt(); // 메뉴입력받기
			// 1~5 일반메뉴, 6 프로그램 종료, 0메뉴선택 끝
			if(menu==6) {
				System.out.println("프로그램 종료");
				break;
			}
			if(menu != 0) {
				if(menu<6) {
					System.out.println("수량 > ");
					int cnt = scan.nextInt();
					order.add(menu);
					count.add(cnt);
					fm.sale(menu, cnt);
					System.out.println("주문종료 => 0, 프로그램 종료 => 6");
				} else {
					System.out.println("잘못된 메뉴");
				}
			}
		} while(menu!=0);
		// 메뉴의 전체 금액을 출력. totSum
		// 피자 3개
		// order = 2-1 / count = 3
		System.out.println("-- 메뉴확인 --");
		for(int i=0; i<order.size(); i++) {
			System.out.println(fm.getList1().get(order.get(i)-1)+" "); //피자
			System.out.println(count.get(i)+"개 ");
			int price = fm.getList2().get(order.get(i)-1);
			System.out.println(" " + (price*count.get(i)));
		}
		System.out.println("---------------");
		System.out.println("총 금액: "+fm.getTotSum());
		
		scan.close();
	}

}

class FoodManager{
	//멤버변수 ArrayList 메뉴, ArrayList 가격
	//그외 필요한 멤버변수는 선택
	private List<String> list1 = new ArrayList<String>();
	private List<Integer> list2 = new ArrayList<Integer>();
	private int sum;
	private int totSum;
	
	public FoodManager() {
		add();
	}
	
	//메서드
	//출력 : 결과출력, 메뉴출력, add(), sale()
	public void printMenu() {
		System.out.println("--Menu--");
		System.out.println("1.햄버거:7000");
		System.out.println("2.피자:15000");
		System.out.println("3.음료수:2000");
		System.out.println("4.과자:1000");
		System.out.println("5.사탕:500");
		System.out.println("메뉴선택 > ");
	}
	
	public void add() {
		// list에 값 추가
		list1.add("햄버거");  // index 0
		list1.add("피자");
		list1.add("음료수");
		list1.add("과자");
		list1.add("사탕");
		
		list2.add(7000);
		list2.add(15000);
		list2.add(2000);
		list2.add(1000);
		list2.add(500);
	}
	
	public void sale(int menu, int count) {
		// menu-1 : list2의 index 번호로 사용
		sum = list2.get(menu-1) * count;
		totSum += sum;
		System.out.println("---------------");
		System.out.println("주문하신 메뉴는 "+list1.get(menu-1)+" "+count+"개입니다.");
		System.out.println("금액 : "+sum);
	}

	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTotSum() {
		return totSum;
	}

	public void setTotSum(int totSum) {
		this.totSum = totSum;
	}
	
}