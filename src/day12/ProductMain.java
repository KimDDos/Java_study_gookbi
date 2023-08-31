package day12;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product item = new Product();
		Product[] it = new Product[10];
		int cnt = 0;
		
		
		while (true) {
			System.out.println("상품을 등록하시겠습니까? (Y/N)");
			String str = sc.nextLine();
			switch (str) {
			case "Y": case "y":
				System.out.println("등록할 상품의 이름을 등록해주세요.");
				String str1 = sc.nextLine();
				System.out.println("등록할 상품의 가격을 입력해주세요.");
				String str2 = sc.nextLine();
				it[cnt] = new Product(str1,str2);
				cnt++;
				break;
			case "N": case "n":
				if(cnt==0) {
					System.out.println("등록된 상품이 없습니다.");
					break;
				}
				System.out.println("현재 등록된 상품을 출력합니다.");
				for(Product tmp : it) {
					System.out.println(it);
				}
				System.out.println("현재등록된 상품은 "+cnt+"개입니다.");
				System.out.println("---------출력완료---------");
				break;
				default: System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				str = sc.nextLine();
			}
			System.out.println("상품을 등록을 종료하시겠습니까? (Y/N)");
			String end = sc.nextLine();
			if(end.equals("Y") || end.equals("y")) {
				break;
			} else {
				while(true) {
					if(end.equals("N") || end.equals("n")) {
						System.out.println("입력을 재개합니다.");
						break;
					}
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					end = sc.nextLine();
				}
			}
		}
		System.out.println("상품 입력을 종료합니다.");
		
	}

}
