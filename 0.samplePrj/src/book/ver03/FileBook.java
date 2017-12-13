//파일의 저장, 파일 내용 읽기

package book.ver03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class FileBook {

	// fileName의 파일을 읽어서 Object로 리턴
	public synchronized Object read(String fileName) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		Object obj = null; // 리턴할 데이터

		try {
			fis = new FileInputStream(fileName);
			if (fis.available() != 0) {
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);

				obj = ois.readObject();
				System.out.println("file Load 완료 되었습니다.");
			}

		} catch (FileNotFoundException e) {
			System.out.println("도서의 등록 및 저장이 필요합니다.");
			System.err.println(e.getMessage());

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (ois != null) {
					ois.close();
					ois = null;
				}
				if (bis != null) {
					bis.close();
					bis = null;
				}
				if (fis != null) {
					fis.close();
					fis = null;
				}

			} catch (IOException e) {
				System.err.println(e.getMessage());

			}

		}
		if (obj == null) {
			obj = new HashMap<String, Book>();
		}
		return obj;
	}

	public synchronized void save(Object obj, String fileName) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(fileName);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(obj);
			oos.flush();

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (oos != null) {
					oos.close();
					oos = null;
				}
				if (bos != null) {
					bos.close();
					bos = null;
				}
				if (fos != null) {
					fos.close();
					fos = null;
				}

			} catch (IOException e) {
				System.err.println(e.getMessage());

			}

		}

	}

}
