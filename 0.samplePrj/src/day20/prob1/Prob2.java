package day20.prob1;

import java.util.Vector;

import day12.Student;

public class Prob2 {

	Student s1;
	Vector<Integer> nums;
	
	public Prob2() {
		super();
	}
	
	public Prob2(Vector<Integer> nums) {
		this.nums = nums;
	}
	public Prob2(Student s1, Vector<Integer> nums) {
		this.s1 = s1;
		this.nums = nums;
	}

	public void print(){
		if(s1!=null){
			System.out.println(s1);
		}
		if(nums !=null){
			System.out.println(nums);
		}
		return;
	}

	@Override
	public String toString() {
		return "Prob2 [s1=" + s1 + ", nums=" + nums + "]";
	}
}

