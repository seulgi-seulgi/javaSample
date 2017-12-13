package util;

public class Account {
	
	// data, method
	
	String name;
	String num;
	int money;
	
	public Account(){}
	public Account(String name, String num, int money){
		this.name = name;
		this.num = num;
		this.money = money;
	}
	
	//입금
	public void deposit(int money){
		this.money += money;
		System.out.println("입금 : "+money+"원, 잔고: "+this.money+"원");
	}

	//출금
	public void withdraw(int money){
		if(this.money<money){
			System.out.println("잔고부");
			return;
		}
		
		this.money -= money;
		System.out.println("출금 : "+money+"원, 잔고: "+this.money+"원");
	}

	//잔고조회
	public void display(){
		System.out.println("예금주 : "+this.name);
		System.out.println("통장번호 : "+this.num);
		System.out.println("잔고 : "+this.money+"원");
	}
	
	//계좌이체
	public void transfer(Account from, Account to, int money){
		if(to == null){
			System.out.println("계좌정보 확인하세요.");
			return;
		}
			
		if(from.money<money){
			System.out.println("잔고부족");
			System.out.println("계좌이체 종료");
			System.out.println();
			return;
		}
		
		System.out.println("출금계좌정보");
		from.display();
		System.out.println();
		
		System.out.println("입금계좌정보");
		to.display();
		System.out.println();
		
		System.out.println("----계좌이체 수행 중----");
		from.withdraw(money);
		to.deposit(money);
		System.out.println("----계좌이체 완료----");
	}

}
