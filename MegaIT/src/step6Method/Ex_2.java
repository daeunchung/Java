package step6Method;

class Number {
	int x;
	
	void setX(int num) {
		/*
		 * 1. �޼��� ȣ�� �� this��� ������ �ڵ� �����ȴ�.
		 * 2. �� ������ ȣ���ϴ� ���� �ּҰ� ����ǳ�.
		 * ��) main�� n������ setX()��� �޼��带 ȣ�� �߱� ������,
		 *    setX() �޼��忡�� �ڵ� ������ this�� n�� �ּҰ� ����� ���̴�.
		 * 3. Ŭ���� ������ ����� ������ �� �����տ� this. �����Ǿ��־�
		 *    setX() �޼����� ������(stack) Ŭ��������(heap)�� ���� ������ �޶� ������ �����ߴ� ���̴�.
		 */
		System.out.println("this = " + this);
		/* this. */x = num;
	}
}

public class Ex_2 {
	public static void main(String[] args) {
		
		Number n = new Number();
		System.out.println("n = " + n); // n���� �ּ�
		n.setX(100);
		
		System.out.println(n.x);
		
		
	}
}
