//Map 활용
//Thread 활용 autosave
package book.ver04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookMgr {

	private Map<String, Book> bookList = new HashMap<>();
	FileBook file = new FileBook();
	//String fileName = "c://file/book.obj";
	public BookMgr() {
		super();
	}

	public BookMgr(Map<String, Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public Map<String, Book> getBookList() {
		return bookList;
	}

	public void setBookList(Map<String, Book> bookList) {
		this.bookList = bookList;
	}

	public synchronized Map<String, Book> fileread(String fileName) {
		Object temp = file.read(fileName);
		if(temp instanceof Map)
			bookList = (Map<String, Book>) temp;
		return bookList;
	}

	public synchronized void filesave(String fileName) {
			file.save(bookList, fileName);
	}

	public BookMgr(Book[] data) {
		for (int i = 0; i < data.length; i++) {
			bookList.put(data[i].getIsbn(), data[i]);
		}

	}

	public void addBook(Book data) {
		bookList.put(data.getIsbn(), data);
	}

	
	
	public void deleteBook(String isbn) {
		Set<String> set = bookList.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();

			Book del = bookList.get(data);
			if (data.equals(isbn)) {
				bookList.remove(data);
				System.out.println("삭제 도서 정보 : " + del);
			}

		}
	}

	// 검색 기능
	public void searchBookList(String title) {
		int c = 0;
		Set<String> set = bookList.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			if (title.equals(bookList.get(data).getTitle())) {
				System.out.println(bookList.get(data));
				c++;
			}
		}
		if (c == 0) {
			System.out.println("요청한 도서가 없습니다.");
		}
	}

	public void printBookList() {
		Set<String> set = bookList.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(bookList.get(data));

		}
	}

	public void printTitleList() {

		Set<String> set = bookList.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(bookList.get(data).getTitle());

		}
	}

	public void printTotalPrice() {
		int sum = 0;
		Set<String> set = bookList.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			sum += bookList.get(data).getPrice();

		}
		System.out.println(sum);
	}

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

	class AutoSave implements Runnable {

		@Override
		public void run() {
			try {
				while (true) {
					Thread.sleep(5000);
					if (!bookList.isEmpty()){
						filesave("c://file/autosave.obj");
						//System.out.println("autosave");
					}
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());

			}
		}

	}
}
