package day4;

import java.util.Scanner;

public class P155 {

	public static void main(String[] args) {
		
		char gender;
		String regNo;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է��ϼ���. �Է¿�); 990909-2933314 ");
		regNo = scanner.nextLine();
		
		if (regNo.length()!=14){
			System.out.println("�ùٸ� �ֹι�ȣ�� �Է��ϼ���.");
			return;			
		}
		
		gender = regNo.charAt(7);
		System.out.println(regNo+" => " +gender);	// 1 2 3 4
		
		//if , switch
		
		switch(gender){
		case '1':
		case '3':
			System.out.println("����");
			break;
			
		case '2':
		case '4':
			System.out.println("����");
			break;
		
		default:
			System.out.println("�ֹι�ȣ ����");
			
		
		}
		
		
		
		
		
		
	
	}

}
