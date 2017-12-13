package util1;

import java.util.Arrays;

public class Array_yiseulgi {

	int[] a;

	public Array_yiseulgi() {
	}

	public Array_yiseulgi(int[] a) {
		this.a = a;
	}

	public static int[] sort(int[] a) {
		int[] arr = new int[a.length];
		System.arraycopy(a, 0, arr, 0, a.length);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(a));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println("원  본:" + Arrays.toString(a));
		System.out.println("정렬후:" + Arrays.toString(arr));
		return arr;
	}

}