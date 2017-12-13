package day7;

public class StudentTest2 {
	public static void main(String[] args) {
		/*
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student(); // 코드 중복 발생
		*/
		
		// Student[] s = new Student[5];
		
		Student s1= new Student();
		s1.name = "홍길동";
		s1.score = new int[]{88, 99, 50};
		
		Student[] s = {
				s1,
				new Student(),
				new Student(),
				new Student(),
				new Student()
				}; 	
		 s[4].name ="최씨";
		 s[4].score = new int[]{99,99,99};
		 
		 for(int i =0; i<s.length;i++){
			 s[i].process();
			 s[i].display();
			 
			 
		 }
		
	}

}
