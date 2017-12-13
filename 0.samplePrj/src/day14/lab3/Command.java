package day14.lab3;

public interface Command {
	void exec();
	//void newMethod0();	// 새로운 메소드 추가하면 기존 class에 오버라이드 필요
	default void newMethod(){	// default 메소드 <- 에러없이 기능 추가할 수 있는 방법. 구현부 有. 오버라이드 가능
		System.out.println("~~~~~~~");
	};
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("삭제 기능 수행 ~~~");
	}
	@Override
	public void newMethod() {
		//Command.super.newMethod();
		System.out.println("+++++++++++++++++");
	}
}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("등록 기능 수행 ~~~");
	}
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("수정 기능 수행 ~~~");
	}
}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("목록 보기 기능 수행 ~~~");
	}
}
