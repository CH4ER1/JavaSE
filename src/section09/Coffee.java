package section09;

public class Coffee {

	public String bean;	//원두
	public int water;	//물의 양

	public Coffee() {
		this.bean = "콜롬비아";
		this.water = 30;		
		System.out.println("에스프레소");		
	}
	
	public Coffee(int water) {
		
		this();		//자기자신 생성자, 위에 있는 코드 재사용
		this.water += water;	
		System.out.println("아메리카노");
	}
	
	public Coffee (String bean) {
		
		this.bean = bean;
		this.water = 30;
		System.out.println(bean + " 에스프레소");
	}
	
	public Coffee(String bean, int water) {
		
		this(bean);
		this.water += water;		
		System.out.println(bean + " 아메리카노");
	}
	
	public void printInfo() {
		
		System.out.println("bean: " + bean);
		System.out.println("water: " + water);
		
	}
	
}
