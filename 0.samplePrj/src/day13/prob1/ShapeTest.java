package day13.prob1;

public class ShapeTest {

	public static void main(String[] args) {
		/*
		 * Rectangle r1 = new Rectangle(5,6);
		 * RectTriangle r2 = new RectTriangle(6,2);
		 * Shape[] s= {r1, r2};
		 * 
		 * for(int i = 0; i<s.length ; i++){ System.out.println("area : " +
		 * s[i].getArea()); if(s[i] instanceof Resizable)
		 * ((Resizable)s[i]).resize(0.5); }
		 *
		 *
		 */
		
		//Ç®ÀÌ
		Shape[] shapes = { 
						new Rectangle(5, 6), 
						new RectTriangle(6, 2)
						};
		
		for(int i =0; i<shapes.length;i++){
			System.out.println("area : "+shapes[i].getArea());
			if(shapes[i] instanceof Resizable){
				((Resizable)shapes[i]).resize(0.5);
				System.out.println("new area : " + shapes[i].getArea());
		}

	}

}
}
