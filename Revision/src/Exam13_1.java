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
		//truck.speed = 110; ���� �߻�
		truck.speedUp();
		//truck.weight = 3000;
	}
}
//���� �����ڴ� Ŭ������ ������� �Ǵ� �޼��忡 ������ �� �ִ� �������� ��Ÿ���� Ű����
//private Ŭ���� ���ο����� ���� ����
//protected Ŭ���� ���ο� ��ӹ��� Ŭ����, ���� ��Ű�� ���� Ŭ�������� ���� ���� 
// ���� ���丮 ������ ���� ����
//public Ŭ���� �ܺο��� ���� ���� ���� ����
//������ :Ŭ���� ���ο� ���� ��Ű�� or ���� ���丮������ ���� ����
//�Ϲ������� ������ private���� �޼���� public����
