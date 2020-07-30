//toString()메서드 equals()메서드
//public String toString() 객체의 문자열을 반환
//public boolean equals(Object obj) 두 객체의  내용을 비교하여 
//두객체가 같으면 참,다르면 거짓을 반환 - 객체 타입을 매개변수로 받아
public class Exam17_1 {
	public static void main(String[] args) {
		Exam17_1 exam = new Exam17_1();
		System.out.println(exam.toString());
		//객체의 클래스명과 해쉬코드(고유문자열) 출력
		String str1 = new String();
		String str2 = new String();
		System.out.println(str1 == str2);
		String str3 = str1;
		System.out.println(str1 ==str3);
	}
}
//자바의 최상위클래스는 java.lang.Object클래스 - lang패키지안의 Object클래스
//자바의 모든 클래스는 Object클래스는 상속 (묵시적으로 extend키워드 생략)
//클래스객체명.toString() -> 클래스명과 해쉬코드의 조합이 출력

//클래스의 특성에 따라 다른 문자열을 출력하려면 toString메서드를 다음과 같이 오버라이딩하여 구현
//public String toString(){ --------}
