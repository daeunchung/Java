//���׸� Ŭ���� ����
class GenClass<T>{//��� ������Ÿ�Ե� �޾Ƶ��ϼ� �ִ�
	private T num;
	public void setNum(T val) {
		num = val;
	}
	public T getNum() {
		return num;
	}
}
public class Exam21_2 {
	public static void main(String[] args) {
		GenClass<Integer> gen1 = new GenClass<Integer>();
		gen1.setNum(100);
		System.out.println(gen1.getNum());
		GenClass<Double> gen2 = new GenClass<Double>();
		gen2.setNum(3.14);
		System.out.println(gen2.getNum());
		GenClass<String> gen3 = new GenClass<String>();
		gen3.setNum("������");
		System.out.println(gen3.getNum());
	}
}

/*
�÷����� Object���� �����ϴ� ���� : � ���������� ó���� �� �ֵ��� �ϱ�����
-> ���� : ���������͵��� ȥ��&«��, �������ٽÿ� �ٿ�ĳ���� �ʿ�, �ٿ�ĳ���� �߸��ϸ� �����߻�
"Object������ ������� = Ȯ���� �ߴ� " �����ǹ�
�ٿ�ĳ�����̶� ���ٽÿ� ���������� ��������� ��Ÿ���°�
String str = (String)v.get(1); �̿Ͱ��� �����������

���׸��� ������ ���ǽ� �Ű������� �������� ���� X  ���޵Ǵ� �Ű������� ���� �������� ����
�������� ���� �ڷ����� <T>�� ���� ǥ�� : T�� Ÿ���� ���ϴ°�
-> �� ���������� �ѳ� �ް� �� ���� Ÿ������ �� �����
GenClass<Integer> gen = new GenClass<Integer>();

Java8������ �͸� Ŭ������ �Լ��� ������ ǥ�� �������� -> ���ٽ�
Volume vol = ()->System.out.println("���ٽ� ���� ����");

*/