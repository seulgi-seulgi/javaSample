package day4;

public class P168 {

	public static void main(String[] args) {

		// 1~100 ��

		/*
		 * int sum = 0; int i;
		 * 
		 * sum += 1; sum += 2; sum += 3; sum += 4; => �ڵ� �ߺ� �߻�
		 * 
		 * 
		 * for(i=1 ; i<=100 ; i++){
		 * 
		 * sum +=i; }
		 * 
		 * System.out.println(sum); System.out.println(i);
		 * 
		 */

		// Ǯ��

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			sum = sum + i;

		}

		System.out.println(sum);

		sum = 0;
		int i = 1;

		while (i <= 100) {
			sum = sum + i;
			i++;

		}
		System.out.println(sum);
		
		while(sum!=5050){
			System.out.println("~~~~~~~~");
			break;
			
		}
		
		boolean flag = false;
		do{
			System.out.println("do while "+flag);
			// break;
		}while(flag);
		
		
	}

}
