package lesson4;

class Point{
	int x, y;
	public void move() {}
}

class Shape{
//	final�� ��� ���� ����� �տ� �ٿ��ָ� �� ������ ���α׷����� ���� �����ų �� ����. ==> ���
//	final�� �޼ҵ� ����� �տ� �ٿ��ָ� �� �޼ҵ�� override ��ų �� ����.
//	final�� Ŭ���� ����� �տ� �ٿ��ָ� �� Ŭ������ ��ӽ�ų �� ����.
	public static final double PI = 3.141592;	// ���� ���, ���
	public void draw() {}
	public void erase() {}
}

// �ڹٴ� ���� ����� �������� �ʱ� ������ ������ �߻��ȴ�.
// class Line extends Point, Shape{} 	// ���� �߻�

// �������̽��� ������ ����(static) ��� ����(���)�� �߻� �޼ҵ�θ� ������ Ŭ������ Ư���� �����̴�.
interface Draw{
	public static final double PI = 3.141592;	// ���� ���, ���
//	�������̽��� ���� ����� ���� ������ �����ϸ� public static final �� �����Ϸ��� �ڵ����� �ٿ��ش�.
	int LIMIT = 1000;
	public abstract void move1();	// �߻� �޼���
//	�������̽��� �޼ҵ� ����� ���� ������ �����ϸ� public abstract �� �����Ϸ��� �ڵ����� �ٿ��ش�.
	void erase();
//	�������̽��� {} ����� ������ �Ϲ� �޼ҵ带 �����ϸ� ������ �߻��ȴ�.
//	void erase() {}					// �Ϲ� �޼���
	
}

interface Graphic{
	void resize();
	void rotate();
}

//Ŭ������ �������̽��� ��ӹ��� �� ���� ������ ������ �߻��ȴ�.
//class Line extends Graphic{}		// ���� �߻�

//�������̽��� Ŭ������ ��� ���� �� ���� ������ ������ �߻��ȴ�.
//interface Graphics extends Shape{}	// ���� �߻�

//Ŭ������ Ŭ�������� �������̽��� �������̽����� ��ӽ�ų �� �ִ�.
//Ŭ������ ���� ����� ������� ������ �������̽��� ���� ����� ����Ѵ�.
interface Graphics extends Draw, Graphic{
//	�ƹ��� ������ ������ �ʴ� �������̽��� ǥ��(marker)�������̽��� �θ���.
}

//Line Ŭ������ Point Ŭ������ ��ӹް� Draw, Graphic �������̽��� �����޾� �����.
//Ŭ�������� �������̽��� ��ӹ޴� ȿ���� ������ extends ���� ������� �ʰ�  implements ���� ����ϸ� 
//����̶� �θ��� �ʰ� �����̶� �θ���.
class Line extends Point implements Draw, Graphic{
	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move1() {
		// TODO Auto-generated method stub
		
	}
//	resize rotate erase move1 �� Draw �� Graphic �� �޼����
}

public class InterfaceTest {

	public static void main(String[] args) {

//		static ��� ������ ��ü�� �������� �ʰ� Ŭ���� �̸��� "."�� �� �ٷ� ������ �� �ִ�.
		System.out.println(Shape.PI);
//		final ����(���)�� ���� ���α׷����� �����Ϸ� �����Ƿ� ������ �߻��ȴ�.
//		Shape.PI = 1.23456;		// ���� �߻�
		System.out.println(Math.PI);
		
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);
		
	}

}
