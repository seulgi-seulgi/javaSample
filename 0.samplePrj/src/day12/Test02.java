package day12;

public class Test02 {

	public static void main(String[] args) {

		Animal a = new Dog();
		Animal f = new Fish();
		// new Animal(){} abstract 클래스는 객체 생성 불가. 타입은 가능
		
		// Animal[] animals = new Animal[5];	// Animal 타입으로 5개의 방을 만들기(O, 즉 타입선언). 객체생성과는 다르다
		
		Animal[] animals = {a,f};
		for(int i = 0; i<animals.length; i++){
			animals[i].breath();
			
		}
			
		
	}

}
