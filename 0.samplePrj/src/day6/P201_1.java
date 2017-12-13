package day6;

import java.util.Arrays;

public class P201_1 {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("�迭�� ����� ���� �Ķ���ͷ� �Է��� �ּ���~~");
			return;
		}
		int[] num = new int[Integer.parseInt(args[0])];
		//1~45 ���� �̿� �ʱ�ȭ
		for(int i = 0 ; i<= num.length-1;i++){
			num[i] = (int)(Math.random()*45)+1;
		}
		int[] target = new int[num.length];
		System.arraycopy(num, 0, target, 0, num.length);
		
		//����
		for(int i = 0 ; i < num.length-1;i++){
			for(int j = i+1 ; j < num.length;j++){
               if(num[i] > num[j]){
            	   int tmp = num[i];
            	   num[i] = num[j];
            	   num[j] = tmp;
               }
			}
		}
        System.out.println("��  ��:"+Arrays.toString(target));
        System.out.println("������:"+Arrays.toString(num));
	}
}
