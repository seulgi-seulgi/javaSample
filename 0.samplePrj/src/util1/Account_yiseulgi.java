package util1;
/* Account Ŭ����
    ���¹�ȣ  , �ܰ�  , �Ա� , ���, ������ü, �����������
**** ������  �̸������� �ڹ����� �־� �ּ��� **************8
*/

public class Account_yiseulgi {
	
	String name;
	String num;
	int sum;
	int m;
	
	public Account_yiseulgi(){
		this("ȫ�浿","0123-456-789", 0);
	}
	
	public Account_yiseulgi(String name, String num, int sum){
		this.name = name;
		this.num = num;
		this.sum = sum;
		}
	
	
	
	public void display(){
		System.out.println("===�����������===");
		System.out.printf("������ : %s%n", name);
		System.out.printf("���¹�ȣ : %s%n", num);
		System.out.printf("�ܰ� : %d%n", sum);
		System.out.println("===============");
	}
	
	public void deposit(int m){
		sum += m;
		
		System.out.printf("�Ա� : %d��%n", m);
		System.out.printf("�ܰ� : %d��%n", sum);
		
		
	}
	
	public void withdraw(int m){
		sum -= m;
		System.out.printf("��� : %d��%n", m);
		System.out.printf("�ܰ� : %d��%n", sum);
	}
	
	public void transfer(String name1, int m){
		sum -= m;
		System.out.printf("��üó : %s%n", name1);
		System.out.printf("��ü�ݾ� : %d��%n", m);
		System.out.printf("�ܰ� : %d��%n", sum);
		
	}
	
	}
