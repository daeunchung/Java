//�������̽� Ȱ���� �߻�Ŭ������ �߻�޼��� ���¹���� ���� + ���޼��忡 public���� �ʼ�
interface VolumeSystem{
	void volumeUp();
	void volumeDown();
	//�������̽������� �޼����� ��ü���� ���� ���� �ʰ� ��Ī�� �ۼ� (�߻�޼���ó��)
	//�����ϴ� ������ ��ü���� ���� �ۼ�
}
public class Exam15_1 implements VolumeSystem{
	public void volumeUp() {
		System.out.println("������ ���δ�");
	}
	public void volumeDown() {
		System.out.println("������ �����");
	}

	public static void main(String[] args) {
		Exam15_1 audio = new Exam15_1();
		audio.volumeUp();
		audio.volumeDown();
	}
}
//�������̽��� Ŭ������ �ٸ�
//��Ī�� �Ű������� ������ �޼���� ��ü�� ���� �����ϵ��� �ϱ����� ���
//�������̽��� ��� �޼��� = �߻�޼��� -> abstract���� �Ⱦ�
//�������̽��� ���ǵ� �ޤӼ���� �������̽��� ����ϴ� Ŭ�������� �ݵ�� ����
//�������̽��� ��� �޼���� public ���ο����� public abstract�� �ν�
//�������̽��� �����ϴ� Ŭ�������� �������̽��l �޼��� ������ ��ü������ ����
//�ڹ� Ŭ������ ���߻�� �Ұ��� -> �������̽��� ���� ��� ����