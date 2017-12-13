package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505_1 {

	public static void main(String[] args) {
		String[] data = {
					
		};
		
		String pattern = "j.*";
		pattern = "";
		Pattern p = Pattern.compile(pattern);
		
		for(int i=0; i<data.length; i++){
			Matcher matcher = p.matcher(data[i]);
			if(matcher.matches())
				System.out.print(data[i]);
		}
		System.out.println("=== main end ===");
	}
	
}

