//SimpleDateFormat
package day17;

import java.util.Calendar;
import java.util.Date;

public class P544 {
	public static void main(String[] args) {
		String name ="홍길동";
		System.out.printf("%s , %s , %d , %f %n", name, "~~~", 90, 5.5);
		
		//String.format
		String msg = String.format("%s , %s , %d , %f %n", name, "~~~", 90, 5.5);
		System.out.println(msg);
		
		String df = String.format("%5.2f ", Math.PI);	//String이므로 이후 연산 불가 -> 연산 완료 후 적용할 것
		System.out.println(df);
		
		//Date d= new Date();
		Date d= new Date(2017,11,21);	//Deprecated
		System.out.println(d);	//Tue Nov 21 10:15:48 KST 2017
		System.out.println(d.getYear());	//Deprecated
		System.out.println("================================");
				
		//Calendar c = new Calendar();	//Cannot instantiate the type Calendar -> abstract, 생성자 이용해서 객체 생성 불가
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		//c.set(2016, 11, 21);
		//System.out.println(c);
		System.out.println();
		
		df = String.format("%tY년 %tm월 %te일 %n", c, c, c);
		System.out.println(df);	//2017년 11월 21일
		df = String.format("%1$tY년 %1$tm월 %1$te일 %1$ta요일 %n", c);
		System.out.println(df);	//2017년 11월 21일 화요일

	}
}
