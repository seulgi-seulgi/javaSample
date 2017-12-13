package day6;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob2 {

	public static void main(String[] args) {
		String size = JOptionPane.showInputDialog("1~45 사이의 정수를 입력해 주세요!!");
		// System.out.println(size);
		int[] num = new int[Integer.parseInt(size)];

		num[0] = (int) (Math.random() * 45) + 1;

		T: for (int i = 1; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
					// continue T;
				}
			}
		
		}
		System.out.println(Arrays.toString(num));
	}

}
