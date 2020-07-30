package step1;
/* # 변수의 명명규칙
 * 1. 숫자로 시작할 수 없다.
 * 2. 특수문자는 _, $만을 허용한다.
 * 3. 예약어(키워드)는 사용할 숭 ㅓㅄ다.
 * ex) public, class, static, void...
 * 4. 자바는 알파벳의 대소문자를 구분한다.
 * ---------------------------------
 * 1. 패키지명, 변수명은 소문자로 시작한다.
 * 2. 클래스명은 대문자로 시작한다.
 */

public class Ex03_3 {

	public static void main(String[] args) {

		int test = 1;
		int Test = 2;
		System.out.println(test);
		System.out.println(Test);
		
		int $money = 1000;
		int curPos = -1; // 현재위치(current position)
		
		// int 1num = 10;
        // int #test = 10;
        // int void = 20;

	}

}
