package day12;

public class StudentTest2 {

	public static void main(String[] args) {

		String name = new String("java test~~~~");
		String name2 = new String("java test~~~~");
		System.out.println(name==name2);	//false
		System.out.println(name.equals(name2));	//true
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date);
		System.out.println(date.toString());
		System.out.println(date==date2);	//false
		System.out.println(date.equals(date2));	//true
		
		Student s = new Student("ȫ�浿", 22, 1);
		Student s2 = new Student("ȫ�浿", 22, 1);
		System.out.println(s);	//��� : day12.Student@70dea4e (toString�� �������̵� ���� �ʾƼ�)
		System.out.println(s.toString());
		System.out.println(s==s2);	//false
		System.out.println(s.equals(s2));	//false -> �������̵� �� true
		System.out.println(s.equals(date));
		System.out.println(s.equals(null));
		String s3 = null;
		System.out.println(s.equals(s3));
		
		
		
	}

}
