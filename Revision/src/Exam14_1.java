abstract class CarMain{
	abstract void moveCar();
}
class CarSedan extends CarMain{
	public void moveCar() {
		System.out.println("승용차 이동");
	}
}
class CarTruck extends CarMain{
	public void moveCar() {
		System.out.println("트럭 이동");
	}
}
public class Exam14_1 {
	public static void main(String[] args) {
		CarSedan car1 = new CarSedan();
		car1.moveCar();
		CarTruck car2 = new CarTruck();
		car2.moveCar();
	}
}
//추상 클래스는 동일한 목적으로 접근 가능한 자식 클래스들 정의하기 위해 사용
//추상 클래스 자체는 내용 X, 일반 메서드나 멤버 변수 가질 수 있음. 몸통부분 X
//도형 (삼각형 사각형 오각형) 일때 도형 = 추상 클래스

//추상 메서드 문법 : abstract 반환데이터형 메서드명(); 몸통부분 X
//추상 메서드 가지는 클래스는 무조건 추상 클래스
//추상 메서드는 실제 내용 X 호출 불가능
//추상 클래스가 아닌 클래스 에서 추상메서드 정의하면 에러
//추상 메서드는 상속 받은 자식 클래스에서 실제 내용 구현
//추상 클래스의 상속을 받는 클래스에서는 추상 클래스의 메서드를 반드시 오버라이딩 해야함