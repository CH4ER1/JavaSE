package section06;

public class Array02 {
	public static void main(String[] args) {
		
		//문자열 배열 객체 생성하기
		String[] pokemon = new String[6];
		
		// 배열 값 대입하기
		// 배열명 [인덱스 번호] = "값";
		pokemon[0] = "피카츄"; 
		pokemon[1] = "라이츄";
		pokemon[2] = "파이리";
		pokemon[3] = "꼬부기";
		pokemon[4] = "버터플";
		pokemon[5] = "야도란";
		
		//배열 값 가져오기
		System.out.println(pokemon[3]);
		
		//배열의 길이 값
		System.out.println(pokemon.length);
		
		//배열 for 문을 사용하여 전체 출력하기
		for (int i = 0; i < pokemon.length; i++) {
			System.out.println(pokemon[i]);
		}
	}

}
