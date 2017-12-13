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
	
	//�Ա�
	public void deposit(int money){
		this.money += money;
		System.out.println("�Ա� : "+money+"��, �ܰ�: "+this.money+"��");
	}

	//���
	public void withdraw(int money){
		if(this.money<money){
			System.out.println("�ܰ��");
			return;
		}
		
		this.money -= money;
		System.out.println("��� : "+money+"��, �ܰ�: "+this.money+"��");
	}

	//�ܰ���ȸ
	public void display(){
		System.out.println("������ : "+this.name);
		System.out.println("�����ȣ : "+this.num);
		System.out.println("�ܰ� : "+this.money+"��");
	}
	
	//������ü
	public void transfer(Account from, Account to, int money){
		if(to == null){
			System.out.println("�������� Ȯ���ϼ���.");
			return;
		}
			
		if(from.money<money){
			System.out.println("�ܰ����");
			System.out.println("������ü ����");
			System.out.println();
			return;
		}
		
		System.out.println("��ݰ�������");
		from.display();
		System.out.println();
		
		System.out.println("�Աݰ�������");
		to.display();
		System.out.println();
		
		System.out.println("----������ü ���� ��----");
		from.withdraw(money);
		to.deposit(money);
		System.out.println("----������ü �Ϸ�----");
	}

}
