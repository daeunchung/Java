package step1;

/*
 * # ���(Control Statement)
 * 1. ���ǹ� : if, switch-case
 * 2. �ݺ��� : for, while, do-while
 * 3. ���� ��� : break, continue
 * 
 * # ���ǹ� if
 * if(���ǽ�){
 * 		���ǽ��� ��(true)�� �� ������ ����;
 * }
 */

public class Ex06_1Q {

	public static void main(String[] args) {
		if(true) {
			System.out.println("���� O");
		}
		
		if(false) {
			System.out.println("���� X");
		}
		
		// ��) Ȧ¦
		int num = 8;
		System.out.println(num % 2 == 0);
		System.out.println(num % 2 == 1);
		
		if(num % 2 == 0) {
			System.out.println("¦��");
		}
		if(num % 2 == 1) {
			System.out.println("Ȧ��");
		}
		
		// ���� 1) ���, 0, ���� ���
		num = -10;
		if(num > 0) {
			System.out.println("���");
		}
		else if(num ==0) {
			System.out.println("0");
		}
		else 
			System.out.println("����");

		
		// ���� 2) 4�� ��� ���
		num = 12;
		if(num%4 ==0)
			System.out.println("4�� ����̴�");
		
		// ���� 3) �հ�, ���հ� ���
		int score = 87;
		if(score >= 90) {
			System.out.println("�հ�");
		}
		else
			System.out.println("���հ�");


	}

}
