//제네릭 클래스 예제
class GenClass<T>{//어떠한 데이터타입도 받아들일수 있다
	private T num;
	public void setNum(T val) {
		num = val;
	}
	public T getNum() {
		return num;
	}
}
public class Exam21_2 {
	public static void main(String[] args) {
		GenClass<Integer> gen1 = new GenClass<Integer>();
		gen1.setNum(100);
		System.out.println(gen1.getNum());
		GenClass<Double> gen2 = new GenClass<Double>();
		gen2.setNum(3.14);
		System.out.println(gen2.getNum());
		GenClass<String> gen3 = new GenClass<String>();
		gen3.setNum("강아지");
		System.out.println(gen3.getNum());
	}
}

/*
컬렉션이 Object형을 저장하는 이유 : 어떤 데이터형도 처리할 수 있도록 하기위함
-> 단점 : 여러데이터들이 혼합&짬뽕, 원소접근시에 다운캐스팅 필요, 다운캐스팅 잘못하면 에러발생
"Object형으로 만들었다 = 확장을 했다 " 같은의미
다운캐스팅이란 접근시에 데이터형을 명시적으로 나타내는것
String str = (String)v.get(1); 이와같이 수정해줘야함

제네릭은 제서드 정의시 매개변수의 데이터형 결정 X  전달되는 매개변수에 의해 데이터형 결정
결정되지 않은 자료형을 <T>와 같이 표기 : T는 타입을 말하는것
-> 즉 데이터형을 한놈만 받고 그 받은 타입으로 쭉 써야함
GenClass<Integer> gen = new GenClass<Integer>();

Java8에서는 익명 클래스를 함수형 구조로 표현 가능케해 -> 람다식
Volume vol = ()->System.out.println("람다식 볼륨 조절");

*/