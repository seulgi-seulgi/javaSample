package day20;

import java.util.List;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		Student<String,Double> s1 = new Student("",6);
		Student<String,Integer> s2 = new Student("",3);
		
		List<String> l;	//String Ÿ���� �迭�� ����
		List<Integer> l2;	//Integer Ÿ���� �迭�� ����
		
		Map<String, Student> m;	//key�� StringŸ��, value�� StudentŸ��
		
		
		
		
		

	}

}

//class Student<T,V> {//<T,V>�� Object�� ��� ����. default�� Object.
class Student<T,V extends Number> {	//V�� Number�� ��ӹ��� ���̾�� �Ѵ�. <- ����ɱ�.		
	T name;	// Ÿ��?
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