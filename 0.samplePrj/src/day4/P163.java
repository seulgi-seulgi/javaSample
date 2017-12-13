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
		
		// 풀이
	
		// OUT: for(int i=1;i<=9;i++){
			for(int i=1;i<=9;i++){
			for(int j=2; j<=9; j++){
				//	if(j==5) break;	// 나를 포함한 블럭을 빠져 나갈 때
				//	if(j==5) break OUT; // OUT for 반복문을 벗어난다(특정 가능)
				//	if(j==5) continue;	// 바로 재진입
								
				System.out.printf("%d*%d=%2d | ", j, i, j*i);
				
			}
				System.out.println();
			}
		
		
		
		}
		
	}
	
	