package hijava;

abstract class CarMain {
	abstract void moveCar();
}
class CarSedan extends CarMain {
	public void moveCar() {
		System.out.println("�¿��� �̵�");
	}
}
class CarTruck extends CarMain {
	public void moveCar() {
		System.out.println("Ʈ�� �̵�");
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