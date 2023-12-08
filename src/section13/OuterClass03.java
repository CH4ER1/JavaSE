package section13;

public class OuterClass03 {
	
	public static void main(String[] args) {
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		hp.printHello();
		
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		hp2.printHello();
		
		MyUtil.Calculator calc = new MyUtil.Calculator();
		calc.calc(10, 20); //static이 있는 클래스는 바로 생성 가능
		
	}

}
