package day16.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {

	public static void main(String[] args) {
		//String filename = args[0];
		String filename = "sample2.txt";
		
		try (Scanner scanner = new Scanner(new File(filename));) {
			//Scanner scanner = new Scanner(new File(filename));
			//System.out.println("¿Ã∏ß      √—¡°     ∆Ú±’");
			while(scanner.hasNextLine()){
				int sum = 0;
				String data = scanner.nextLine();
				String[] datas = data.split("/");						
				for(int i=1 ;i<datas.length ;i++){
					sum += Integer.parseInt(datas[i].trim());
					}
					//System.out.printf("%s   %3d   %4.2f%n", datas[0], sum, sum/3.0);
					System.out.printf("¿Ã∏ß : %s √—¡°: %3d ∆Ú±’ : %5.2f%n", datas[0], sum, sum/3.0);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			
		}
		System.out.println("*******************Main END*******************");
	}

}
