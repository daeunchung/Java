package step1;

import java.util.Scanner;

/*
 * # ������ ����[1�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */

public class Ex07_3Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		int num1 = scan.nextInt();
		
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		int num2 = scan.nextInt();
		System.out.println(num1 + "*" + num2 + "= ?");
		
		int ans = scan.nextInt();
		if(ans == num1*num2) {
			System.out.println("����");
		}
		else
			System.out.println("��");
		
	}
}

