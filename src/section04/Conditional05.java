package section04;

public class Conditional05 {
	public static void main(String[] args) {
		
		/*
		 * 환불 상태코드
		 * 	01: 환불 신청 중
		 * 	02: 환불 처리 중
		 * 	03: 환불 취소
		 * 	04: 계좌 이체 중
		 * 	05: 환불 완료 		 * 
		 * 	01, 02, 04 상태일 때 환불 불가
		 */
		
		String rtCD = "04";
		switch (rtCD) {
		case "01":
		case "02":
		case "04":	
			System.out.println("환불 불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드: " + rtCD);
		}
		
		if (rtCD == "01" || rtCD == "02" || rtCD == "04") {
			System.out.println("환불 불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드: " + rtCD);
		}
	}

}
