//���� -> �ܺ� Ŭ���� ���� : ���Ѿ��� ����
//�ܺ� -> ���� Ŭ���� �ɹ� ������ �޼��� ���� : ��ü���� �ʼ�
//������ �� �ڿ��� ���� Ŭ���� ������ ������ ����  : �ܺ�Ŭ������$����Ŭ������.class
//GUI ���α׷��ֿ��� �̺�Ʈ ó���� Ȱ��
public class Exam16_1 {
	public Exam16_1() {
		System.out.println("�ܺ� Ŭ������ ������");
		InnerExam inner = new InnerExam();
		//�ܺ� -> ����Ŭ���� ���ٽÿ��� ��ü ������ �ؾ���
		inner.printExam();
	}
	public void printOuter() {
		System.out.println("�ܺ� Ŭ������ �޼���");
	}
	class InnerExam{
		public void printExam() {
				System.out.println("���� Ŭ���� �޼���");
				printOuter();//�ܺ�Ŭ������ ���Ե� �޼��忡 ���� ���� ����
			}
		}
	public static void main(String[] args) {
		Exam16_1 outer = new Exam16_1();
	}
}
