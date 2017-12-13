package day19.prob2.yiseulgi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Prob2 {

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== ���ڿ� ó�� ��� ===");
		
		Iterator<String> it =strs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
                 //strs �� �Ʒ��Ͱ��� ��µǵ��� �ڵ带 �ϼ��ϼ���

		System.out.println(str.charAt(0));
	}

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> strs = new HashSet<>();
		String temp = ""; 
		for(int i = 0; i<str1.length();i++){
			if (i==str1.length()-1){
				strs.add(temp);
				temp = "";
			} else if (str1.charAt(i)==str2.charAt(0)){	
				strs.add(temp);
				temp = "";
			} else {
				temp += str1.charAt(i);
			}
		}
		return strs;
	}	
}