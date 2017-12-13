package copy.book.ver01;

public class Book {

	private String title;
	private int price;
	private int sales = 0;
	private int num = 0;
		
	public Book() {

	}

	public Book(String title, int price) {
		// this.title(title);
		// this.price(price);
		setTitle(title); // =this.setTitle(title)
		setPrice(price);

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
		if (price < 0) { // 유효성 검증
			return;
		}
		this.price = price;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales += sales;
	}

	public void display() {
		System.out.printf("Book %03d | %-12s | %d원  (%3d)|%n", num, title, price, sales);
	}

	public void display1() {
		System.out.printf("Book %03d [%s : %d원] -> ", num, title, price);
	}
	
	@Override
	public String toString() {
		// return super.toString();
		StringBuilder sb = new StringBuilder("");
		sb.append("Book[");
		sb.append(title);
		sb.append(", ");
		sb.append(price);
		sb.append("]");
		return sb.toString();
		
	}
	
}
