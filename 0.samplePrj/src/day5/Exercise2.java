package day5;

public class Exercise2 {

	public static void main(String[] args) {

/* ����)arr �迭 �� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�  .

class Exercise2 { 
	public static void main(String[] args) { 
		int[] arr = {10, 20, 30, 40, 50}; 
		
		// TODO arr �迭 �� ��� ��� ���� ���ϴ� ���α׷��� �ϼ�
		
		System.out.println("sum="+sum);
	 } 
}
*/
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
			}
		System.out.println("sum="+sum);
		
		System.out.println("==========================================");
	
// Ǯ��
		
		int[] num = new int[5];
		num[0] = 2;
		num[1] = 22;
		num[2] = 23;
		num[3] = 27;
		num[4] = 29;
		
		int[] arr1 = {99, 66, 88, 55, 77};
		int sum1 = 0;
		
		/*
		sum= sum+arr[0];
		sum= sum+arr[1];
		sum= sum+arr[2];
		sum= sum+arr[3];
		sum= sum+arr[4]; //�ڵ� �ߺ� �߻�
		*/
		
		for(int i=0; i<=arr1.length-1;i++){
			sum1 = sum1 + arr1[i];
		}
		
		System.out.println(sum1);
		
		
		
		
	}

}
