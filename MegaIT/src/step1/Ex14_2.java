package step1;

public class Ex14_2 {
	public static void main(String[] args) {
		
		System.out.printf("%d", 10);
		System.out.println();// println()�������� �ϸ� �ٳѱ��̶�� ��
		
		System.out.printf("%f\n", 3.14); // 3.140000
		System.out.printf("%.2f\n", 3.14); // 3.14 
		//�Ҽ��� �ι�° �ڸ� ������ ��Ÿ����
		
		System.out.printf("%c\n", 'b');
		System.out.printf("%s\n", "��¹��� ����");
		
		String fruit = "���";
		int cnt = 5;
		System.out.printf("%s�� %d�� �ֽ��ϴ�\n", fruit, cnt);
		
		/*
		 * printf��� �̸��� �� �� f�� formatted(����ȭ��)�� �ǹ��Ѵ�
		 * '����ȭ�� ���'�̶� ����� ��� ������ ������� ����Ѵٴ� ���̴�
		 * 
		 * ���� ���ڴ� ��µ� ������ �����ϴ� ������ �ּ� ���̸� �ǹ��մϴ�. 
		 * print("%-10f�� 1.5 ������ 3�� ����̴�" % (1.5 / 3))�� 
		 * �����⿡ �Է��Ͽ� �����غ��ø� �ǹ̸� �����Ͻ� �� ���� �̴ϴ�
		 * ����� ��ġ�ϴ� �������� �⺻ ������ ������ �����ε�, 
		 * - �� ���̸� ���� ������ �˴ϴ�
		 */
		
	}

}
