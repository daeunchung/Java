//다형성 예제
class Shape{
	//추상클래스만 생성
}
class Rect extends Shape{
	Rect(){
		System.out.println("사각형");
	}
}
class Oval extends Shape{
	Oval(){
		System.out.println("원");
	}
}
//메서드 오버라이딩
//부모 클래스에 정의된 메서드를 자식 클래스에서 동일한 이름의 메서드로 재정의하는 기법
//자식 클래스의 객체를 생성 후 오버라이딩 된 메서드 호출시 부모 클래스의 메서드는 무시, 자식 클래스의 오버라이딩 된 메서드가 처리
//오버라이딩 된 메서드의 접근 지정자는 부모 클래스의 메서드와 동일 or 넓은 범위로 설정
//메서드 부모랑 자식 선언부 동일해야해
//메서드가 동일하기 위한 조건은 메서드명, 매개변수, 반환 데이터형, 접근 지정자 모두 일지 

//비슷한 종류 클래스 여러개 설계할때 -> 추상한놈 만들고 줄줄이 상속해서 메서드 오버라이딩 한 메서드를 객체 생성 이후에 쓰면됌