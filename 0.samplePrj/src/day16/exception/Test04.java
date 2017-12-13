package day16.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("sample2.txt");) {
			System.out.println("작업처리");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample2.txt 문서를 준비하세요");
		} catch (Exception e) {

		} finally {
			System.out.println("finally{} 수행");
		}

		System.out.println("=====================================");
		try (Scanner scanner = new Scanner(new File("sample2.txt"));) {
			// try(Account a = new Account("", 400);){ // try(implements
			// Closeable 인 경우만 사용 가능){}
			Account a = new Account("", -400);
		} catch (FileNotFoundException e) {
			System.out.println("sample2.txt 파일을 준비해주세요..");
		} catch (MoneyException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main END");

	}

}
