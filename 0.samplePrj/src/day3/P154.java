package day3;

import java.util.Scanner;

public class P154 {

	public static void main(String[] args) {
		
		// 키보드를 통해서 점수를 입력받고 그 점수가 유효 하다면 등급처리
		
		int jumsu;
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요! 입력예시)100 ");
		jumsu = Integer.parseInt(scanner.nextLine());
		
		// 유효성 체크
		
		if(!(0 <= jumsu && jumsu <= 100)){
			System.out.println("jumsu가 유효하지 않아 종료됩니다....");
			return;
			
		}
		
		// 등급처리
		
		System.out.println("이제부터 등급처리~~~~~~");
		
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
		
		System.out.println(jumsu+"의 등급은 "+ grade);
		
		
		
		
		
		
	}

}
