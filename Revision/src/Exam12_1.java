//              �� �� �ɹ� ����
//������ü�� �ɹ������� �����ϰ��� �� ��� staticŰ���带 ���
//������ ��ü�� ������ �� �ʿ䰡 ������쿡 ����
//��ü �������� ����� ������ ����
//static�ɹ������� ��ü���� ������ �޸� �Ҵ�
//static�ɹ������� Ŭ���������ε� ����ok ��ü������ ��ü�����ε� ����ok
//class Eee{//�����ɹ����� ����
//static int count = 0;
//}
//Eee test = new Edd();//��ü ���� �� ��ü������ ����(���1)
//test.count = 1;
//Eee.count = 2;//Ŭ���������� ����(���2)


public class Exam12_1 {
	static int count = 0;
	int age = 30;
	public static int getCount() {
		return count;
	}
	public static void main(String[] args) {
		System.out.println(Exam12_1.getCount());
		Exam12_1.count++; //Ŭ������.�Ӽ���;
		System.out.println(Exam12_1.getCount());
	}
}
