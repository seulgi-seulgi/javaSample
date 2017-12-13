package day6;

import java.util.Arrays;

/*== Prob1 제출하세요 ==
public class P201 {~~}  예제의 num 배열의 데이터에서 발생 가능한 
중복 문제를 해결 하세요
*/

public class Prob1_yiseulgi {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("배열의 사이즈를 실행 파라미터로 입력해 주세요~~~~~");
			return;
		}

		int[] num = new int[Integer.parseInt(args[0])];
		// 1~45 난수 이용 초기화
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
		System.out.println("원본 num");
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
		System.out.println("원  본:" + Arrays.toString(target));
		System.out.println("정렬후:" + Arrays.toString(num));
	}
}
