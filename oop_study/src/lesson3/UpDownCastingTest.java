package lesson3;

class Base{
	String name;
	public void say() {
		System.out.println(name + "�� �ȳ��ϼ���");
	}
}

class Sub extends Base{
	int age;
	@Override
	public void say() {
		System.out.println(name + "���� " + age + "�� �Դϴ�.");
	}
}

public class UpDownCastingTest {
	public static void main(String[] args) {
		
//		�θ� Ŭ���� Ÿ������ �θ� Ŭ���� ��ü�� ����� ��������Ƿ� ���������� ó���ȴ�.
		Base base = new Base();
		base.name = "ȫ�浿";
		base.say();
		
//		�ڽ� Ŭ���� Ÿ������ �ڽ� Ŭ���� ��ü�� ����� ��������Ƿ� ���������� ó���ȴ�.
		Sub sub = new Sub();
		sub.name = "�Ӳ���";
		sub.age = 35;
		sub.say();
		
//		�θ� �ڽ��� ������ �� ������ �ڽ��� �θ� ������ �� ����.
//		�θ� Ŭ���� Ÿ�Կ� �ڽ� Ŭ���� Ÿ���� ��ü�� ������ �ּҸ� ���������Ƿ� ���������� ó���ȴ�.
//		Base b = new Sub();
//		�ڽ� Ŭ���� Ÿ�Կ� �θ� Ŭ���� Ÿ���� ��ü�� ������ �ּҸ� ���������Ƿ� ������ �߻��Ѵ�.
//		Sub s = new Base();
		
//		�θ� Ŭ���� Ÿ�Կ� �ڽ� Ŭ���� Ÿ���� ��ü�� ������ �ּҸ� �����Ѵ�. ==> upcasting
		Base b = sub;
//		�θ� Ŭ���� Ÿ�Կ� �ڽ� Ŭ���� Ÿ���� ��ü�� ������ �ּҸ� ���������Ƿ� �θ� Ŭ������  say() �޼ҵ尡 �ƴ�
//		�ڽ� Ŭ������ say() �޼ҵ尡 ����ȴ�. ==> C++ ������ �θ� Ŭ������ say() �Լ��� ����ǹǷ� �ڽ� Ŭ������
//		say() �Լ��� �����ϱ� ���ؼ��� �θ� Ŭ������ say() �Լ��� virtual ���� ����� ���� �Լ��� ������ �ߴ�.
//		�̰��� ���� �޼ҵ尡 ���� �ٸ� Ŭ�������� �پ��ϰ� ����Ǵ� �������� ���ʰ� �ȴ�.
		b.say();
		
//		�ڽ� Ŭ���� Ÿ�Կ� �θ� Ŭ���� Ÿ���� ��ü�� ������ �ּҸ� �����Ѵ�. ==> downcasting 
//		�ڽ� Ŭ���� Ÿ�Կ� �θ� Ŭ���� Ÿ���� ��ü�� ������ �ּҸ� �����ϸ� ������ �߻��Ǵµ� �� ��, casting �� �ϸ�
//		������ �����ϴ�. ==> �������� ������ �߻����� ������ ��������� �� ClassCastException �� �߻��ȴ�.
//		Sub s = (Sub) base;
		
//		instanceof �����ڸ� ����ϸ� ��ü���� ���������� ����ȯ�� �����Ѱ� ���θ� �Ǵ��� �� �ִ�.
		if(base instanceof Sub) {
			Sub s = (Sub) base;
		}else {
			System.out.println("base ��ü�� Sub Ŭ���� Ÿ������ ����ȯ ��ų �� �����ϴ�.");
		}
		
		try {
			Sub s = (Sub) base;
		} catch (ClassCastException e) {
			System.out.println("base ��ü�� Sub Ŭ���� Ÿ������ ����ȯ ��ų �� �����ϴ�.");
		}
	}
}
