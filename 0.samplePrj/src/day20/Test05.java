//람다식 JDK1.7부터
package day20;

public class Test05 {
	public static void main(String[] args) {
		//람다식 변수에 함수 등록
		Command delete = ()->{
			System.out.println("delete 수행 ~~~~");
		};
		
		Command update = ()-> System.out.println("update 수행 ~~~~");	//1줄일 경우 {}생략 가능
		Command insert = ()-> System.out.println("insert 수행 ~~~~");
		Command select = ()-> System.out.println("select 수행 ~~~~");
		
		delete.exec();
		update.exec();
		insert.exec();
		select.exec();
		select.print();
		
	}

}
@FunctionalInterface
interface Command {//추상 메소드 1개 = FunctionalInterface -> 함수 등록 가능
                  //default는 가능
	void exec();
	default void print(){
		System.out.println("****************");
	}
}



//@FunctionalInterface 불가 -> 추상 메소드 2개 이상
interface A {
	void go();
	void stop();
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
}

class InsertCommand implements Command {
	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
	}
}

class UpdateCommand implements Command {
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}
}

class SelectCommand implements Command {
	@Override
	public void exec() {
		System.out.println("SelectCommand 수행");
	}
}