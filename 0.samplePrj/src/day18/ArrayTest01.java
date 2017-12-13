package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayTest01 {

	public static void main(String[] args) {
		/*
		 * Student s = null; //학생 1명의 정보 
		 * Student s1 = null; Student s2 = null;
		 * Student s3 = null; Student s4 = null;
		 */

		Student[] s = new Student[100]; // 내부적으로 count 변수 필요. 적절한 관리를 위한 API를
										// 만들어야 한다.
		s[0] = new Student();

		ArrayList<Student> list = new ArrayList<Student>(); // Student 타입으로 10개의
		//List<Student> list = new ArrayList<Student>(); // 모든 객체의 데이터 타입은 부모가 될 수 있다.
		//List<Student> list = new Vector<Student>(); 
		
		
		// 등록
		list.add(new Student("길동이", 90, 99));
		list.add(new Student("김씨", 90, 99)); // 중복 허용
		list.add(new Student("고씨", 90, 99)); // 구분할 수 있는 데이터가 있는 것이 좋다. 예)학번 등
		list.add(new Student("박씨", 90, 99));

		System.out.println(list);

		/*
		 * list.remove(0); //0번째 데이터 삭제 System.out.println(list);
		 * //list.remove(new Student("길동이",90,99)); //remove X
		 * <-list.remove(Object o) 주소필요 System.out.println(list);
		 * list.remove(list.get(2)); System.out.println(list);
		 */

		//
		int delindex = -1;
		for (int i = 0; i < list.size(); i++) {
			Student data=list.get(i);
			// data.avg();
			// list.remove(i);
			// System.out.println(list.size());
			if (data.name.equals("길동이")) {
				delindex = i;
			}
		}
		// list.remove(delindex);
		
		System.out.println(list);
		System.out.println("=====================");
		for (Student data : list) {
			System.out.println(data);
			 data.avg();
			// list.remove(data);
		}
		System.out.println(list);

		Iterator<Student> it = list.iterator();

		while (it.hasNext()) {
			Student data = it.next();
			if (data.name.equals("길동이")) {
				it.remove();
			}
		}
		//System.out.println(list);
		System.out.println(list.contains(new Student("고씨", 90, 99)));	//false
		
		//Arrays.sort(temp);	//배열 sort
		//Student[] temp = (Student[])list.toArray();	//ClassCastException
		
		//Collections.sort(list);
		
		Student[] temp2 = new Student[list.size()];
		list.toArray(temp2);
		Arrays.sort(temp2);
		System.out.println("sort확인");
		System.out.println(Arrays.toString(temp2));
		System.out.println(list);
		
		for(Student data:list){
			System.out.println(data);
			System.out.println("----------------");
			
		}
	}

}

class Student implements Comparable<Student> {
	String name;
	int ko;
	int math;
	//double avg;
	int avg;
	
	public Student() {
	}

	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}

	public void avg() {
		//avg = (ko + math) / 2.;
		avg = (ko + math) / 2;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
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
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
		//return avg - o.avg;
		}

	
	
	
	
}
