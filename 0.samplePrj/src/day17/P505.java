//Pattern
//패턴 만드는 규칙 p507
package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505 {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "Ca", "co", "c.", "c0", 
							"car", "combat", "count", "date", "disc"};
		Pattern p = Pattern.compile("c[a-z]*");
		
		for(int i=0; i<data.length; i++){
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i]+",");
			
		}
	

	}

}

