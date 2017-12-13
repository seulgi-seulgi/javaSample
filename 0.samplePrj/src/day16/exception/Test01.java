package day16.exception;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("main start");
		String name = null;
		if (name != null && name.length() > 0) // Unchecked Exception. try, catch���� if������ ��� ���� ����
			System.out.println(name.charAt(0));

		try {
			// Class.forName("Sample");	//Checked Exception. try, catch �ʿ�
			Class.forName("day16.exception.Sample");	// full path �ʿ�
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("Ŭ���� �̸� Ȯ�� �ʿ�");
		}

		// finally System.out.println(""); //try, catch ���� ��� �Ұ�
		System.out.println("main end");
	}

}

class Sample {

}