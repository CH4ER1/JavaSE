package section10;

import section10.access1.Car; //다른 패키지에 있는 클래스 사용 시 임포트 필수

/*
 * 접근 제한자 (Access Modifier)
 * 	자바에서 클래스, 변수, 메서드 등 접근 범위를 제어하는 데 사용되는 키워드
 * 		public - 모든 클래스에서 접근 가능, 상속 관계에서 접근 가능
 * 		protected - 같은 패키지 또는 상속 관계에서 접근 가능
 * 		default	- 같은 패키지에서 접근 가능
 * 		private - 본인 클래스 내에서 접근 가능
 * 
 * 패키지 (package)
 * 	관련된 클래스, 인터페이스 등 그룹화 하는 데 사용되는 디렉토리
 * 		-이름 충돌 방지: 같은 이름 클래스, 인터페이스를 달리하여 충돌 방지
 *		-코드 구조화: 관련된 클래스를 패키지 단위로 그룹화
 *		-접근 제어: 클래스나 멤버(변수, 메서드) 에 접근제한자를 적용하여 해당 패키지 외부에서 접근제한 가능
 * 
 * 임포트 (import) 
 * 	다른 패키지에 속한 클래스를 사용하기 위해 선언하는 키워드
 * 	단축키: Ctrl + Shift + O: 임포트 단축기 / 클래스 생성 시 Ctrl + Space 로 선택
 */


public class AccessModifier {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.model = "Tesla Y";
//		car1.color = "Red"; -> protected: 패키지가 달라서 접근 불가
//		car1.year = "2023"; -> default (접근제한자 없는 것) : 다른 패키지 접근 불가
//		car1.brand = "Tesla"; -> private: 본인 클래스 안에서만 접근 가능
		
		Game game1 = new Game();
		game1.title = "모여봐요 동물의 숲";
		game1.genre = "모험";
		game1.player = 1;
//		game1.console = "닌텐도"; -> private: 본인 클래스 안에서만 접근 가능
		
		
		
		
		
		
	}
}
