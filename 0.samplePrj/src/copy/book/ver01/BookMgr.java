package copy.book.ver01;

public class BookMgr {

	private int count = 0;
	private Book[] bookList = new Book[100];

	public BookMgr() {
	}

	public BookMgr(Book[] data) {
		System.arraycopy(data, 0, bookList, count, data.length);
		int i = count;
		for (int j = 0; j < data.length; j++) {
			bookList[i].setNum(i++ + 1);
		}
		count = count + data.length;
	}

	public void addBook(Book data) {
		if (count > bookList.length - 1) {
			Book[] temp = new Book[count + 100];
			System.arraycopy(bookList, 0, temp, 0, count);
			bookList = temp;
		}
		bookList[count] = data;
		bookList[count].setNum(count + 1);
		count++;
	}

	public void addBook(Book[] data) {
		for (int i = 0; i < data.length; i++) {
			if (count + data.length > bookList.length - 1) {
				Book[] temp = new Book[count + 100];
				System.arraycopy(bookList, 0, temp, 0, count);
				bookList = temp;
			}
			bookList[count] = data[i];
			bookList[count].setNum(count + 1);
			count++;

		}
	}

	public void deleteBook(String title) {
		Book[] temp = new Book[bookList.length];
		System.arraycopy(bookList, 0, temp, 0, count);
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				this.bookList[i] = null;
				System.arraycopy(temp, i + 1, bookList, i, count);
				this.bookList[count] = null;
				count--;
			}
		}
	}

	public void sellBook(int num, int sales) {
		for (int i = 0; i < count; i++) {
			if (bookList[i].getNum() == num) {
				bookList[i].setSales(sales);
			}
		}
	}

	public void sellBook(String title, int sales) {
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				bookList[i].setSales(sales);
			}
		}
	}

	public void display(int num) {
		System.out.printf("Book %03d [%s : %d원 (%d)]%n", bookList[num - 1].getNum(), bookList[num - 1].getTitle(),
				bookList[num - 1].getPrice(), bookList[num - 1].getSales());
	}

	public void printBookList() {
		
		System.out.println("         관리번호            서명                    가격    (판매량)");
		for (int i = 0; i < count; i++) {
			bookList[i].display();
		}
	}

	public void printTitleList() {
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.printf("책 가격의 총합 : %d원", sum);
	}

	// 검색 기능 추가
	public void searchBookList(String title) {
		int c = 0;
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				bookList[i].display();
				c++;
			}
		}
		if (c == 0) {
			System.out.println("요청한 도서가 없습니다.");
		}
	}

	public void searchNum(int num) {
		int c = 0;
		if (num <= 0) {
			System.out.println("도서 관리번호를 확인하세요");
			return;
		}
		for (int i = 0; i < count; i++) {
			if (bookList[i].getNum() == num) {
				bookList[i].display();
				c++;

			}
		}
		display(num);

	}

	// 삭제 기능 추가
	public void delete(String title) {
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				System.out.print("삭제합니다 : ");
				bookList[i].display();
				System.arraycopy(bookList, i + 1, bookList, i, count - i);
				count--;
			}
		}
	}

	// 업데이트 기능 추가
	public void updateTitle(String title, String newTitle) {
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				System.out.print("변경 전 : ");
				bookList[i].display();
				System.out.print("변경 후 : ");
				bookList[i].setTitle(newTitle);
				bookList[i].display();
			}
		}

	}

	public void updatePrice(String title, int price) {
		if (price >= 0) {
			for (int i = 0; i < count; i++) {
				if (bookList[i].getTitle().equals(title)) {
					System.out.print("변경 전 : ");
					bookList[i].display();
					System.out.print("변경 후 : ");
					bookList[i].setPrice(price);
					bookList[i].display();
				}
			}
		}
		System.out.println("0 이상의 값을 입력하세요");
		return;
	}

	public void updatePrice(double rate) {

		for (int i = 0; i < count; i++) {
			bookList[i].display1();
			bookList[i].setPrice((int) (bookList[i].getPrice() * rate));
			System.out.println(bookList[i].getPrice() + "원");
		}

	}

}
