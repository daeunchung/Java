package hijava;

abstract class Car{
	abstract void moveCar();
}
class Sedan extends Car{
	public void moveCar() {
		System.out.println("�¿��� �̵�");
	}
}
class Bus extends Car{
	public void moveCar() {
		System.out.println("Ʈ�� �̵�");
	}
}
public class Exam14_2{
	
	public static void main(String[] args) {
		Bus Bongo = new Bus();
		Bongo.moveCar();
	}
}