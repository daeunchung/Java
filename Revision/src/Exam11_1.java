
public class Exam11_1 {
	public Exam11_1() {
		//publicŰ���� �ڿ� �ٷ� Ŭ�������� ������ �̸��� �޼��尡 �������µ� 
		//��ȯŸ���� ���°� ���� ������ ��� �θ���.
		System.out.println("�� �κ��� ������");
	}
	public Exam11_1(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("�����ε��� ������");
		}
	}
	public static void main(String[] args) {
		Exam11_1 ex1 = new Exam11_1();
		Exam11_1 ex2 = new Exam11_1(3);
	}

}
//������ : ��ü�� �����ɶ� �⺻������ �ؾ��ϴ� �ϵ��� ���س��� �ڵ��� ����
//������ : ��ü�� ������ �� ������ �ʱ�ȭ�ϴ� �۾�//�ڵ����� ȣ���
//������ : <<�ݵ�� Ŭ�������� ������>> �ϰ� , ��ȯ�������� �ۼ� X , ���������ڴ� �Ϲ������� public
//���������� �����ڸ�Ī(�Ű����� ����Ʈ){
//����;
//}
//��ü���� TestClass test = new TestClass(); �ÿ� �����ڰ� �ڵ�ȣ���
//������ �����ε��� �޼��� �����ε��� ������ (�Ű������� �����Ǵ� ���������� �ٸ��� ��)
//���α׷��Ӱ� �����ڸ� �������� ���� ��� ����Ʈ �����ڰ� �ڵ����� ���ǉ�