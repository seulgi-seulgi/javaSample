//�͸� Ŭ����

package day15.inner03;

public class Test01 {

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("select | delete | update | insert | select");
			System.out.println("�� �ϳ��� �Ķ���ͷ� �Է����ּ���.");
			return;
		}
		//Command delete = null;
		Command delete = new DeleteCommand();
		//delete.exec();
		
		//Command insert = null;
		Command insert = new Command(){
			//@Override
			public void exec(){
				System.out.println("��� �۾� ���� �մϴ�.");
			}
		};
		//insert.exec();
		
		Command update = new Command(){
			public void exec(){
				System.out.println("���� �۾� ���� �մϴ�.");
			}
		};
		//update.exec();
		
		Command select = new Command(){
			public void exec(){
				System.out.println("��� �Ѹ��� ����");
			}
		
		};
		//select.exec();
		
		Command search = new Command() {
			@Override
			public void exec() {
				System.out.println("�˻� ����");				
			}
		};
		//search.exec();
		
		/*
		if(args[0].equals("delete"))
			delete.exec();
		else if (args[0].equals("insert"))
			insert.exec();
		else if (args[0].equals("update"))
			update.exec();
		else if (args[0].equals("select"))
			select.exec();
		else if (args[0].equals("search"))
			search.exec();
		else System.out.println("~~~~");
		*/
		
		switch (args[0]){
		case "delete":
			delete.exec();
			break;
		case "select":
			select.exec();
			break;
		case "insert":
			insert.exec();
			break;
		case "update":
			update.exec();
		default:
			break;
		}
		}
	}


interface Command {
	void exec();
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("���� �۾� ���� ~~~~");
	}
	
	
}