package day9;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setName("ȫ�浿");
		emp1.setSalary(50_000);
		emp1.setSsn("111-111");
		emp1.display();
		
		System.out.println(emp1.getSalary()*0.01);
		
		Employee emp2 = new Employee("��浿", 30000, "123456");
		emp2.display();
		
			

	}

}
