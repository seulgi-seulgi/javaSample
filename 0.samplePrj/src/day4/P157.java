package day4;

public class P157 {

	public static void main(String[] args) {

		/*
		int count = 0;
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);	// �ڵ� �ߺ� �߻�
		
		*/	
		
		for(int count=0; count<5; count++){
			
			System.out.println("Helo java  " + count);
		}

		System.out.println("���� �ҹ��� �ڵ尪 Ȯ��");
		for(char c='a'; c <= 'z' ; c++){
			System.out.println(c + " : " +(int)c);
			
		}
		
		//Ǯ��
		System.out.println("���� �ҹ��� �ڵ尪 Ȯ��");
		char a = 'a', d = 'A';
		int count;
		for(count=0; count<26;count++){
			System.out.println(a+" "+ (int)a++ +", "+ d+" "+(int)d++);
		}
		System.out.println(count);
		System.out.println(a);
		
	}

}
