package day13;

public class StudentTest {

	public static void main(String[] args) {

		Student s = new Student("A", 9);
		System.out.println(s);
		System.out.println(s.getClass());
		System.out.println();
		
		//Student s1 = null;
		Student s1 = s;
		System.out.println(s.equals(s1));
		System.out.println();
		
		Student[] students = {s, new Student("B", 1), new Student()};
		for(int i = 0; i<students.length;i++){
			System.out.println(students[i]);
		}

	}

}
