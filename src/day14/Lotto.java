package day14;

import java.util.Scanner;

public class Lotto {

	private int[] nums = new int[6];
	private int bonus;
	private int cnt;
	
	public Lotto() {}
	public Lotto(int[] nums) {
		this.nums = nums;
	}
	
	// 로또 수동
	public void insertNums(Scanner sc) {
		int num = 0;
		num = sc.nextInt();
		while(isMoreLess(num)){
			System.out.println("입력 할 수 없습니다.");
			num = sc.nextInt();
		}
		while(isContains(nums, num)) {
			System.out.println("중복된 숫자는 입력할 수 없습니다.");
			num = sc.nextInt();
		}
		nums[cnt] = num;
		cnt++;
	}
	
	//예외처림(범위)
	public boolean isMoreLess(int num) {
		if(0>num|num>45) {
			return true;
		} 
		return false;
	}
	
	//예외처림(중복제거)
		public boolean isContains(int[] nums, int num) {
			for(int tmp : nums) {
				if(tmp == num) {
					return true;
				} 
			}
			return false;
		}
		
		public int[] getNums() {
			return nums;
		}
		public void setNums(int[] nums) {
			this.nums = nums;
		}
		public int getBonus() {
			return bonus;
		}
		public void setBonus(int bonus) {
			this.bonus = bonus;
		}
		public int getCnt() {
			return cnt;
		}
		public void setCnt(int cnt) {
			this.cnt = cnt;
		}
		
		
}
