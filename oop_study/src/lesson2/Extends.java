package lesson2;
// Ŭ���� 4�Ӽ�
// 1. ���м�  ==> private default public ����������
// 2. ��� ==> Ŭ�������� �θ��ڽ��� �����ؼ� Ŭ������ �������ϰ� ��밡���ϴ�.
// �ڹ��� ���Ŭ������ Object Ŭ������ ��ӹ������¼� �����Ѵ�.
// ����� Ư¡  ==> 1���� ����� �� �ִ�.

class A extends Object{
	int a;
}
class B extends A{
	int b;
}
class C{
	A aa = new A();
	int c;
}

public class Extends {
	// ���
	public static void main(String[] args) {
		
		B bb = new B();
		C cc = new C();
		bb.a = 10;
		cc.aa.a = 10;
	}
}
