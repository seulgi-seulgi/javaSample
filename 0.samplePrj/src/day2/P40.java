package day2;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		Scanner input = null ;
		input = new Scanner(System.in);
		
	
		System.out.print("�л� �̸��� �Է��ϼ���;_");
		String name = input.nextLine(); 
		
		System.out.print("������ �Է��ϼ��� ex)90 _");
		//int score = Integer.parseInt(input.nextLine());
		int score = input.nextInt();
		input.nextLine();
				
		System.out.printf("�̸�: %s , ����: %d %n",name,score);
		
		
		input.close();
		input = null;
		
		

		

		
			
		
	}

}
