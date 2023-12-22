package section19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//https://images.unsplash.com/photo-1512474932049-78ac69ede12c?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHx8fA%3D%3D
public class IO04 {

	public static void main(String[] args) {
		String fileUrl = "https://images.unsplash.com/photo-1512474932049-78ac69ede12c?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHx8fA%3D%3D";
		String savePath = "./upload/image1.jpg";
		
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
		try {
			URL url = new URL(fileUrl);
			
			bis = new BufferedInputStream(url.openStream());
			fos = new FileOutputStream(savePath);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
	
			while((readByteCnt = bis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
		
			System.out.println("File Downloaded");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) fos.close();
				if (bis != null) bis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
