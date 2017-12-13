package copy.book.ver01;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Book[] data = { new Book("Servlet", 500), new Book("자바프로그래밍", 900), new Book("SQL", 700) };
		BookMgr bm = new BookMgr(data);

		Scanner scanner = new Scanner(System.in);
		int cmd = 0;
		int input=0;
		while (true) {
			System.out.println("====================");
			System.out.println("도서 정보 프로그램");
			System.out.println("1. 도서목록보기");
			System.out.println("2. 도서 등록");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색");
			System.out.println("5. 도서 정보 수정");
			System.out.println("6. 도서 판매 입력");
			System.out.println("7. 프로그램 종료");
			System.out.println("====================");
			System.out.println("원하는 명령을 입력하세요_");

			cmd = Integer.parseInt(scanner.nextLine().trim());
			String title;
			switch (cmd) {
			case 1:

				bm.printBookList();
				break;

			case 2:
				System.out.print("등록할 도서 제목을 입력하세요");
				title = scanner.nextLine();

				System.out.print("등록할 도서 가격을 입력하세요");
				int price = scanner.nextInt();
				scanner.nextLine();
				/*
				 * System.out.println("등록을 진행할까요?"); System.out.println("1. 예");
				 * System.out.println("2. 아니오");
				 */
				Book data1 = new Book(title, price);
				bm.addBook(data1);

				break;

			case 3:
				System.out.println("삭제작업 수행");
				System.out.println("삭제할 도서 제목을 입력하세요.");
				title = scanner.nextLine();
				bm.delete(title);
				break;

			case 4:
				System.out.println("도서 검색 기능 수행합니다.");
				System.out.println("검색할 도서 제목을 입력하세요.");
				title = scanner.nextLine();
				bm.searchBookList(title);

				break;

			case 5:
				System.out.println("도서 정보 수정 기능을 수행합니다.");
				System.out.println("원하는 명령을 입력하세요.");
				System.out.println("1. 도서 제목 변경");
				System.out.println("2. 도서 가격 변경");
				System.out.println("3. 도서 가격 일괄 변경");
				input = Integer.parseInt(scanner.nextLine().trim());
				switch (input) {
				case 1:
					System.out.println("도서 제목 변경 기능을 수행합니다.");
					System.out.println("수정할 도서의 제목을 입력하세요.");
					title = scanner.nextLine();
					String newTitle;
					System.out.println("도서의 ?? 제목을 입력하세요.");
					newTitle = scanner.nextLine();
					bm.updateTitle(title, newTitle);
					return;

				case 2:
					System.out.println("도서 가격 변경 기능을 수행합니다.");
					System.out.println("수정할 도서의 제목을 입력하세요.");
					title = scanner.nextLine();
					System.out.println("도서의 ??가격을 입력하세요.");
					cmd = Integer.parseInt(scanner.nextLine().trim());
					bm.updatePrice(title, cmd);
					break;
					
				case 3 : 
					System.out.println("도서 가격 일괄 변경 기능을 수행합니다.");
					System.out.println("도서 가격 변경 rate를 입력하세요.");
					double rate;
					rate = Double.parseDouble(scanner.nextLine());
					bm.updatePrice(rate);
					break;
					
				default:
					System.out.println("다시 선택해주세요");
					break;
				}

			case 6:
				int sales;
				System.out.println("도서 판매 기능을 수행합니다.");
				System.out.println("원하는 명령을 입력하세요.");
				System.out.println("1. 관리번호로 판매 입력");
				System.out.println("2. 도서 제목으로 판매 입력");
				input = Integer.parseInt(scanner.nextLine().trim());
				switch (input) {
				case 1:
				System.out.println("도서의 관리번호를 입력하세요.");
				cmd = Integer.parseInt(scanner.nextLine());
				System.out.println("판매 수량을 입력하세요.");
				sales = Integer.parseInt(scanner.nextLine());
				bm.sellBook(cmd, sales);
				break;
				
				case 2:
				System.out.println("도서의 제목을 입력하세요.");
				title = scanner.nextLine();
				System.out.println("판매 수량을 입력하세요.");
				sales = Integer.parseInt(scanner.nextLine());
				bm.sellBook(title, sales);
				break;
				}

			case 7:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				// break;

			default:
				System.out.println("다시 선택해주세요");
				break;
			}
		}

	}

}
// 추가, 삭제, 검색, 업데이트 는 기본 기능
