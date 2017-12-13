package day6;

import java.util.Arrays;

public class P201 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("�迭�� ����� ���� �Ķ���ͷ� �Է��� �ּ���~~~~~");
			return;

		}

		int[] num = new int[Integer.parseInt(args[0])];
		// 1~45 ���� �̿� �ʱ�ȭ
		for (int i = 0; i <= num.length - 1; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
		}

		System.out.println("���� num");
		System.out.println(Arrays.toString(num));

		int[] target = new int[num.length];

		System.arraycopy(num, 0, target, 0, num.length);

		// ����
		/*
		 * int i; int j; int t; for (i = 0; i <= num.length - 2; i++) { for (j =
		 * 1; j <= num.length - 1; j++) { if (num[i] > num[j]) { t = num[i];
		 * num[i] = num[j]; num[j] = t; } } }
		 * System.out.println(Arrays.toString(num));
		 */

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;

				}

			}

		}

		System.out.println(Arrays.toString(target));
		System.out.println(Arrays.toString(num));
	}
}
