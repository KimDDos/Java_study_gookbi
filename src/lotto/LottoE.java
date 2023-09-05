package lotto;

public class LottoE extends Lotto{

	// 랜덤함수
	public int random() {
		return (int)(Math.random()*45)+1;
	}
	
	// 보너스번호 생성
	public int createBonus() {
		int r = random();
		while(isContains(getNums(), r)) {
			setBonus(r);
		}
		return r;
	}
	
	// 당첨번호 자동 생성
	public int[] createRandom() {
		int userNums[] = new int[6];
		int r=0;
		for(int i=0; i<userNums.length; i++) {
			r=random();
			while(isContains(userNums, r)) {
				r = random();
			}
			userNums[i] = r;
		}
		return userNums;
	}
	
	// 정렬
	public void sort(int[] nums) {
		int[] num = new int[getNums().length];
		for(int i=0; i<getNums().length; i++) {
			for(int j=i+1; j<getNums().length-1; j++) {
				if(num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
	}
	
}
