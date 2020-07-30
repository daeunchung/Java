package chapter03;
/*
 * 
 * # 변수의 종류
 * 1. 자료형(data type)에 따른 분류
 * 1) 기본형 변수(primitive type)
 * . 정수형: byte(1), short(2), int(4), long(8)
 * . 실수형: float(4), double(8)
 * . 문자형 : char(2)
 * . 논리형 : boolean(1)
 * 
 * 2) 참조형 변수(reference type)
 * 
 * 2. 선언 위치에 따른 분류
 * 1) 클래스 영역
 * -> 자동 0으로 초기화
 * 
 * 	(1) static 변수(=클래스 변수)
 *   클래스명.변수명
 * 	(2) non-static 변수(=인스턴스 변수)
 *   클래스명 인스턴스 = new 클래스명();
 *   인스턴스명.변수명
 * 2) 메서드 영역
 * * 지역변수는 값이 자동초기화되지 않는다.
 * 때문에 선언과 동시에 초기화해줄 것을 권장한다.
 * 
 * 
 */
public class Ex03 {
	
	static int x;		// 클래스 변수 : 클래스명.변수명 으로 접근 가능
			int y;		// 인스턴스 변수 : 인스턴스명.변수명으로 접근해주세요

	public static void main(String[] args) {
		
		System.out.println(Ex03.x); //클래스명.변수명 으로 접근
		
				 // 객체(instance) : 괄호 오른쪽에 있는거 전부다 new부터 쭉
		Ex03 e = new Ex03();
		System.out.println(e.y); //객체 이름으로 접근
		System.out.println(new Ex03().y); // 이렇게 쓰지는 않지만 가능하다는걸 보여주기 ㅜ이해
		
		

		int num = 10; // 4byte
		// 자동 현변환
//		double d = num; // 8byte에 4byte짜리 대입하니 자동 형변환
		double d = (double)num;
		System.out.println(d);  // 10.0
		
		double a = 3.14;
		// 강제 형변환 (표기 필수)
		int x = (int)a; // 값 손실 발생
		System.out.println(x);
		
		
		}

}
