package lesson3;
//Ŭ����4 �Ӽ�
//���м�, ���, �߻�ȭ
//�߻�ȭ  ==> �θ� Ŭ������ ��ӹ��� �ڽ�Ŭ������ Ư���޼��带 ���鵵�� �����ϴ°�
//abstract ��ġ  ==> 1. Ű���� ������ �޼��� �տ� �� 2. Ŭ���� �տ� �ٿ��ش�.
class A{
	int a;
	void test() {
		
	}
}
class B extends A{
	int b;
}
abstract class C{
	int c;
	abstract void test();	// �޼����̸��� �������� ����� �ڽĿ��� �����.
}
class D extends C{
	int d;
	void test() {	// ������ �������ϴ� �޼���
		
	}
}

public class Abstract {
	public static void main(String[] args) {
		
	}
}
