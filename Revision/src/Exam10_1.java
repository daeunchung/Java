//메서드와 오버로딩 예
public class Exam10_1 {
	void printString() {
		System.out.println("자바 프로그래밍");
	}
	void printString(int count) {
		int i;
		for(i=1;i<count;i++) {
			System.out.println("자바 프로그래밍");
		}
	}
	public static void main(String[] args) {
	Exam10_1 ex = new Exam10_1();
	ex.printString();
	ex.printString(3);
	}
}

//클래스 내에 위치하며 행위를 담당하는 프로그램 영역

//반환데이터형 메서드명(매개변수 리스트){
//변수 선언;
//문장;
//return 반환 값; 반환값이 없을 경우만 void기술하고 return문 생략 가능
//}
//메서드 오버로딩 : 메서드의 명칭이 동일하나 매개변수의 개수와 타입을 다르게 구현하는 것을 의미함
//메서드를 동일한 이름으로 여러개 정의가능하며 반환타입은 다를 수 있다
//메서드의 매개변수 개수가 다르거나 , 개수가 동일하나 데이터형이 다를때
//메서드의 명칭은 동일하나 접근 제한자(public같은거) 나 반환데이터형만 다른 경우는 오버로딩 X 컴파일에러O