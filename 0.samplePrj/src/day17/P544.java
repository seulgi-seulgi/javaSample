//SimpleDateFormat
package day17;

import java.util.Calendar;
import java.util.Date;

public class P544 {
	public static void main(String[] args) {
		String name ="ȫ�浿";
		System.out.printf("%s , %s , %d , %f %n", name, "~~~", 90, 5.5);
		
		//String.format
		String msg = String.format("%s , %s , %d , %f %n", name, "~~~", 90, 5.5);
		System.out.println(msg);
		
		String df = String.format("%5.2f ", Math.PI);	//String�̹Ƿ� ���� ���� �Ұ� -> ���� �Ϸ� �� ������ ��
		System.out.println(df);
		
		//Date d= new Date();
		Date d= new Date(2017,11,21);	//Deprecated
		System.out.println(d);	//Tue Nov 21 10:15:48 KST 2017
		System.out.println(d.getYear());	//Deprecated
		System.out.println("================================");
				
		//Calendar c = new Calendar();	//Cannot instantiate the type Calendar -> abstract, ������ �̿��ؼ� ��ü ���� �Ұ�
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		//c.set(2016, 11, 21);
		//System.out.println(c);
		System.out.println();
		
		df = String.format("%tY�� %tm�� %te�� %n", c, c, c);
		System.out.println(df);	//2017�� 11�� 21��
		df = String.format("%1$tY�� %1$tm�� %1$te�� %1$ta���� %n", c);
		System.out.println(df);	//2017�� 11�� 21�� ȭ����

	}
}
