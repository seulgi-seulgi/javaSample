	/*
	  ====  �����ϼ��� Prob1_�̸�.java======
	  
package day3;
public class Prob1 {
	public static void main(String[] args) {

        ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�.
        ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� 
	�ҹ��ڷ� �����ϴ� �ڵ带 �ϼ� �մϴ�.

	char ch = 'P';
	char lowerCase = ________���� ���� �ڷ� ó��________;
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);


 �Ʒ��� ���� num�� ��������  ��� ���� 0�� ����ϴ� �ڵ��Դϴ�.
���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���. 

	int num = -90;


	
	}
}          
	 */

package day3;

public class Prob1 {

	
	public static void main(String[] args) {
	
		/*
		char ch = 'P';
		int ch1 = ch;
		int result = ch1 + 32;
		char lowerCase = ('a' <= ch && ch <= 'z') ? ch : (('A'<= ch && ch <= 'Z') ? (char)result : ' ');
		
		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase : " +lowerCase);
		
		
		int num = -90;
		String result1 = num > 0 ? "���" : (num < 0 ? "����" : "0");
		System.out.println(result1);		
		

		// ���� Ǯ��
		
		/*
		char c='a', d='A';
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));	// a 97 , A 65
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));	// b 98 , B 66
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));	// c 99 , C 67
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));	// j 106 , J 74

		// �ڵ��� �ߺ��� ������ ���� ��� �ʿ�

		*/
		
		char ch = 'f';
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char) (ch + 32) : ch ;
		System.out.print("ch:" +ch);
		System.out.println(" to lowerCase : " +lowerCase);
		
		
		int num = -90;
		
		String result = (num > 0) ? "���" : (num < 0 ? "����" : "0") ;
		System.out.println(num + " : " + result);
		
		
	}

}










