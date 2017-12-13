package day5;

public class P186 {

	public static void main(String[] args) {
		/*
		 * String[] names; char[] chars; int[] score; // 배열 선언
		 * 
		 * score = new int[5]; // 배열 생성
		 */

		String[] names = new String[3]; // 배열 선언과 생성을 함께
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + ", ");
		}
		System.out.println("\n==============================================");
		char[] chars = new char[names.length];
		System.out.println(chars[0]+", "+chars[1]+", "+chars[2]+", ");
		
		int[] score;
		score = new int[5];

		/*
		 * System.out.println(score); // score 주소 출력
		 * System.out.print(score[0]+", "); System.out.print(score[1]+", ");
		 * System.out.print(score[2]+", "); System.out.print(score[3]+", ");
		 * System.out.print(score[4]+", "); // 코드 중복
		 * System.out.print(score[5]+", "); //
		 * java.lang.ArrayIndexOutOfBoundsException: 5
		 */

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ", ");
		}
		System.out.println("\n==============================================");
		for (int data : score) {
			System.out.print(data + " ");
		}

		System.out.println("\n==============================================");
		
	}
}
