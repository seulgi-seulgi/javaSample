package day4;

import java.util.Scanner;

public class Prob2_2 {

	public static void main(String[] args) {
	// [����] int�� ���� year�� 400���� �����������ų� �Ǵ� 4�� ������������ 100 ������������ ���� �� �� ���ǽ��� �����  ������(�������).

		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ��)1640");
		int year = scanner.nextInt();
		if(year%400==0 || year%4==0 && year%100!=0){
			System.out.println("�����Դϴ�.");
		}
			else{
				System.out.println("������ �ƴմϴ�.");
			}
				
		}
}
