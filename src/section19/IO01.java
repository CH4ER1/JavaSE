package section19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * I/O (Input / Output)
 * 	데이터를 읽고 쓰는 작업을 의미
 * 	자바에서는 java.io 패키지를 통해 i/o 프로그래밍함
 * 
 * File 클래스
 * 	경로 정보를 받아 파일 또는 디렉토리 정보를 객체화함
 * 
 */

public class IO01 {

	public static void main(String[] args) {
		File f = new File("C:\\"); // C:\\ -> C:\ (역슬래시 출력)
		
		// C 드라이브 하위에 있는 모든 디렉토리 및 파일 리스트 반환
		String[] list = f.list();
		
		// Calendar 날짜 객체 생성
		Calendar c = Calendar.getInstance();
		
		for (String temp : list) {
			
			// temp 값 명의 디렉토리 또는 파일 객체화
			File f2 = new File("C:\\", temp);
//			File f2 = new File(f, temp);
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환 (Time Stamp)
			long lastMod = f2.lastModified();
			
			// 파일 또는 디텍토리 마지막 수정 날짜 Calendar 객체로 변환
			c.setTimeInMillis(lastMod);
			
			// 파일 또는 디렉토리 마지막 수정 날짜 포맷 변환
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
			String lastModTime = sdf.format(c.getTime());
			
			//isDirectory() -> 디렉토리면 true값 반환
			if (f2.isDirectory()) {
				System.out.println(f2.getName() + "(Directory) - " + lastModTime);
			}
			
			if (f2.isFile()) {
				long fileSizeByte = f2.length();
				double fileSizeMB = (double) fileSizeByte / (1024 * 1024);
				String fileName = f2.getName();
				System.out.printf("%s (File) - %s (%.2fMB)\n", fileName, lastModTime, fileSizeMB);
			}
			
		}	
	}
}
