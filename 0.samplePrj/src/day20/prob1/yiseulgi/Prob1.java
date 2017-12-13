package day20.prob1.yiseulgi;

import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) {

		String[] datas = { "1", "2", "3", "4", "5" };

		System.out.println(moveToVector(datas));

	}

	static Vector<String> moveToVector(String datas[]) {
		Vector<String> vector = new Vector<String>();
		for (int i = 0; i < datas.length; i++) {
			vector.add(i,datas[datas.length - 1 - i]);
		}
		return vector;
	}
}
