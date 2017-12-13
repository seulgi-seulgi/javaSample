package day16.exception;

public class Test02 {

	public static void main(String[] args) {
		try {
			Account account = new Account("ȫ�浿", 100); // ���� ����
			account.setMoney(-500); // ���� ���� �ʿ�
			System.out.println(account);
		} catch (MoneyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main END");
	}

}

class Account {

	private String name;
	private int money;

	public Account() {
		super();
	}

	public Account(String name, int money) throws MoneyException {
		super();
		this.name = name;
		this.setMoney(money);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws MoneyException {
		if (money < 0) {
			// throw new RuntimeException(); <- Unchecked Exception
			// throw new Exception();
			throw new MoneyException("money�� ����� ");
		}
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}

}

//����� ���� ���� Ŭ����
class MoneyException extends Exception { // <- Checked Exception
// class MoneyException extends RuntimeException { // <- Unchecked Exception
	MoneyException() {
		super("Money Error");
	}

	MoneyException(String msg) {
		super(msg);
	}

}


