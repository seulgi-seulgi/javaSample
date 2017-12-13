package day5;

public class P206 {

	public static void main(String[] args) {

		int[] scors = { 99, 88, 78, 97, 100 };
		String[] names = { "홍길동", "고길동", "박길동", "최길동", "이길동" };

		for (int j = 0; j < names.length; j++) {
			System.out.printf("%s** %3d%n", names[j].charAt(0), scors[j]);
		}

		System.out.println("============================");

		// 풀이

		System.out.println(names[0].charAt(0) + "** " + scors[0]);
		System.out.println(names[1].charAt(0) + "** " + scors[1]);
		System.out.println(names[2].charAt(0) + "** " + scors[2]);
		System.out.println(names[3].charAt(0) + "** " + scors[3]);
		System.out.println(names[4].charAt(0) + "** " + scors[4]); // 코드 중복 발생

		System.out.println("============================");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i].charAt(0) + "** " + scors[i]);
		}

		System.out.println("============================");

		for (int data : scors) 
			System.out.println(data);
		}

		for (String data : names) {
			System.out.println(data);
		}
	}

}
