abstract class CarMain{
	abstract void moveCar();
}
class CarSedan extends CarMain{
	public void moveCar() {
		System.out.println("�¿��� �̵�");
	}
}
class CarTruck extends CarMain{
	public void moveCar() {
		System.out.println("Ʈ�� �̵�");
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
//�߻� Ŭ������ ������ �������� ���� ������ �ڽ� Ŭ������ �����ϱ� ���� ���
//�߻� Ŭ���� ��ü�� ���� X, �Ϲ� �޼��峪 ��� ���� ���� �� ����. ����κ� X
//���� (�ﰢ�� �簢�� ������) �϶� ���� = �߻� Ŭ����

//�߻� �޼��� ���� : abstract ��ȯ�������� �޼����(); ����κ� X
//�߻� �޼��� ������ Ŭ������ ������ �߻� Ŭ����
//�߻� �޼���� ���� ���� X ȣ�� �Ұ���
//�߻� Ŭ������ �ƴ� Ŭ���� ���� �߻�޼��� �����ϸ� ����
//�߻� �޼���� ��� ���� �ڽ� Ŭ�������� ���� ���� ����
//�߻� Ŭ������ ����� �޴� Ŭ���������� �߻� Ŭ������ �޼��带 �ݵ�� �������̵� �ؾ���