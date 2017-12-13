package util1;
/* Account 클래스
    계좌번호  , 잔고  , 입금 , 출금, 계좌이체, 통장정보출력
**** 제출방법  이름폴더에 자바파일 넣어 주세요 **************8
*/

public class Account_yiseulgi {
	
	String name;
	String num;
	int sum;
	int m;
	
	public Account_yiseulgi(){
		this("홍길동","0123-456-789", 0);
	}
	
	public Account_yiseulgi(String name, String num, int sum){
		this.name = name;
		this.num = num;
		this.sum = sum;
		}
	
	
	
	public void display(){
		System.out.println("===통장정보출력===");
		System.out.printf("예금주 : %s%n", name);
		System.out.printf("계좌번호 : %s%n", num);
		System.out.printf("잔고 : %d%n", sum);
		System.out.println("===============");
	}
	
	public void deposit(int m){
		sum += m;
		
		System.out.printf("입금 : %d원%n", m);
		System.out.printf("잔고 : %d원%n", sum);
		
		
	}
	
	public void withdraw(int m){
		sum -= m;
		System.out.printf("출금 : %d원%n", m);
		System.out.printf("잔고 : %d원%n", sum);
	}
	
	public void transfer(String name1, int m){
		sum -= m;
		System.out.printf("이체처 : %s%n", name1);
		System.out.printf("이체금액 : %d원%n", m);
		System.out.printf("잔고 : %d원%n", sum);
		
	}
	
	}
