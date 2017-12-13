package book.ver02;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		
		Book[] data = { new Book("Servlet", 500), new Book("�ڹ����α׷���", 900), new Book("SQL", 700) };
	
		BookMgr bm = null;
		try {
			bm = new BookMgr();
		} catch(FileNotFoundException e){
			bm = new BookMgr(data);
		}		

		Scanner scanner = new Scanner(System.in);
		int cmd = 0;
		while (true) {
			System.out.println("====================");
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. ������Ϻ���");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻�");
			System.out.println("5. ���α׷� ����");
			System.out.println("====================");
			System.out.println("���ϴ� ����� �Է��ϼ���_");

			cmd = Integer.parseInt(scanner.nextLine().trim());
			String title;
			switch (cmd) {
			case 1:

				bm.printBookList();
				break;

			case 2:
				System.out.print("����� ���� ������ �Է��ϼ���");
				title = scanner.nextLine();

				System.out.print("����� ���� ������ �Է��ϼ���");
				int price = scanner.nextInt();
				scanner.nextLine();
				Book data1 = new Book(title, price);
				bm.addBook(data1);

				break;

			case 3:
				System.out.println("�����۾� ����");
				System.out.println("������ ���� ������ �Է��ϼ���.");
				title = scanner.nextLine();
				bm.deleteBook(title);
				break;

			case 4:
				System.out.println("���� �˻� ��� �����մϴ�.");
				System.out.println("�˻��� ���� ������ �Է��ϼ���.");
				title = scanner.nextLine();
				bm.searchBookList(title);

				break;

			case 5:
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