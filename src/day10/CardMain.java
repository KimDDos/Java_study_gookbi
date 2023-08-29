package day10;

public class CardMain {

	public static void main(String[] args) {
		CardPack c = new CardPack();
		
		int index = 0;
		for (int i = 0; i<c.getPack().length; i++) {
			c.getPack()[i].print();
			index++;
			if(index % 13==0) {
				System.out.println();
			}
		}
		// 4줄, 1줄에 13개씩 출력
		System.out.println("-----------------------");
		c.shuffle();
		index = 0;
		for (int i = 0; i<c.getPack().length; i++) {
			c.getPack()[i].print();
			index++;
			if(index % 13==0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("-----------------------");
		Card tmp = c.pick();
		tmp.print();
		c.pick().print();
		c.pick().print();
		c.pick().print();
		c.pick().print();
		
		c.init();
	}

}
