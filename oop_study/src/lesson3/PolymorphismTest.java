package lesson3;

import java.util.Scanner;

//�������̶� �ϳ��� �޼ҵ尡 ���� �ٸ� Ŭ�������� �پ��ϰ� ����Ǵ� ���� ���Ѵ�
//�������� �����ϱ� ���ؼ��� �������� ������ �޼ҵ尡 ���Ե� ��� Ŭ������ ���� �θ� Ŭ������ ������ �Ѵ�
//�θ� Ŭ������ �ڽ� Ŭ������ ���� �޼ҵ尡 �־�� �ϸ� �ڽ� Ŭ������ �� �޼ҵ带 �ݵ�� override ���Ѽ� ����ؾ� �Ѵ�
//�θ� Ŭ���� Ÿ�Կ� �ڽ� Ŭ���� Ÿ���� ���Խ��� �������� ������ �޼ҵ带 �����Ѵ�

abstract class Shape{
	int x, y;
	public void move() {}
	public abstract void draw();
}

//  Shape Ŭ������ ��ӹ޾�  Point Ŭ������ �����.
class Point extends Shape{
	@Override
	public void draw() {
		System.out.println("���� ��´�.");
	}
}

//Shape Ŭ������ ��ӹ޾� Line Ŭ������ �����.
class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

//	Shape Ŭ������ ��ӹ޾� Circle Ŭ������ �����.
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

//Shape Ŭ������ ��ӹ޾� Rect Ŭ������ �����.
class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}
}

//	Shape Ŭ������ ��ӹ޾� TriAngle Ŭ������ �����.
class TriAngle extends Shape{
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
		
//		�θ� Ŭ���� Ÿ�Կ� �ڽ� Ŭ���� Ÿ���� ���Խ��� �������� ������ �޼ҵ带 �����Ѵ�.
//		Shape shape = new Point();
//		shape.draw();
		
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �۾��� �����ϼ��� : ");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();

	}
}
