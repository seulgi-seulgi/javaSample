package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("김", "001");
		
		Employee emp2 = emp1;
		
		//Set<Employee> set = new HashSet<Employee>();
		Set<Employee> set = new TreeSet<Employee>();
		System.out.println(set);	//[]. 데이터無
		
		set.add(emp1);
		set.add(emp2);
		System.out.println(set);	//[Employee [name=김, num=001]] <- 중복체크
		/*
		set.add(new Employee("고", "002"));
		set.add(new Employee("고", "002"));
		set.add(new Employee("고", "002"));
		//System.out.println(set);
		//[Employee [name=고, num=002], Employee [name=김, num=001], Employee [name=고, num=002], Employee [name=고, num=002]]
		//중복(주소값으로 중복체크) <-equals 메소드 override 필요
		//equals() override
		System.out.println(set);
		*/	
		//[Employee [name=고, num=002], Employee [name=김, num=001]]
		set.add(new Employee("고", "002"));
		set.add(new Employee("강", "009"));
		set.add(new Employee("홍", "005"));
		set.add(new Employee("박", "011"));
		set.add(new Employee("고", "022"));
		set.add(new Employee("고", "001"));
		set.add(new Employee("강", "003"));

		System.out.println(set);
		
		for(Employee data :set){
			System.out.println(data);
			System.out.println("--------");
		}
		
		Iterator<Employee>it = set.iterator();
		while(it.hasNext()){
			Employee data = it.next();
			System.out.println(data);		
		}
	}

}

class Employee implements Comparable<Employee> {
	
	String name;
	String num;
	
	public Employee() {
	}
	public Employee(String name, String num) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		if((num.compareTo(o.num))==0)
		return name.compareTo(o.name);
		return num.compareTo(o.num);
	}
	
	
	
	
	
}
