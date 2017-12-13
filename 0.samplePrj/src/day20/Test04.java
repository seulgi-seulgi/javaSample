package day20;

import java.util.HashMap;
import java.util.Map;

public class Test04 {
	public static void main(String[] args) {

		// Command delete = new Command(){};
		// Command를 implements한 이름없는 class를 선언 및 생성
		// 'new'와 'Command' 사이에 이름과 implements가 생략되어 있음. 

		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~ delete 수행");
			}
		}; // 추상 exec(){}를 override

		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~ update 수행");
			}
		};

		Command select = new Command() {
			public void exec() {
				System.out.println("~~~ select 수행");
			}
		};

		Command insert = new Command() {
			public void exec() {
				System.out.println("~~~ insert 수행");
			}
		};
		
		insert.exec();
		delete.exec();
		select.exec();
		update.exec();
	}
		
}