package util1;

public class Account_yiseulgiTest {

	public static void main(String[] args) {
		
		Account_yiseulgi a1 = new Account_yiseulgi();
		a1.display();
		a1.deposit(10000);
		a1.deposit(10000);
		a1.withdraw(10000);
		a1.transfer("���ð���", 10000);
		
		Account_yiseulgi a2 = new Account_yiseulgi("�ֱ浿", "123-456-789", 3500);
		a2.display();
		a2.deposit(10000);
		a2.deposit(10000);
		a2.withdraw(10000);
		a2.deposit(10000);
		a2.transfer("��浿", 20000);
		a2.display();
		
		
	}

}
