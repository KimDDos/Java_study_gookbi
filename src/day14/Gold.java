package day14;

public class Gold extends Silver{

	protected double discount = 1-0.1;
	
	public Gold(String customerName) {
		super(customerName);
		this.customerGrade = "Gold";
		this.bonusRatio = isBonusRatio(customerGrade);
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return (int)(super.calcPrice(price)*discount);
	}
	
}
