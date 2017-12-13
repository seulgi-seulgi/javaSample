//ArrayList 활용
package copy.book.ver02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	private List<Book> bookList = new ArrayList<Book>();

	public BookMgr() throws FileNotFoundException {
		String fileName = "c:/file/sample1.txt";
		Scanner s = new Scanner(new File(fileName));
		while (s.hasNextLine()) {
			String readLine = s.nextLine();
			String[] data = readLine.split("/");
			bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
		}
		
		/*
		try (Scanner s = new Scanner(new File(fileName))) {
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}*/
		
	}

	public BookMgr(Book[] data) {
		for(int i = 0; i<data.length; i++){
			bookList.add(data[i]);
		}
	
	}

	public void addBook(Book[] data) {
	}

	public void addBook(Book data) {
		bookList.add(data);
	}

	public void deleteBook(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if (book.getTitle().equals(title)) {
				System.out.println("삭제 도서 정보 : " + book);
				it.remove();
			}
		}
	}

	public void printBookList() {
		for (int i = 0; i < bookList.size(); i++)
			bookList.get(i).display();
	}

	public void printTitleList() {
		for (int i = 0; i < bookList.size(); i++)
			System.out.println(bookList.get(i).getTitle());
	}

	public void printTotalPrice() {
		for (int i = 0; i < bookList.size(); i++)
			System.out.println(bookList.get(i).getPrice());
	}

	// 검색 기능
	public void searchBookList(String title) {
		int c = 0;
		for (Book data : bookList) {
			if (data.getTitle().equals(title)) {
				data.display();
				c++;
			}
			
			}
		if (c == 0) {
			System.out.println("요청한 도서가 없습니다.");
		}
	}
	/*
	// 업데이트 기능
	public void updateTitle(String title, String newTitle) {

		System.out.println("변경 전 : " + bookList.get(i));

		System.out.println("변경 후 : " + bookList.get(i));
	}else

	{
		System.out.println("수정할 도서가 없습니다.");
	}
	}

	public void updatePrice(String title, int newPrice) {

	}
	*/
	@Override
	public String toString() {
		return "BookMgr [bookList=" + bookList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookList == null) ? 0 : bookList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookMgr other = (BookMgr) obj;
		if (bookList == null) {
			if (other.bookList != null)
				return false;
		} else if (!bookList.equals(other.bookList))
			return false;
		return true;
	}

}
