//배포, cmd 실행시 java -classpath jar명.jar 패키지명.클래스명
//압축풀기 예)jar -xvf book.jar
package copy.book.ver01;

public class BookTest {
	
	public static void main(String[] args){
		
		/*
		Book b1 = new Book();	// default 생성자 필요
		// b1.title = "java";	<-private 접근 불가
		// b1.price = -20000;
		
		b1.setTitle("java");
		b1.setPrice(-20000);	// 유효성 검증 필요
		b1.display();
		
		Book b2 = new Book("JSP", -2200);	// 매개변수 생성자 필요, 유효성 검증 필요
		b2.display();
		*/
		
		
		//BookMgr bm = new BookMgr();
		//bm.addBook(new Book("java programmng", 1000));
		//bm.addBook(new Book("java JSP", 2000));
		//bm.addBook(new Book("Spring", 4000));
		
		//bm.printBookList();
		//bm.printTitleList();
		
		Book[] data = {new Book("ASP", 800), new Book("PHP", 8800)};
		BookMgr bm = new BookMgr(data);
		bm.printBookList();
		System.out.println("=======================");
		
		bm.addBook(new Book("java programmng", 1000));
		bm.addBook(new Book("java JSP", 2000));
		bm.addBook(new Book("Spring", 4000));
		
		bm.printBookList();
		bm.printTotalPrice();
		System.out.println();
		System.out.println("=======================");
		System.out.println();
		bm.deleteBook("java programmng");
		bm.printBookList();
		bm.updatePrice(1.1);
		bm.display(1);
		bm.sellBook(2, 3);
		bm.display(2);
		bm.printBookList();
		
		
		
		
	}

}
