package hijava;

abstract class CarMain {
	abstract void moveCar();
}
class CarSedan extends CarMain {
	public void moveCar() {
		System.out.println("승용차 이동");
	}
}
class CarTruck extends CarMain {
	public void moveCar() {
		System.out.println("트럭 이동");
	}
}
public class Exam14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarSedan car1 = new CarSedan();
		car1.moveCar();
		CarTruck car2 = new CarTruck();
		car2.moveCar();

	}

}