package section12.access1;

public interface Cat {

	public static final int PAW = 4; // 인터페이스의 변수는 static 상수임 = public int PAW = 4;	
	public abstract void eat(); // 추상 메서드
	public void sleep(); //interface 안에 있으면 abstract 생략 가능
	public void hunt ();

}
