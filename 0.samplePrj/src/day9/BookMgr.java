package day9;

public class BookMgr {
	Book[] booklist;
	
	int count = 0;

	public BookMgr() {
	}

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
		
	}

	public void addBook(Book book) {
		if (count > booklist.length) {
			System.out.println("���� ���� �ʰ�");
			return;
		}
		booklist[count++] = book;
	}

	public void printBookList() {

		System.out.println("=========== å ��� ===========");
		for (int i = 0; i < booklist.length ; i++) {
			System.out.printf("%4d. %s%n", i, booklist[i].getTitle());
		}
		System.out.println("============================");
		System.out.println();
	}

	public void printTotalPrice() {
		System.out.println("========= å ������ ���� =========");
		int sum = 0;
		for (int i = 0; i < booklist.length-1 ; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.printf("��ü å ������ �� : %d��", sum);
	}

}