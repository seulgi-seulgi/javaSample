//���ٽ� JDK1.7����
package day20;

public class Test05 {
	public static void main(String[] args) {
		//���ٽ� ������ �Լ� ���
		Command delete = ()->{
			System.out.println("delete ���� ~~~~");
		};
		
		Command update = ()-> System.out.println("update ���� ~~~~");	//1���� ��� {}���� ����
		Command insert = ()-> System.out.println("insert ���� ~~~~");
		Command select = ()-> System.out.println("select ���� ~~~~");
		
		delete.exec();
		update.exec();
		insert.exec();
		select.exec();
		select.print();
		
	}

}
@FunctionalInterface
interface Command {//�߻� �޼ҵ� 1�� = FunctionalInterface -> �Լ� ��� ����
                  //default�� ����
	void exec();
	default void print(){
		System.out.println("****************");
	}
}



//@FunctionalInterface �Ұ� -> �߻� �޼ҵ� 2�� �̻�
interface A {
	void go();
	void stop();
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("DeleteCommand ����");
	}
}

class InsertCommand implements Command {
	@Override
	public void exec() {
		System.out.println("InsertCommand ����");
	}
}

class UpdateCommand implements Command {
	@Override
	public void exec() {
		System.out.println("UpdateCommand ����");
	}
}

class SelectCommand implements Command {
	@Override
	public void exec() {
		System.out.println("SelectCommand ����");
	}
}