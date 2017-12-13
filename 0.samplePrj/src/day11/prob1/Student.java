package day11.prob1;

public class Student extends Person {

	private int id;

	public Student() {
		super();
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(String name, int age, int id) {
		// super();
		// super.setName(name);
		// super.setAge(age);
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.printf("이   름 : %s    나 이 : %d    학     번 : %d%n", super.getName(), super.getAge(), id);
	}

}
