package lesson4;
abstract class AA{
	abstract void test1();
	void test2() {}
}
class BB extends AA{
	void test1() {
	}
}
interface EE{
	public void test3();
}
interface CC{
	public void test1();
	public void test2();
}
class DD implements CC, EE{
	public void test1() {}
	public void test2() {}
	public void test3() {}
}

//�������̽�(Interface) Ŭ����
//�������̽��� �߻�Ŭ�������� �� �߻�ȭ�� Ŭ���� (���ΰ���)
// 1. ���� ������ ���� �������� �⺻ ���赵
// 2. ����� �߻� �޼��常 ����� ���´�.
// 3. �ν��Ͻ��� ������ �� ����, Ŭ���� �ۼ��� ������ �� �������� ���Ǵ� Ŭ����
// 4. �̸� ������ ��Ģ�� �°� �����ϵ��� "ǥ��" �� �����ϴµ� ���
// 5. ���߻���� �����ϴ�.

public class Interface {
	public static void main(String[] args) {
		
	}
}
