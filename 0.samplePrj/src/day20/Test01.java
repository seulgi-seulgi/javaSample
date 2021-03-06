package day20;

import java.util.List;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		Student<String,Double> s1 = new Student("",6);
		Student<String,Integer> s2 = new Student("",3);
		
		List<String> l;	//String 타입의 배열을 관리
		List<Integer> l2;	//Integer 타입의 배열을 관리
		
		Map<String, Student> m;	//key는 String타입, value는 Student타입
		
		
		
		
		

	}

}

//class Student<T,V> {//<T,V>에 Object는 모두 가능. default는 Object.
class Student<T,V extends Number> {	//V는 Number를 상속받은 것이어야 한다. <- 제약걸기.		
	T name;	// 타입?
	V avg;	// int? double?
	
	public Student() {
	}
	
	public Student(T name, V avg) {
		super();
		this.name = name;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	
	
	
	
	
}