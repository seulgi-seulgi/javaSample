package day20.prob1;

import java.util.Vector;

public class Prob1 {
	Vector<String>  moveToVector(String datas[]){
		if(datas==null||datas.length==0){
			System.out.println("처리할 데이터가 필요합니다.");
			return null;
		}
		Vector<String> data = new Vector<>();
		for(int i=datas.length-1; i>=0;i--){
			data.add(datas[i]);
		}
		return data;
	}
	
	public static void main(String[] args){
		Prob1 p = new Prob1();
		String[] d = {"1","2", "3","4","5"};
		//Vector<String> list = p.moveToVector(null);
		//d=null;
		//d = {};
		Vector<String> list = p.moveToVector(null);
		System.out.println(list);
		
		
	}
}
