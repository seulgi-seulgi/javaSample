package day19.prob2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob2 {

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000#";
		// Set<String> strs = stringSplit(str, "#");
		Set<String> list = Prob2.stringSplit(str, "#");

		System.out.println(list);
	}

	private static Set<String> stringSplit(String str1, String str2) {
		// private �޼ҵ� <- �ܺο��� ��� �Ұ�

		Set<String> set = new HashSet<>();
		int p = -1;
		// p = str1.indexOf("#");
		// p = str1.indexOf("#",p+1);
		int p1 = str1.lastIndexOf("#");

		// set.add(str1.substring(0,p));

		// set.add(str1.substring(p+1, p=str1.indexOf("#", p+1)));
		// set.add(str1.substring(p+1, p=str1.indexOf("#", p+1)));
		// set.add(str1.substring(p+1, p=str1.indexOf("#", p+1)));
		// set.add(str1.substring(p+1, p=str1.indexOf("#", p+1)));

		/*
		 * do{ if(p+1>=str1.length()) break; set.add(str1.substring(p+1,
		 * p=str1.indexOf("#", p+1))); } while (p != -1);
		 * 
		 * return set;
		 */
		// �������� "#"�� ���� ��� ���������, �������� "#"�� ���ٸ� ����.

		/*
		 * do{ if(p>=p1) break; set.add(str1.substring(p+1, p=str1.indexOf("#",
		 * p+1))); } while (p != -1);
		 * 
		 * return set;
		 */

		// * while��
		boolean flag = true;

		while (flag) {
			set.add(str1.substring(p + 1, p = str1.indexOf("#", p + 1)));
			if (p >= p1) {
				flag = false;
			}
		}

		return set;

	}

}