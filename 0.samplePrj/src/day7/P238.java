package day7;

public class P238 {

	public static void main(String[] args) {

		TV tv1 = new TV();
		tv1.display();
		tv1.power();
		tv1.channelUP();
		tv1.channelUP();
		tv1.channelUP();
		tv1.channelUP();
		tv1.display();
		
		TV tv2 = new TV();
		tv2.display();
		tv2.power();
		
		

	}

}

class TV {
	String color; // ����
	boolean power; // ��������(on/off)
	int channel; // ä��

	void power() {power = !power;}

	void channelUP() {++this.channel;}

	void channelDown() {--channel;}
	
	void display(){
		System.out.printf("TV[%s channel:%d ����(%b)]%n", this.color, channel, power);
		
	}
	
}

class TvTest3{
	public static void main(String args[]){
		TV t1 = new TV();
		TV t2 = new TV();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}
