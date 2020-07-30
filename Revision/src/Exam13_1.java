class Car2{
	private int speed = 100;
	public void speedUp() {
		speed += 10;
	}
}
class Truck extends Car2{
	private int weight = 5000;
}
public class Exam13_1 {
	public static void main(String[] args) {
		Truck truck = new Truck();
		//truck.speed = 110; 에러 발생
		truck.speedUp();
		//truck.weight = 3000;
	}
}
//접근 지정자는 클래스의 멤버변수 또는 메서드에 접근할 수 있느 ㄴ수준을 나타내는 키워드
//private 클래스 내부에서만 접근 가능
//protected 클래스 내부와 상속받은 클래스, 동일 패키지 내외 클래스에서 접근 가능 
// 동일 디렉토리 내에서 접근 가능
//public 클래스 외부에서 제한 없이 접근 가능
//생략시 :클래스 내부와 동일 패키지 or 동일 디렉토리내에서 접근 가능
//일반적으로 변수는 private으로 메서드는 public으로
