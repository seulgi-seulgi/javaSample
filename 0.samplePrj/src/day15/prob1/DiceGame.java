package day15.prob1;

public class DiceGame {

	//public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		
		try {
			//DiceGame game = new DiceGame();
			int result1 = game.countSameEye(10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
			int result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
		System.out.println("main END");
	}
	
	int countSameEye(int n) throws Exception {//인스턴스 메소드 <- 사용하려면 주소가 필요하다  8:DiceGame game = new DiceGame();	
		
		if(n<0){
			throw new Exception("게임 횟수는 음수 X");	// Exception은 Checked Exception. try, catch or 선언문에 throw Exception(누군가는 반드시 try catch로 받아야 한다)
												// main에는 throws Exception을 넣지 않는다. (catch할 영역이 없음)
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
			throw new Exception("0 이상의 숫자를 입력하세요.");
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
