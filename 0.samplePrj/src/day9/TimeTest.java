package day9;

import util.Time;

public class TimeTest {

	public static void main(String[] args) {

		Time t1 = new Time();
		
		Time t2 = new Time(15, 7, 22);
				
		// System.out.println(t2.hour); -> private
		System.out.println(t2.getHour()+"½Ã");
		
		t2.setHour(52);
		System.out.println(t2.getHour()+"½Ã");
		t2.setMinute(-77);
		t2.setSecond(-77);
		System.out.println(t2.getSecond());
		
		Time t3 = new Time(3, 16, 22, false);
		System.out.println("=========================");
		Time t4= new Time(15,-77,22);
		System.out.println(t4);
		// t4.display();
		}

}
