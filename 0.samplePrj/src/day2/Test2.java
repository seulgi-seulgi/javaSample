package day2;

import java.util.Date;
// import java.sql.Date; 사용불가


public class Test2 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getYear());
		
		java.sql.Date today = null; // 코드중복발생시  import 사용 가능
		System.out.println(today);
		
		now = null;

		
	}

}
