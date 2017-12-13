package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// Student s = new Student("홍길동", 26);
		// System.out.println(s);
		Student[] students = new Student[100];
		int count = 0;

		try (Scanner scanner = new Scanner(new File("studentdata.txt"))) {
			while (scanner.hasNextLine()) {
				String readLine = scanner.nextLine();
				String[] data = readLine.split("/");
				students[count] = new Student(data[0], Integer.parseInt(data[1]));
				count++;
			}

		} catch (Exception e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("studentdata.txt 문서 준비하세요");
			} else {
				e.printStackTrace();
			}
		} finally {
		}
		// System.out.println(Arrays.toString(students));

		try {
			Arrays.sort(students, 0, count); // 기준 없어서 sort 불가 <- Comparable
												// interface 필요
		} catch (ClassCastException e) {
			System.out.println("정렬 기준키 설정 필요");
		}

		// System.out.println(students.getClass().getName());
		// if(students.getClass() instanceof Comparable)

		for (int i = 0; i < count; i++) {
			System.out.println(students[i]);
			System.out.println("-----------------------------");

		}
		String[] i = { "j", "a", "f" };
		Arrays.sort(i);
		System.out.println(Arrays.toString(i)); // [a, f, j]

		System.out.println("***** Main end ******");
	}

}

// class Student {
// class Student implements Comparable {
class Student implements Comparable<Student> {
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	/*
	 * @Override public int compareTo(Object o) { // TODO Auto-generated method
	 * stub return 0; }
	 */

	/*
	 * 나이 오름차순
	 * 
	 * @Override public int compareTo(Student o) {
	 * 
	 * return age - o.age; }
	 */

	/*
	 * 나이 내림차순
	 * 
	 * @Override public int compareTo(Student o) {
	 * 
	 * return o.age - age; }
	 */

	/*
	 * 이름 오름차순
	 * 
	 * @Override public int compareTo(Student o) {
	 * 
	 * return name.compareTo(o.name); }
	 */

	@Override
	public int compareTo(Student o) {
		int result = name.compareTo(o.name);
		return (result != 0) ? result : age - o.age;
	}

}
