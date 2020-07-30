/* FAIL
public class Test17_1 {
	String carName;
	public Test17_1(String str) {
		carName = str;
	}
}
	class Test17_11{
	public boolean equals(Object obj) {
	Test17_1 tmp = (Test17_1)obj; //입력으로 들어온 obj를 Car class로 캐스팅함
	if(carName.equals(tmp.carName))
		System.out.println("같다");
	else
		System.out.println("다르다");
	}
	
	public static void main(String[] args) {
	Test17_11 ee = new Test17_11();
	
	}
	}
*/


/*
equals메서드 사용시 num1==num2 처럼 기본 데이터형 값을 비교하는거처럼 쓰면 -> false
String클래스와 같은 객체의 내용에 대해서 비교할 경우 동일한 메모리에 할당외었는지 판단

String str1 = new String("자바");
String str2 = str1 ; //동일한 메모리에 생성된다 , 같은 메모리 사용
if(str1==str2) ----> true

String str1 = new String("자바");
String str2 = new String("자바");//둘은 문자열 동일하지만 메모리 위치 달라
if(str1.equals(str2)) //true 문자열내용을 비교하는걸로 인식
//str1의 객체에 equals메서드를 이용하고 메서드의 매개변수로 str2를 줬음 //"자바"문자열이 입력값으로 들어갔으니까


class Car{
String carName = "티코";
{
Car car1 = new Car();
Car car2 = new Car();
if(car1.equals(car2)) //두객체속의 문자열 내용을 같지만 두개의 클래스 객체가 다르므로 결과값 false
//이렇게 객체내용비교하려면 equals메서드를 오버라이딩해서 비교해야함


*/