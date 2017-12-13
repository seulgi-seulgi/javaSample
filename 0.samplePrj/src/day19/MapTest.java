package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>();	//sort기능 
		// map.put("java01", "1234");
		// map.put("java01", "3214");
		// System.out.println(map); //{java01=3214}
		// key값 중복불허. 마지막 입력으로 overwrite

		// map.put("java02", "3214");
		// System.out.println(map);//{java02=3214, java01=3214}
		// value값 중복 가능
		map.put("java01", "3214");
		map.put("java02", "1234");
		map.put("java03", "43214");
		map.put("java04", "113214");
		map.put("java05", "323214");
		map.put("java06", "321444");
		map.put("java07", "321664");
		map.put("java08", "335214");
		map.put("java09", "433214");
		map.put("java10", "1111");

		
		//System.out.println(map); System.out.println(map.get("java01"));
		//3214
		//key값을 알아야 value값 접근이 가능

		//System.out.println(map.keySet());
		//[java09, java08, java07, java06, java05, java04, java03, java02, java01, java10]
		//key값만 추출 //key 이름을
		//기반으로 Set구조를 만든다.
		//Set<String> keys = map.keySet();
		//Iterator<String> it = keys.iterator();
		//while(it.hasNext()){
		//String keyName = (String) it.next();
		//System.out.println("ID : "+keyName +" , pw : "+map.get(keyName)); 
		//}
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println(" 로그인 처리");
			System.out.print("ID : _");
			String id = scanner.nextLine();
			System.out.println("\nPW : _");
			String pw = scanner.nextLine();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					flag = false;
				} else {
					System.out.println("비밀번호를 다시 확인해 주세요.");
					System.out.println();
				}
			} else {
				System.out.println("id가 존재하지 않습니다.");
				System.out.println();
			}
		}
		System.out.println("------------ 서비스 목록 ------------");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()){
			String keyName = it.next();
			System.out.println("ID : "+keyName +" , pw : "+map.get(keyName)); 
		}
	}
}