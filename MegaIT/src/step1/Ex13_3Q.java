package step1;
/*
 * # ������ ��ȣ ���߱� ����
 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
 * 	  1) ����	  2)  �E��     3) ����	 4) ������
 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
 * ��) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    ���� : 2��
 */
import java.util.Random;
import java.util.Scanner;

public class Ex13_3Q {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int x = ran.nextInt(10) + 1;
	int y = ran.nextInt(10) + 1;
	
	int symbol = ran.nextInt(4) + 1;

	int z = 0;// ���������ε� �ʱ�ȭ �ؾ��մϴ�
	if(symbol == 1) {
		z = x + y;
	}else if(symbol == 2) {
		z = x - y;
	}else if(symbol == 3) {
		z = x * y;
	}else if(symbol == 4) {
		z = x % y;
	}
	
	System.out.println(x + " ? " + y + " = " + z);
	System.out.println();
	System.out.println("1)+ 2)- 3)* 4)%");
	System.out.print(" ? �� �˸��� ��ȣ�� ��ȣ�� �Է��ϼ��� : ");
	int ans = scan.nextInt();
	
	if(symbol == ans) {
		System.out.println("����!");
	}else {
		System.out.println("����!");
	}
	
	}
}
