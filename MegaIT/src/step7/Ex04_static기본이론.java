package step7;
// static // ��������
// ���α׷��� �����Ҷ� �Ҵ�޾Ƽ�
// ���α׷��� ����ɶ� �����Ǹ� ���� ( ��ġ : static ���� )
class Ttest{
	int a;
	static int b;
	int c;
	static void test() {
	}
}
public class Ex04_static�⺻�̷� {
	public static void main(String[] args) {
		Ttest.b = 100;
		Ttest t = new Ttest();
		Ttest t1 = new Ttest();
	}
}
