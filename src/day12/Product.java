package day12;

public class Product {
	private String menu;
	private String price;
	
	// 메서드
	public void insert(String menu, String price) {
		setMenu(menu);
		setPrice(price);
	}
	
	
	public Product() {	}
	public Product(String menu, String price) {
		this.menu = menu;
		this.price = price;
	}



	@Override
	public String toString() {
		return menu + " : " + price;
	}
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
