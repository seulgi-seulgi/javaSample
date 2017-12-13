package day12;

public abstract class Animal {	//�߻�Ŭ����

	private String kind = "������ ����";

	public Animal() {
		System.out.println(" Animal() ����");
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

	public abstract void breath();	//������(body)����

}
