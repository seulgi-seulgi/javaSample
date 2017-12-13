package day12;

public class Student extends Object {

	private String name;
	private int age;
	private int id;

	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// return super.toString();
		// return "Student["+name+", "+age+", "+id+"]"; //성능 저하의 원인
		StringBuilder sb = new StringBuilder();
		sb.append("Student[");
		sb.append(name);
		sb.append(", ");
		sb.append(age);
		sb.append(", ");
		sb.append(id);
		sb.append("]");
		return sb.toString();

	}

	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * // return super.equals(obj); if (obj instanceof Student){ Student obj2=
	 * (Student)obj; return getName()==obj2.getName() && getAge()==
	 * obj2.getAge() && getId()==obj2.getId(); }else return false;
	 */

	// 풀이
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student))
			return false;
		Student data = (Student) obj;
		if (id == data.id && age == data.age && name.equals(data.name)) {
			return true;
		}
		return false;

	}
}
