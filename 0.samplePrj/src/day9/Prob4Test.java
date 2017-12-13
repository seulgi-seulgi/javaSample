package day9;

public class Prob4Test {

	public static void main(String[] args) {
		
		
		Book b1 = new Book("Java Program", 25_000);
		Book b2 = new Book("JSP Program", 35_000);
		Book b3 = new Book("SQL Fundamentals", 17_000);
		Book b4 = new Book("JDBC Program", 20_000);
		Book b5 = new Book("EJB Program", 15_000);
		
		b1.display();
		b2.display();
		b3.display();
		b4.display();
		b5.display();
		
		Book[] booklist = new Book[3];
		
		booklist[0] = b1;
		booklist[1] = b2;
		booklist[2] = b3;
		booklist[3] = b3;
		
		
		BookMgr list = new BookMgr(booklist);
		list.printBookList();
		list.printTotalPrice();
		
	}}