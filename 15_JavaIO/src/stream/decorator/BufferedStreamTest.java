package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("500.zip"); 
			FileOutputStream fos = new FileOutputStream("copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)
				) {
			millisecond = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����ϴ� �� " + millisecond + " milliseconds �ҿ�Ǿ����ϴ�.");
	}

}
