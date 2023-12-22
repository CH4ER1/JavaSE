package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상 클래스
 * 
 * FileInputStream
 * 	파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 	파일을 바이트 단위로 순차적으로 쓰는 객체
 * 
 */

public class IO03 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// FileInputStream - 해당 경로 파일을 읽을 준비 하기
			fis = new FileInputStream("./upload/hello.txt");
			
			// upload2 디렉토리 생성
			File f1 = new File("./upload2");
			if (f1.mkdir()) {
				System.out.println("upload2 디렉토리가 생성되었습니다");
		
			}
			// FileOutputStream - 해당 경로 파일을 쓸 준비 하기
			// 해당 파일이 없으면 자동 생성 (단, 디렉토리는 생성 X)

			fos = new FileOutputStream("./upload2/hello2.txt"); 	
			
			int readByteCnt = 0;
			byte[] b = new byte[1024]; //1024 byte 크기의 공간 생성
			
			/*
			 * (readByteCnt = fis.read(b)) != -1 
			 * readByteCnt = fis.read(b) -> 파일을 읽어서 byte 배열에 저장
			 * fis.read(b)가 더이상 읽을 데이터가 없을 경우 -1 반환
			 * 
			 */
			
			while ((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			System.out.println("파일 복사 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) fos.close();
				if (fis != null) fis.close();
				
			} catch (Exception e2) {
				
			}
		}
	
	}

}
