package lesson3;
//클래스4 속성
//은닉성, 상속, 추상화
//추상화  ==> 부모 클래스를 상속받은 자식클래스에 특정메서드를 만들도록 강제하는것
//abstract 위치  ==> 1. 키워드 강제할 메서드 앞에 와 2. 클래스 앞에 붙여준다.
class A{
	int a;
	void test() {
		
	}
}
class B extends A{
	int b;
}
abstract class C{
	int c;
	abstract void test();	// 메서드이름만 만들어놓고 기능은 자식에서 만든다.
}
class D extends C{
	int d;
	void test() {	// 강제로 만들어야하는 메서드
		
	}
}

public class Abstract {
	public static void main(String[] args) {
		
	}
}
