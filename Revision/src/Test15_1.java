//�������̽��� ���� ��� Ȱ��
interface Volume{
	void printVolume();
}
interface Tuner{
	void printTuner();
}
interface Controller extends Volume, Tuner{
	//�������̽��� �ٸ� �������̽��� ��ӹ޾ұ� ������ printVolume�̳� printTuner�� 
	//��� interface Controller�� ���ǰ� �Ǿ��ִٰ� �����ִ�
	void printController();
}
class Audio implements Controller{
	public void printVolume() {
		System.out.println("���� ������");
	}
	public void printTuner() {
		System.out.println("ä�� ���ñ�");
	}
	public void printController() {
		System.out.println("����, ä�� ���� ����");
	}
}
class Test15_1{
	public static void main(String[] args) {
	Audio a = new Audio();
	a.printVolume();
	a.printTuner();
	a.printController();
	}
}
//�ڹ�Ŭ������ ���߻�� �Ұ��� -> �������̽� �̿��Ͽ� ����
//class A extends B implements C,D,E { } ����