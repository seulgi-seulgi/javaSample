package day3;

public class P113 {

	public static void main(String[] args) {
		
		int i = 10, j = 10;
		System.out.println(i==j);
		
		String name1 = new String("hello");
		String name2 = new String("hello");
		String name3 = name1;
		
		System.out.println("name1==name2 ? => " + (name1==name2));	// (name1==name2)에서 '()' 입력 없을 경우 '+'먼저 연산 주의 (산술연산자 우선)
																	// 주소값이 다르기 때문에 false
		System.out.println("name1==name3 ? => " + (name1==name3));
		System.out.println("name1.equals(name2) => "+name1.equals(name2));	// 가리키는 곳의 값이 같으므로 true
		System.out.println("name1.equals(name3) => "+name1.equals(name3));
		System.out.println("===========================================");
		
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);	// new를 쓰지 않으면 코드표로 관리. -> true 
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		
		
		
		
		
		
	}

}
