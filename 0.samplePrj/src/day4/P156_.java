package day4;

import java.util.Scanner;

public class P156_ {

	public static void main(String[] args) {

		String command;
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("********  명령선택  ********");
			System.out.println("");
			System.out.println("1. insert(등록)\n");
			System.out.println("2. delete(삭제)\n");
			System.out.println("3. update(수정)\n");
			System.out.println("4. quit(종료)\n");
			System.out.println("************************\n\n");
			System.out.println("수행할 명령을 선택하세요! ");
			System.out.print("1 2 3 4 중 하나를 선택하세요.. _ ");

			command = scanner.nextLine();

			switch (command) {

			case "1":
				System.out.println("등록 작업을 수행 합니다.");
				break;

			case "2":
				System.out.println("삭제 작업을 수행 합니다.");
				break;

			case "3":
				System.out.println("수정 작업을 수행 합니다.");
				break;

			case "4":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("1 2 3 4 중 하나를 선택하세요.");
				System.out.println();
			}

		}
	}
}
