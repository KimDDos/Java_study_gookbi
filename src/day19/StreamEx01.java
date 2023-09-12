package day19;

import java.util.ArrayList;
import java.util.Objects;

public class StreamEx01 {

	public static void main(String[] args) {
		/* 여행상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 15세 미만은 50만원
		 * 고객 3명이 패키지 여행을 떠나려고 할 때
		 * 1. 여행비용계산
		 * 2. 고객명단출력
		 * 
		 * 고객은 class로 생성. ArrayList로 고객 3명 추가
		 * 고객 정보
		 * 이름 : 이순신, 나이 : 40, 비용 : 100
		 * 이름 : 김순이, 나이 : 35, 비용 : 100
		 * 이름 : 이아들, 나이 : 10, 비용 : 50
		 * 총여행경비 : 250만원
		 * */
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("이순신",45));
		list.add(new Customer("김순이",35));
		list.add(new Customer("이아들",10));
		
		list.stream().forEach(n->System.out.println(n));
		int sum = list.stream().mapToInt(n->n.getCost()).sum();
		System.out.println("총 비용 :"+sum+"만원");
		
		// 20세 이상 성인만 이름을 정렬하여 출력
		list.stream().filter(n->n.getAge()>=20)
		.sorted().forEach(System.out::println);
		
	}

}

class Customer implements Comparable{
	private String name;
	private int age;
	private int cost;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name=name;
		this.age=age;
		this.cost=(age>=15 ? 100:50); 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, cost, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && cost == other.cost && Objects.equals(name, other.name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "이름:"+name + ", 나이:" + age + ", 비용:" + cost + "만원";
	}
	@Override
	public int compareTo(Object o) {
		Customer curr = (Customer)o;
		return this.name.compareTo(curr.name);
	}
	
}