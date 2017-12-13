package day11.prob1;

public class Test3 {

	public static void main(String[] args) {

		Student s = new Student("홍길동", 20, 200201);
		s.print();

		Teacher t = new Teacher("이순신", 30, "JAVA");
		t.print();

		Employee e = new Employee("유관순", 40, "교무과");
		e.print();
	}

}
