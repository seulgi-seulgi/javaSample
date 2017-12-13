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
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널

	void power() {power = !power;}

	void channelUP() {++this.channel;}

	void channelDown() {--channel;}
	
	void display(){
		System.out.printf("TV[%s channel:%d 전원(%b)]%n", this.color, channel, power);
		
	}
	
}

class TvTest3{
	public static void main(String args[]){
		TV t1 = new TV();
		TV t2 = new TV();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}
