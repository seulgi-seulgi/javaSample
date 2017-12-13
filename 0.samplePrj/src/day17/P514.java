//StringTokenizer
package day17;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P514 {
	public static void main(String[] args){
		String msg = "홍길동: 90/100/80";
		String[] data = msg.split(":");
		//String[] data = msg.split("/");
		System.out.println(Arrays.toString(data));	//[홍길동,  90/100/80]
		String[] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu));	//[ 90, 100, 80]
		System.out.println("================");
		
		//StringTokenizer st = new StringTokenizer(msg, ":/");
		StringTokenizer st = new StringTokenizer(msg, ":/", true);
		//System.out.println(st.countTokens());	//4 <- 전체 토큰의 수 반환
		while(st.hasMoreTokens()){
			//String s = st.nextToken();
			String s = st.nextToken().trim();	//공백제거
			System.out.println(s);
		}
		
		
	}

}
