/* Prob1. Ŭ������ main() ����
 �־��� ���� ������ �������� ������� �� �ֵ��� 
 main �޼��带 �ۼ��ϼ���. 
 
-	���ڿ� ������ �������� ���
-	�Է����� �־��� ���ڿ�  :   "Java Programming" 

ó�� ����� �� : 
gnimmargorP avaJ

package day4;
public class Prob1 {
	public static void main(String[] args) {
		String strData  =  "Java Programming";
		// TODO
	}
}
*/

package day4;

public class Prob1_yiseulgi {

	public static void main(String[] args) {

		String strdata = "Java Programming";
		// System.out.println(strdata.length());
		// System.out.println(strdata.charAt(0));
		// System.out.println(strdata.charAt(15));

		for (int i = 0; i <= 15; i++) {
			System.out.print(strdata.charAt(15 - i));
		}
		System.out.println();
		// Ǯ��
		
		String name = "Java Programming"; 
		int index = name.length()-1;
		
		for(index=15; index>=0;index--){
			System.out.print(name.charAt(index));
			
		}
	}

}
