package day15.exception;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("START");

		try {
			System.out.println("try{");
			System.out.println(args[0].length());
			int num = Integer.parseInt(args[0]); // ���� �߻� ���� ������ ���õȴ�.
			System.out.println(10 / num);
			System.out.println("}"); // �ڿ� �ݳ�X.
			// } catch (Exception e) { //�θ� Ÿ������ ���� �ʴ´�.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ �� ���� �迭 �ε��� ���");
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� �Է��� �ּ���");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("~~~~~~~~~~~~~~");
		} finally {
			System.out.println("�ڿ� �ݳ��� ���⿡ ~~~~~");
		}
		System.out.println("END"); // END�� ��� �� ���������ߴٴ� ��.

	}

}
