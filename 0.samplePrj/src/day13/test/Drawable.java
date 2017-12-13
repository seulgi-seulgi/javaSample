package day13.test;

public interface Drawable {
	//public void draw(){};	//바디부 들어가면 에러
	//public abstract void draw();
	public void draw();	//abstract 생략 가능
	//int name;
	//일반 메소드  불가 -> 추상클래스와 차이점, 공통점 알기
}

interface Colorable{
	void drawColor();
}
