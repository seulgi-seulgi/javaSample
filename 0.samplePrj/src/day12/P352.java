package day12;

public class P352 {

	public static void main(String[] args) {

		//new SingleTone();
		//new SingleTone();
		//new SingleTone();
		//new SingleTone();
		//new SingleTone();
		
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		
	}

}


class SingleTone {
	
	private static SingleTone s = new SingleTone();
		
	private SingleTone(){
		System.out.println("SingleTone() »ý¼º");
	}
	
	public static SingleTone getInstance(){
		return s;
	}
	
}