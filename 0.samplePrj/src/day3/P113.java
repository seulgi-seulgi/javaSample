package day3;

public class P113 {

	public static void main(String[] args) {
		
		int i = 10, j = 10;
		System.out.println(i==j);
		
		String name1 = new String("hello");
		String name2 = new String("hello");
		String name3 = name1;
		
		System.out.println("name1==name2 ? => " + (name1==name2));	// (name1==name2)���� '()' �Է� ���� ��� '+'���� ���� ���� (��������� �켱)
																	// �ּҰ��� �ٸ��� ������ false
		System.out.println("name1==name3 ? => " + (name1==name3));
		System.out.println("name1.equals(name2) => "+name1.equals(name2));	// ����Ű�� ���� ���� �����Ƿ� true
		System.out.println("name1.equals(name3) => "+name1.equals(name3));
		System.out.println("===========================================");
		
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);	// new�� ���� ������ �ڵ�ǥ�� ����. -> true 
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		
		
		
		
		
		
	}

}
