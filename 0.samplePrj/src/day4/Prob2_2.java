package day4;

import java.util.Scanner;

public class Prob2_2 {

	public static void main(String[] args) {
	// [예제] int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100 나눠떨어지지 않을 때 인 조건식을 만들어  보세요(윤년공식).

		Scanner scanner = new Scanner(System.in);
		System.out.println("윤년공식 예)1640");
		int year = scanner.nextInt();
		if(year%400==0 || year%4==0 && year%100!=0){
			System.out.println("윤년입니다.");
		}
			else{
				System.out.println("윤년이 아닙니다.");
			}
				
		}
}
