package day13.product;

public class ProductTest {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Computer());
		buyer.buy(new TV());
		buyer.buy(new VCR());	// 관련 메소드 부재로 구입불가. 매개변수의 다형성 활용 필요
		buyer.buy(new HP());
		buyer.buy(new Audio());	// 상속여부에 따라
		
		

	}

}

class Product {
	int price;
	int point;	
}

class TV extends Product{}
class Computer extends Product{}
class VCR extends Product{}
class HP extends Product{}
//class Audio {}
class Audio extends Product{}

class Buyer {
	int money;
	int point;
	
	/*
	void buy(TV t){
		money -= t.price;
		point += t.point;
	}
	
	void buy(Computer t){
		money -= t.price;
		point += t.point;
	}
	*/
	
	void buy(Product t){
		money -= t.price;
		point += t.point;
	}
	
	
}