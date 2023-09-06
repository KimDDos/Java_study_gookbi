package day14;

public class Customer {
	/* 고객 클래스
	 * 일반고객 / Gold고객 / VIP고객
	 * 
	 * 멤버변수
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 
	 * - Customer 객체 생성시 
	 *  기본 customerGrade = Silver
	 *  기본 bonusRatio = 0.01
	 * 
	 * - 메서드 
	 * - 보너스 적립 계산 메서드(메서드명 : calcPrice(int price))
	 *   => 보너스를 적립하고, 할인여부 체크하여 구매 price 리턴
	 *   구매금액을 주고, 적립보너스게산, bonusPoint 누적, 실 구매금액 리턴
	 *   
	 * - 출력 메서드 (메서드명 : customerInfo())
	 *   홍길동님의 등급은 VIP이며, 보너스 포인트는 1000입니다. 
	 *   전담 상담사 번호는 1111입니다. - VIP만 출력
	 *   
	 * - Silver등급 
	 *   제품을 살때 할인 없음. / 보너스포인트 1% 적립 
	 *   
	 * - Gold등급
	 *   제품을 구매할때 10% 할인 / 보너스포인트 2% 적립
	 *   
	 * - VIP등급
	 *   제품을 구매할때 20% 할인 / 보너스포인트 5% 적립
	 *   전담상담사를 갖는다. (int agentID)
	 * */
	
	// 멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade = "Silver";
	protected int bonusPoint;
	protected double bonusRatio = 0.01;
	
	// 생성자
	public Customer(String customerName) {
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = isBonusRatio(customerGrade);
	}
	
	// 메서드
	// 1. 보너스 적립 및 실구매가 계산 메서드
	public int calcPrice(int price) {
		int num = price;
		bonusPoint += price*bonusRatio;
		return num;
	}
	
	// 2. 출력메서드
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}
	
	// 2-1. 가격 출력 메서드
	public void print(int num) {
		System.out.println(customerName+"님의 구매가격 "+num+"입니다.");
	}
	
	// 3. 등급별 보너스 적립비율 판단 메서드
	public double isBonusRatio(String customerGrade) {
		if(customerGrade.equals("VIP")) {
			bonusRatio = 0.05;
			return bonusRatio;
		} else if(customerGrade.equals("Gold")) {
			bonusRatio = 0.02;
			return bonusRatio;
		} else {
			bonusRatio = 0.01;
			return bonusRatio;}
	}
	
	// 4. 현재 보유중인 보너스 포인트 출력 메서드
	public void bonusScore() {
		System.out.println(customerName+"님의 현재 보너스포인트는 "+bonusPoint+"입니다.");
	}
	
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
}