package day14.lab3;

public interface Command {
	void exec();
	//void newMethod0();	// ���ο� �޼ҵ� �߰��ϸ� ���� class�� �������̵� �ʿ�
	default void newMethod(){	// default �޼ҵ� <- �������� ��� �߰��� �� �ִ� ���. ������ ��. �������̵� ����
		System.out.println("~~~~~~~");
	};
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("���� ��� ���� ~~~");
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
		System.out.println("��� ��� ���� ~~~");
	}
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("���� ��� ���� ~~~");
	}
}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("��� ���� ��� ���� ~~~");
	}
}
