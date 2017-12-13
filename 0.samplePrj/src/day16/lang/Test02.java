package day16.lang;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args){
		int[] num = {77,8,99,34};
		int[] num2 = num.clone();
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		
		System.out.println(num);
		System.out.println(num2);
		
		String[] str1 = {"Hello", "World"}; 
		String[] str2 = str1.clone();
		
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		
		String[] name1 = {"홍길동", "박길동"};
		String[] name2 = name1.clone();
		name1[0] = "~~~~~~";	//복제본 데이터 변형X
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.toString(name2));
		
		//System.arraycopy는 사이즈를 마음대로 (clone과 차이점)
		
		
				
	}
}


