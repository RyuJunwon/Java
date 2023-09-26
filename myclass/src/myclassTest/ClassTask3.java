package myclassTest;

class Customer {
	String name;
	String phone;
	int money;
	int discount;

	public Customer(String name, String phone, int money, int discount) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}
}

class Market {
	String productName;
	int productPrice;
	int productStock;

	public Market(String productName, int productPrice, int productStock) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}

	void sell(Customer customer) {
		customer.money -= this.productPrice * (100 - customer.discount) / 100.0;
		productStock--;
	}
}

public class ClassTask3 {
	public static void main(String[] args) {

		Market emart = new Market("새우깡", 1300, 500);

		Customer[] customer = { new Customer("한동석", "01012341234", 3000, 50),
				new Customer("홍길동", "01012341344", 3000, 10) };

		for (int i = 0; i < customer.length; i++) {
			emart.sell(customer[i]);
			System.out.println(customer[i].name + " 님의 남은 잔액: " + customer[i].money + "원");
		}

	}

}
