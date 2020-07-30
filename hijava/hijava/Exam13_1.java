package hijava;

class Car2{
	private int speed = 100;
	public void speedUp() {
		speed += 10;
	}
}
class Truck extends Car2{
	private int weight = 5000;
}
public class Exam13_1{
	public static void main(String[] args) {
		Truck truck = new Truck();
		//truck.speed = 110; (private는 직접 접근만 가능해서 에러)
		truck.speedUp();
		//truck.weight = 3000; (private는 직접 접근만 가능해서 에러)
	}
}