package day12;

public class Test02 {

	public static void main(String[] args) {

		Animal a = new Dog();
		Animal f = new Fish();
		// new Animal(){} abstract Ŭ������ ��ü ���� �Ұ�. Ÿ���� ����
		
		// Animal[] animals = new Animal[5];	// Animal Ÿ������ 5���� ���� �����(O, �� Ÿ�Լ���). ��ü�������� �ٸ���
		
		Animal[] animals = {a,f};
		for(int i = 0; i<animals.length; i++){
			animals[i].breath();
			
		}
			
		
	}

}
