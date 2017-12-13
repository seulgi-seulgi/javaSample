package book.ver03;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		
		BookMgr bm = null;
		bm = new BookMgr();
		bm.fileread("c://file/book.obj");
		Thread autosave = new Thread(bm.new AutoSave());
		autosave.start();
		
	
		Scanner scanner = new Scanner(System.in);

		int cmd = 0;
		while (true) {
			
			System.out.println("====================");
			System.out.println();
			System.out.println("도서 정보 프로그램");
			System.out.println("1. 도서목록보기");
			System.out.println("2. 도서 등록");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 데이터 저장 ");
			System.out.println("6. 자동저장 파일 로드 ");
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
				System.out.print("등록할 도서 isbn을 입력하세요");
				String isbn = scanner.nextLine();
				System.out.print("등록할 도서 제목을 입력하세요");
				title = scanner.nextLine();

				System.out.print("등록할 도서 가격을 입력하세요");
				int price = scanner.nextInt();
				scanner.nextLine();

				System.out.print("등록할 도서의 수를 입력하세요");
				int numOfBook = scanner.nextInt();
				scanner.nextLine();

				Book data1 = new Book(isbn, title, price, numOfBook);
				bm.addBook(data1);

				break;

			case 3:
				System.out.println("도서 검색 기능 수행합니다.");
				System.out.println("검색할 도서 제목을 입력하세요.");
				title = scanner.nextLine();
				bm.searchBookList(title);

				break;
				
			case 4:
				System.out.println("삭제작업 수행");
				System.out.println("삭제할 도서 제목을 입력하세요.");
				title = scanner.nextLine();
				bm.deleteBook(title);

				break;
				
			case 5:
				System.out.println("도서 목록을 파일에 저장합니다.");
				bm.filesave("c://file/book.obj");
				System.out.println("저장이 완료되었습니다.");
				
				break;
			case 6:
				System.out.println("자동 저장 파일을 Load 합니다.");
				bm.fileread("c://file/autosave.obj");
				
				break;
				
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