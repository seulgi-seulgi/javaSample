package day2;

public class P24 {

	int tmp;
	
	public static void main(String[] args) {
		int x = 600, y= 700;
		
			
		System.out.printf("x= %d, y= %d %n ", x,y);
		
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.printf("x= %d, y= %d %n ",x,y);
		
		

	}

}
