package day14;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c = new Customer("참이슬");
		System.out.println("구매가격은 "+c.calcPrice(12000)+"입니다.");
		c.customerInfo();
		c.print(c.calcPrice(12000));
		c.customerInfo();
		
		System.out.println("=========================");
		
		Customer c1 = new Silver("진로");
		System.out.println("구매가격은 "+c1.calcPrice(12000)+"입니다.");
		c1.customerInfo();
		c1.print(c1.calcPrice(12000));
		c1.customerInfo();
		
		System.out.println("=========================");
		
		Customer c2 = new Gold("하이트");
		System.out.println("구매가격은 "+c2.calcPrice(12000)+"입니다.");
		c2.customerInfo();
		c2.print(c2.calcPrice(12000));
		c2.customerInfo();
		
		System.out.println("=========================");
		
		Customer c3 = new VIP("로얄샬루트");
		System.out.println("구매가격은 "+c3.calcPrice(12000)+"입니다.");
		c3.customerInfo();
		c3.print(c3.calcPrice(12000));
		c3.customerInfo();
		
		
	}

}
