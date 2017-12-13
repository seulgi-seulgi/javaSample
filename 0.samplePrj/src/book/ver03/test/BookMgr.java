//Map 활용
package book.ver03.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookMgr {
	private List<Book> bookList1 = new ArrayList<Book>();
	String fileName = "c://file/book.obj";
	private Map<String, Book> bookList = new HashMap<>();
		
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	ObjectInputStream ois = null;
	
	
	fis = new FileInputStream(fileName);
	bis = new BufferedInputStream(fis);
	ois = new ObjectInputStream(bis);
	

	/*
	
	public BookMgr() throws FileNotFoundException {
		
		String fileName = "c:/file/sample1.txt";
		Scanner s = new Scanner(new File(fileName));
		while (s.hasNextLine()) {
			String readLine = s.nextLine();
			String[] data = readLine.split("/");
			bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
		}
		
		
		try (Scanner s = new Scanner(new File(fileName))) {
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
		
	}
*/
	public BookMgr(Book[] data) {
		/*
		for(int i = 0; i<data.length; i++){
			bookList.add(data[i]);
		}*/
		
		List<Book> d = Arrays.asList(data);
		bookList.addAll(d);
	
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

