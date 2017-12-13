package day20.prob1;

import java.util.Vector;

import day12.Student;

public class Prob2Test {
	public static void main(String[] args){
		Student s = new Student("ȫ", 24, 001);
		Vector<Integer> i = new Vector<>();
		
		Prob2 p = new Prob2(s,i);
		p.print();
		System.out.println(p);
	}
	

}
