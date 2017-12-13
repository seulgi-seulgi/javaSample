package day8;

public class Student1 {
	
	String num;
	String name;
	int score;
	
	public Student1(){
		this("000", "OOO", 000);
	}
	
	public Student1(String num, String name, int score){
		
		this.num = num;
		this.name = name;
		this.score = score;
		
	}
	
	public void display(){
		System.out.println("======================");
		System.out.println("학번   이름   점수");
		System.out.printf("%s  %s  %d", num, name, score);
		System.out.println();
	}
	
}
