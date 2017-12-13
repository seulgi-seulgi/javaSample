package day6;

import java.util.Arrays;

/*== Prob1 �����ϼ��� ==
public class P201 {~~}  ������ num �迭�� �����Ϳ��� �߻� ������ 
�ߺ� ������ �ذ� �ϼ���
*/

public class Prob1_yiseulgi {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("�迭�� ����� ���� �Ķ���ͷ� �Է��� �ּ���~~~~~");
			return;
		}

		int[] num = new int[Integer.parseInt(args[0])];
		// 1~45 ���� �̿� �ʱ�ȭ
		num[0] = (int) (Math.random() * 45) + 1;
		loop2: for (int i = 1; i <= num.length - 1; i++) {
			num[i] = (int) (Math.random() * 45) + 1;

			for (int j = i - 1; j >= 0; j--) {
				if (num[i] == num[j]) {
					i--;
					continue loop2;
		}
			}
		}
		System.out.println("���� num");
		System.out.println(Arrays.toString(num));
		int[] target = new int[num.length];
		System.arraycopy(num, 0, target, 0, num.length);
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;

				}
			}
		}
		System.out.println("��  ��:" + Arrays.toString(target));
		System.out.println("������:" + Arrays.toString(num));
	}
}
