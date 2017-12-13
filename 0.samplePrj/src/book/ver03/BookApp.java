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
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. ������Ϻ���");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� ����");
			System.out.println("5. ������ ���� ");
			System.out.println("6. �ڵ����� ���� �ε� ");
			System.out.println("7. ���α׷� ����");
			System.out.println("====================");
			System.out.println("���ϴ� ����� �Է��ϼ���_");

			cmd = Integer.parseInt(scanner.nextLine().trim());
			String title;
			switch (cmd) {
			case 1:

				bm.printBookList();
				break;

			case 2:
				System.out.print("����� ���� isbn�� �Է��ϼ���");
				String isbn = scanner.nextLine();
				System.out.print("����� ���� ������ �Է��ϼ���");
				title = scanner.nextLine();

				System.out.print("����� ���� ������ �Է��ϼ���");
				int price = scanner.nextInt();
				scanner.nextLine();

				System.out.print("����� ������ ���� �Է��ϼ���");
				int numOfBook = scanner.nextInt();
				scanner.nextLine();

				Book data1 = new Book(isbn, title, price, numOfBook);
				bm.addBook(data1);

				break;

			case 3:
				System.out.println("���� �˻� ��� �����մϴ�.");
				System.out.println("�˻��� ���� ������ �Է��ϼ���.");
				title = scanner.nextLine();
				bm.searchBookList(title);

				break;
				
			case 4:
				System.out.println("�����۾� ����");
				System.out.println("������ ���� ������ �Է��ϼ���.");
				title = scanner.nextLine();
				bm.deleteBook(title);

				break;
				
			case 5:
				System.out.println("���� ����� ���Ͽ� �����մϴ�.");
				bm.filesave("c://file/book.obj");
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				
				break;
			case 6:
				System.out.println("�ڵ� ���� ������ Load �մϴ�.");
				bm.fileread("c://file/autosave.obj");
				
				break;
				
			case 7:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				// break;

			default:
				System.out.println("�ٽ� �������ּ���");
				break;
			}
		}

	}

}