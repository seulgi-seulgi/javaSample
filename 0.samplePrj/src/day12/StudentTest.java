package day12;

public class StudentTest {

	public static void main(String[] args) {

		String name = new String("java test~~~~");
		String name2 = new String("java test~~~~");
		System.out.println(name);
		System.out.println(name.toString());
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date);
		System.out.println(date.toString());
		Student s = new Student("홍길동", 22, 1);
		Student s2 = new Student("홍길동", 22, 1);
		System.out.println(s);	//출력 : day12.Student@70dea4e (toString을 오버라이드 하지 않아서)
		System.out.println(s.toString());
		
	}

}
