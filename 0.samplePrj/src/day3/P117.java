package day3;

import java.util.Scanner;


public class P117{

	public static void main(String[] args){

		Scanner scanner = new Scanner (System.in);
		input = scanner.nextLine();
		
		System.out.print("영문자 하나 입력하세요! ");
		//String data = input.nextLine();
		//char c = data.charAt(0);
		
		char c = input.nextLine().charAt(0);

		//System.out.println("\n 입력데이터 : "+data);

		boolean result = 'A'<= c  && c <= 'z';
		System.out.println(c + " : " + result);		

		


	}


}