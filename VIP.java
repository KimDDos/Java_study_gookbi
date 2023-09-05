package day14;

public class VIP extends Gold{

	private int agentID;
	
	public VIP(String customerName) {
		super(customerName);
		this.discount = 1-0.2;
		this.customerGrade = "VIP";
		this.bonusRatio = isBonusRatio(customerGrade);
		this.agentID = 1234;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return (int)(super.calcPrice(price)*discount);
	}
	
	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
		System.out.println("전문상담사 번호는 "+agentID+"입니다.");
	}

	
	
}
