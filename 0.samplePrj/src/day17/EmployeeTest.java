package day17;

public class EmployeeTest {

	public static void main(String[] args) {
		//Employee e = new Employee("", "", 44);
		//System.out.println(e);
		//Employee<String> e2 = new Employee();
		//Employee<String, String> e2 = new Employee();
		Employee<String> e2 = new Employee();
		//System.out.println(e2);
		e2.number = "2017";
		System.out.println(e2.number.charAt(e2.number.length()-1));	//7
		
		
		//Employee<int> e1 = new Employee();	//<int> �Ұ�
		//Employee<Integer> e1 = new Employee();
		//Employee<Integer, Integer> e1 = new Employee();
		Employee<Integer> e1 = new Employee();
		//System.out.println(e1);	//Employee [name=null, number=null, age=0] <-Integer�� ��ü�̹Ƿ� null�� ����
		//e1.number = "2015";	//String �Ұ�, Integer ����
		e1.number = 2015;
		
		
		Employee e3 = new Employee();	//Ÿ�Կ� ���ؼ� ������� ������ Object Ÿ�� <- ��� Ÿ���� �� �� �ִ�. �ٿ� ĳ������ �� �ʿ�
		//System.out.println(e3);
		e3.number = 2222;
		e3.number = "444";
		
	}

}

//class Employee<T> {	//T�� Ÿ�� ������ ��Ÿ�� �� <��ü�� ����> <int �Ұ�>
//class Employee<T,P> {
class Employee<T> implements Comparable<Employee<T>>{
	
	String name;
	T number;
	//int age;
	//P age;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public T getNumber() {
		return number;
	}
	
	public void setNumber(T number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}

	@Override
	public int compareTo(Employee<T> o) {
		
		return 0;
	}
	
	//@Override
	//public String toString() {
	//	return "Employee [name=" + name + ", number=" + number + ", age=" + age + "]";
	//}
	
	
	/*
	String name;
	String number;
	int age;
		
	
	public Employee(String name, String number, int age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", age=" + age + "]";
	}
	*/
	
	
	
}