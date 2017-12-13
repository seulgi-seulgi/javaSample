package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {

		Map<String, Student> map = new HashMap<>();
		Student[] s = {
			new Student("2017009", "��", 90, 88),
			new Student("2017001", "��", 90, 88),
			new Student("2017011", "��", 90, 88),
			new Student("2017039", "ȫ", 91, 88),
			new Student("2017089", "��", 97, 88),
			new Student("2017089", "��", 99, 99)	//key�� �ߺ�����. ������ �Է����� overwrite
		};
		
		for(int i = 0; i<s.length ; i++){
			map.put(s[i].getNum(), s[i]);
		}
		
		Set<String> keys = map.keySet();
		//System.out.println(keys);
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String num = (String) it.next();
			map.get(num).avg();
			System.out.println(map.get(num));
		}
	}
}

class Student {
	String num;	//�й�. �ߺ�X
	String name;
	int ko, math, avg;

	public Student() {
		super();
	}

	public Student(String num, String name, int ko, int math) {
		super();
		this.num = num;
		this.name = name;
		this.ko = ko;
		this.math = math;
	}

	public String getNum() {
		return num;
	}
	
	public int avg() {
		avg = (ko+math)/2;
		return avg;
	}
	
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", avg=" + avg + "]";
	}

}