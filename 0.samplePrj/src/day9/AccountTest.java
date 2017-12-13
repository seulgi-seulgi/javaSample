package day9;

import util.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account a1 = new Account("È«±æµ¿", "001", 3000);
		a1.deposit(5000);
		a1.withdraw(2000);
		
		Account a2 = new Account("±è±æµ¿", "002", 1000);
		a1.transfer(a1, a2, 9000);
		
		Account a3 = null;
		a1.transfer(a1, a3, 9000);
		
		
	}

}
