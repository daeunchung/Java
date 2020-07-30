package step7;
/*
 * # �޼��� �����ε�(overloading)
 * 1. �޼��� �����ε��̶�,
 *    ���� �̸��� ��������� ���� �ٸ� �Ű����� ������ ������ �ִ� �޼��带 
 *    ������ �����ϴ� ���� �ǹ��Ѵ�.
 * 2. System.out.println() �޼��尡 ��ǥ���� ���̴�.
 * 3. �����ε��� ����
 * 1) �޼����� �̸��� ���ƾ� �Ѵ�.
 * 2) �Ű������� ���� �Ǵ� �Ű������� �ڷ����� �޶�� �Ѵ�.
 */
class Mobile{
	String name;
	int price;
	String maker;
	
	void init() {
		name = ""; price = 0; maker = "";
	}
	void init(String na, int pr, String ma) {
		name = na; price = pr; maker = ma;
	}
	void init(String na, int pr) {
		name = na; price = pr; maker = "";
	}
	void init(String na, String ma) {
		name = na; price = 0; maker = ma;
	}
	void init(int pr, String na) {
		name = na; price = pr; maker = "";
	}
}
public class Ex04_�޼�������ε� {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.init();
		System.out.println(m.name+", "+m.price+", "+m.maker);
		m.init("������", 1000, "����");
		System.out.println(m.name+", "+m.price+", "+m.maker);
		m.init("������", 1000);
		System.out.println(m.name+", "+m.price+", "+m.maker);
		
	}
}
