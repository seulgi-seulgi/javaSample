package day11.prob1;

public class Test {
	public static void main(String[] args) {
		Object s = new Student("�浿", 20, 1);
		// s.print(); //�Ұ�
		// ((Student)s).print(); ���������� instanceof üũ �ʿ�
		if (s instanceof Student)
			((Student) s).print();
		s = "Hello";
		if (s instanceof Student)
			((Student) s).print();

		String name = "OOO";
		Student s1 = new Student("�浿", 20, 1);
		Teacher t1 = new Teacher("ȫ��", 40, "java");
		Employee e1 = new Employee("ȫ�浿", 44, "������");

		// Object[] obj = {name, s1, t1, e1};
		// Person[] p = {name, s1, t1, e1};
		Person[] p1 = { s1, t1, e1 };
		Person[] p = { s1, t1, e1, new Student("��浿", 22, 2) };

		System.out.println("=================================");

		for (int i = 0; i < p1.length; i++) {
			if (p1[i] instanceof Student)
				((Student) p1[i]).print();
			if (p1[i] instanceof Teacher)
				((Teacher) p1[i]).print();
			if (p1[i] instanceof Employee)
				((Employee) p1[i]).print();
		}

		System.out.println("=================================");

		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Student)
				((Student) p[i]).print();
			if (p[i] instanceof Teacher)
				((Teacher) p[i]).print();
			if (p[i] instanceof Employee)
				((Employee) p[i]).print();
		}

		System.out.println("=================================");

		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}

		System.out.println("=================================");
		// Person pp = null;
		Person pp = s1;
		pp.print();

		System.out.println();
		System.out.println();

		Object[] obj = { name, s1, t1, e1 };
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Person)
				((Person) obj[i]).print();
		}

	}

}
