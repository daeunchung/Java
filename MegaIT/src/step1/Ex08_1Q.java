package step1;
/*
 * # ���� ��ȿ�� �˻�
 * 1. ������ �Է¹޴´�.
 * 2. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
 * 3. ��, �Է¹��� ������
 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
 *    ��) ������ �߸� �Է��߽��ϴ�.
 */

import java.util.Scanner;

public class Ex08_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�");
		int score = scan.nextInt();
		
		if(score>=60 && score<=100)
		{
			System.out.println("�հ��Դϴ�");
		}
		if(score<= 60)
		{
			System.out.println("���հ��Դϴ�");
		}
		if(score>= 100)
		{
			System.out.println("������ �߸� �Է��߽��ϴ�");
		}
		
	}

}
