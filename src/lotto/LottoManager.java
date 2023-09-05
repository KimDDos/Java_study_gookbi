package lotto;

import java.util.Scanner;

public class LottoManager {
	
	LottoE e = new LottoE();
	private Lotto[] l = new Lotto[10];
	private int index;
	
	public void createLotto(Scanner sc) {
		int i=0;
		while(i<6) {
			System.out.println((i+1+"번째 숫자를 입력해주세요."));
			e.insertNums(sc);
			i++;
		}
		System.out.print("수동추첨: ");
		for(int tmp : e.getNums()) {
			System.out.print(tmp+" ");
		}
	}
	
	public void createLottoAuto() {
		System.out.print("자동추첨: ");
		for(int tmp : e.createRandom()) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	
	public void insertLottoAuto() {
		l[index] = new Lotto();
		int r = e.createBonus();
		l[index].setNums(e.createRandom());
		l[index].setBonus(r);
		/*
		for(int i=0; i<l[index].getNums().length; i++) {
			System.out.print(l[index].getNums()[i]+" ");
		} 
		System.out.println("보너스번호("+l[index].getBonus()+")");
		index++;
		*/
	}
	
	public void checkLotto() {
		int userNum[] = new int[6];
		userNum = e.createRandom();
		int count = 0;
		for(int num : userNum) {
			if(e.isContains(l[index-1].getNums(), num)) {
				count++;
			}
		}
		
		if(count==6) {
			System.out.println("1등");
		} else if(count == 5 && isBonus(userNum)) {
			System.out.println("2등");
		} else if(count == 5) {
			System.out.println("3등");
		} else if(count == 4) {
			System.out.println("4등");
		} else if(count == 3) {
			System.out.println("5등");
		} else {
			System.out.println("꽝~!!");
		}
		
		/*
		System.out.print("유저 : ");
		for(int tmp : userNum) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.print("컴 : ");
		for(int tmp : l[index-1].getNums()) {
			System.out.print(tmp+" ");
			System.out.println("보너스번호("+l[index-1].getBonus()+")");
		}
		System.out.println(count);
		*/
	}
	
	public void printLotto() {
		for(int i=0; i<index; i++) {
			for(int tmp : l[i].getNums()) {
				System.out.print(tmp+" ");
			}
			System.out.println("보너스번호("+l[i].getBonus()+")");
		}
	}
	
	// 맞는번호 확인
		public boolean isBonus(int[] arr) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == l[index-1].getBonus()) {
					return true;
				}
			}
			return false;
		}
	
}
