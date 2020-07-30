package step1;

/*
 * 4. 논리 연산자
 * 
 * 1. 종류
 * 1) &&(and) : 양쪽 모두 참이어야, 참 
 * 2) ||(or) : 어느 한쪽이라도 참이면, 참
 * 
 * 2. 역할
 * 1) 논리 연산자를 통해 여러개의 비교연산자를 연결할 수 있다.
 * 2) 논리 연산자를 통해 범위 설정이 가능하다. 
 */

public class Ex04_3 {

	public static void main(String[] args) {

		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println();
		
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);
		//왜 워닝 뜨는지? : 너무 당연한거라서 신경안써도됌
		

	}

}
