package step5;
/*
 *  # 클래스
 *  1. 정의(설계도)
 *   1) class : 키워드
 *   2) Ex01 : 클래스명
 *   3) {} : 자료형의 영역 (기본 자료형을 조합해 생성)
 *  2. 선언
 *   1) 자료형 변수명 = new 자료형();
 *   2) Ex01 e = new Ex01();
 */

class Ex01{
	int x;
	int y;
}

public class Ex01_1 {
	public static void main(String[] args) {
		int a; // 정수
		String b; // 문자열
		int[] arr; // 배열(참조변수) : 주소만 저장 가능
		
		a = 10;
		b = "김철수";
		arr = new int[3];
		
		Ex01 e = new Ex01(); // 클래스 : 사용자 정의 자료형 (개발자가 직접 만듬)
		e.x = 10;
		e.y = 20;
		
		System.out.println(e); // step5.Ex01@15db9742
	}

}
