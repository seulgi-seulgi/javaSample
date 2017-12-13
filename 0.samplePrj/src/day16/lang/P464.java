package day16.lang;

public class P464 {

	public static void main(String[] args) {
	String msg = "Hello java test~~~~";	// String <- 읽기O, 쓰기X
	System.out.println(msg);
	msg.replace('~', '!');
	System.out.println(msg);	//Hello java test~~~~	
	System.out.println(msg.replace('~', '!'));	//Hello java test!!!!
	System.out.println(msg);
	System.out.println();
	
	msg.concat(" sample");
	System.out.println(msg);
	System.out.println();
	
	StringBuffer sb = new StringBuffer("StringBuffer test");	// StringBuffer <- 읽기O, 쓰기O
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);	//tset reffuBgnirtS
	sb.reverse();
	System.out.println(sb);	//StringBuffer test
	sb.append(" sample");
	System.out.println(sb);	//StringBuffer test sample
	
	String s = sb.toString();	//StringBuffer -> String
	
		

	}

}
