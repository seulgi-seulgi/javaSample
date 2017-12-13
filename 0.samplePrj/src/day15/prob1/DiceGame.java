package day15.prob1;

public class DiceGame {

	//public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		
		try {
			//DiceGame game = new DiceGame();
			int result1 = game.countSameEye(10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);
			int result2 = game.countSameEye(-10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
		System.out.println("main END");
	}
	
	int countSameEye(int n) throws Exception {//�ν��Ͻ� �޼ҵ� <- ����Ϸ��� �ּҰ� �ʿ��ϴ�  8:DiceGame game = new DiceGame();	
		
		if(n<0){
			throw new Exception("���� Ƚ���� ���� X");	// Exception�� Checked Exception. try, catch or ���𹮿� throw Exception(�������� �ݵ�� try catch�� �޾ƾ� �Ѵ�)
												// main���� throws Exception�� ���� �ʴ´�. (catch�� ������ ����)
		}	
		
		int count = 0;
		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		
		for(int i = 0;i<n;i++){
			if(dice1.play() == dice2.play()) count++;
		}
		return count ;
		
		/*
		for(int i = 0; i<n ; i++){
		if(n<0){
			throw new Exception("0 �̻��� ���ڸ� �Է��ϼ���.");
		}
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		int count = 0;

		for (int i = 0; i < n; i++) {
			int p1 = d1.play();
			int p2 = d2.play();

			if (p1 == p2)
				count++;
		}
		return count;
		*/
	}

}

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}

}
