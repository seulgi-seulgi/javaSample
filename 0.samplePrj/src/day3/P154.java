package day3;

import java.util.Scanner;

public class P154 {

	public static void main(String[] args) {
		
		// Ű���带 ���ؼ� ������ �Է¹ް� �� ������ ��ȿ �ϴٸ� ���ó��
		
		int jumsu;
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���! �Է¿���)100 ");
		jumsu = Integer.parseInt(scanner.nextLine());
		
		// ��ȿ�� üũ
		
		if(!(0 <= jumsu && jumsu <= 100)){
			System.out.println("jumsu�� ��ȿ���� �ʾ� ����˴ϴ�....");
			return;
			
		}
		
		// ���ó��
		
		System.out.println("�������� ���ó��~~~~~~");
		
		/*
		if(jumsu >= 90){
			grade = 'A';
		}else if(jumsu >= 80){
			grade = 'B';			
		}else if(jumsu >= 70){
			grade = 'C';
		}else if(jumsu >= 60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		*/
		
		switch(jumsu/10){
		case 10:
		case 9:
			grade = 'A';
			break;
		
		default:
			grade = 'F';
		}
		
		System.out.println(jumsu+"�� ����� "+ grade);
		
		
		
		
		
		
	}

}
