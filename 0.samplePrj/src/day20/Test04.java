package day20;

import java.util.HashMap;
import java.util.Map;

public class Test04 {
	public static void main(String[] args) {

		// Command delete = new Command(){};
		// Command�� implements�� �̸����� class�� ���� �� ����
		// 'new'�� 'Command' ���̿� �̸��� implements�� �����Ǿ� ����. 

		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~ delete ����");
			}
		}; // �߻� exec(){}�� override

		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~ update ����");
			}
		};

		Command select = new Command() {
			public void exec() {
				System.out.println("~~~ select ����");
			}
		};

		Command insert = new Command() {
			public void exec() {
				System.out.println("~~~ insert ����");
			}
		};
		
		insert.exec();
		delete.exec();
		select.exec();
		update.exec();
	}
		
}