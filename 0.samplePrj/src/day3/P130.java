package day3;

public class P130 {

	public static void main(String[] args) {

		int jumsu = 99;
		
		if(0 <= jumsu && jumsu <=100){
		
			String result = (jumsu >= 80) ? "Pass" : "No Pass" ;
			System.out.println(jumsu + " : " + result);
			
		}else{
			System.out.println("���� ���� => Ȯ���ϼ���");
			
		}
		
		//char c = 0 >= jumsu && jumsu <=100 ? 'O' : 'X' ;
		
		
		int i=100, j=200;
		
		int max = (i>j) ? i : j ;
		
		System.out.println(max);
		System.out.println("max : " + ((i>j) ? i : j));
		
		
		
		
	}

}
