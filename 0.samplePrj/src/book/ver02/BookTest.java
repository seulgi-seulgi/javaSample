package book.ver02;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] data = {new Book("ASP", 800), new Book("PHP", 8800)};
		//Book book = new Book ("ȫ�浿", 500);	// default ������ �ʿ�
		//System.out.println(book);
		
		BookMgr bookList = new BookMgr(data);
		System.out.println(bookList);
		System.out.println();
		//bookList.addBook(book);
		System.out.println(bookList);
		bookList.printBookList();
			
		System.out.println();
		bookList.printTitleList();
		System.out.println();
		bookList.printTotalPrice();
		System.out.println();
		bookList.searchBookList("ASP");
		bookList.updateTitle("ASP", "�ڱ浿");
		System.out.println();
		
	}

}
