package hijava;

abstract class Car{
	abstract void moveCar();
}
class Sedan extends Car{
	public void moveCar() {
		System.out.println("승용차 이동");
	}
}
class Bus extends Car{
	public void moveCar() {
		System.out.println("트럭 이동");
	}
}
public class Exam14_2{
	
	public static void main(String[] args) {
		Bus Bongo = new Bus();
		Bongo.moveCar();
	}
}