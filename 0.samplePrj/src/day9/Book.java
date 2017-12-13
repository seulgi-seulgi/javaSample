package day9;

public class Book {

		private String title;
		private int price;
				
		public Book(){
		}
		
		public Book(String title){
			this.title = title;
		}
		
		public Book(String title, int price){
			this.title = title;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public void display(){
			System.out.printf("Book [서명 : %s, 가격 : %d원]%n",title,price);		
		}
}
