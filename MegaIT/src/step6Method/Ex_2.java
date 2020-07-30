package step6Method;

class Number {
	int x;
	
	void setX(int num) {
		/*
		 * 1. 메서드 호출 시 this라는 변수가 자동 생성된다.
		 * 2. 이 변수는 호출하는 이의 주소가 저장되낟.
		 * 예) main의 n변수가 setX()라는 메서드를 호출 했기 때문에,
		 *    setX() 메서드에서 자동 생성된 this는 n의 주소가 저장된 것이다.
		 * 3. 클래스 변수를 사용할 때에는 그 변수앞에 this. 생략되어있어
		 *    setX() 메서드의 영역과(stack) 클래스변수(heap)가 서로 영역이 달라도 접근이 가능했던 것이다.
		 */
		System.out.println("this = " + this);
		/* this. */x = num;
	}
}

public class Ex_2 {
	public static void main(String[] args) {
		
		Number n = new Number();
		System.out.println("n = " + n); // n값이 주소
		n.setX(100);
		
		System.out.println(n.x);
		
		
	}
}
