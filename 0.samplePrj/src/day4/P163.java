package day4;

public class P163 {
	
	public static void main(String[] args){
		
		/*
		for(int j=1;j<=9;j++){
			
			for(int i=2; i<=9; i++){

			System.out.printf("%d x %d = %d   ", i, i, i*j);
			}
			System.out.println();
			
		}
		
		}		
		*/
		
		// Ǯ��
	
		// OUT: for(int i=1;i<=9;i++){
			for(int i=1;i<=9;i++){
			for(int j=2; j<=9; j++){
				//	if(j==5) break;	// ���� ������ ���� ���� ���� ��
				//	if(j==5) break OUT; // OUT for �ݺ����� �����(Ư�� ����)
				//	if(j==5) continue;	// �ٷ� ������
								
				System.out.printf("%d*%d=%2d | ", j, i, j*i);
				
			}
				System.out.println();
			}
		
		
		
		}
		
	}
	
	