package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//Set<String> set = new TreeSet<String>();	//TreeSet �� sort����.
		
		/*
		set.add("java 01");
		set.add("java 01");
		set.add("java 01");
		set.add("java 01");
		System.out.println(set);	//[java 01] <- �ߺ�����(�ߺ�üũ). ������ �Է����� overwrite.
		*/
		set.add("java 09");
		set.add("java 07");
		set.add("java 01");
		set.add("java 04");
		System.out.println(set);	//[java 09, java 07, java 04, java 01] <- index��
		set.remove("java 07");
		System.out.println(set);	//[java 09, java 04, java 01]
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String data = it.next();
			System.out.println(data.substring(data.length()-2));
		}
		Iterator itt = set.iterator();
		while(itt.hasNext()){
			Object data = itt.next();
			System.out.println(data);
		}
		
		set.add("java 99");
		set.add("java 59");
		set.add("java 49");
		set.add("java 19");
		System.out.println(set);
		//[java 19, java 09, java 04, java 59, java 49, java 99, java 01]
		//Set�� �ָӴ� ���� ����. ���� ���� �Ұ���
		
		
		
	}
}
