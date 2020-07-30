package chapter03;
/*
 * 
 * # ������ ����
 * 1. �ڷ���(data type)�� ���� �з�
 * 1) �⺻�� ����(primitive type)
 * . ������: byte(1), short(2), int(4), long(8)
 * . �Ǽ���: float(4), double(8)
 * . ������ : char(2)
 * . ���� : boolean(1)
 * 
 * 2) ������ ����(reference type)
 * 
 * 2. ���� ��ġ�� ���� �з�
 * 1) Ŭ���� ����
 * -> �ڵ� 0���� �ʱ�ȭ
 * 
 * 	(1) static ����(=Ŭ���� ����)
 *   Ŭ������.������
 * 	(2) non-static ����(=�ν��Ͻ� ����)
 *   Ŭ������ �ν��Ͻ� = new Ŭ������();
 *   �ν��Ͻ���.������
 * 2) �޼��� ����
 * * ���������� ���� �ڵ��ʱ�ȭ���� �ʴ´�.
 * ������ ����� ���ÿ� �ʱ�ȭ���� ���� �����Ѵ�.
 * 
 * 
 */
public class Ex03 {
	
	static int x;		// Ŭ���� ���� : Ŭ������.������ ���� ���� ����
			int y;		// �ν��Ͻ� ���� : �ν��Ͻ���.���������� �������ּ���

	public static void main(String[] args) {
		
		System.out.println(Ex03.x); //Ŭ������.������ ���� ����
		
				 // ��ü(instance) : ��ȣ �����ʿ� �ִ°� ���δ� new���� ��
		Ex03 e = new Ex03();
		System.out.println(e.y); //��ü �̸����� ����
		System.out.println(new Ex03().y); // �̷��� ������ ������ �����ϴٴ°� �����ֱ� ������
		
		

		int num = 10; // 4byte
		// �ڵ� ����ȯ
//		double d = num; // 8byte�� 4byte¥�� �����ϴ� �ڵ� ����ȯ
		double d = (double)num;
		System.out.println(d);  // 10.0
		
		double a = 3.14;
		// ���� ����ȯ (ǥ�� �ʼ�)
		int x = (int)a; // �� �ս� �߻�
		System.out.println(x);
		
		
		}

}
