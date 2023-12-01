package section09;

class Movie {
	
	public String title; // 영화 제목
	public String genre; // 영화 장르
	public int runningTime; // 러닝 타임
	
	//생성자
	public Movie() {
		String title = "아무 영화"; // movie 문이 끝나면 자동으로 사라짐 (출력 X)
		this.title = "서울의 봄";
		this.genre = "드라마";
		this.runningTime = 141;
	}
//	public Movie (String title) {
//		
//	}
	
	
	public void printInfo() {
		
		System.out.println("title: " + title);
		System.out.println("genre: " + genre);
		System.out.println("runningTime: " + runningTime);		
		
	}
}
public class Constructor04 { // 한 파일 안에는 public class 하나만 존재
	
	public static void main(String[] args) {
		
		
		Movie movie1 = new Movie();
		movie1.printInfo();
		
		System.out.println("=======================");
		
		Movie movie2 = new Movie();
		movie2.title = "괴물";
		movie2.genre = "스릴러";
		movie2.runningTime = 126;
		movie2.printInfo();
	}

}
