package day12;

public abstract class Animal {	//추상클래스

	private String kind = "동물의 종류";

	public Animal() {
		System.out.println(" Animal() 수행");
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public abstract void breath();	//구현부(body)없음

}
