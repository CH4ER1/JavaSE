package section12;

import section12.access2.BluetoothMIC;
import section12.access2.Microphone;
import section12.access2.Speaker;
import section12.access2.TJmic;

public class InterfaceClass02 {
	
	public static void main(String[] args) {
		System.out.println("=== TJmic 객체 ===");
		TJmic tj = new TJmic();
		tj.connect();
		tj.music();
		tj.sing();

		System.out.println("===BluetoothMIC로 타입 변환===");
		BluetoothMIC bMic = tj;
		bMic.connect();
		bMic.music();
		bMic.sing();
		
		System.out.println("===Microphone으로 타입 변환===");
		Microphone mic = tj;
//		mic.connect(); //BluetoothMIC 에 선언된 메서드
//		mic.music(); //Speaker 에 선언된 메서드
		mic.sing();
		
		System.out.println("===Speaker로 타입 변환===");
		Speaker spk = tj;
//		spk.connect();
		spk.music();
//		spk.sing(); 
	
	}

}
