package step1;
/*
 * # ���̱ⱸ �̿�����
 * 1. Ű�� �Է¹޴´�.
 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
 */

import java.util.Scanner;

public class Ex08_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��Ͻÿ�");
		int height = scan.nextInt();
		if(height <120)
		{
			System.out.println("���̱ⱸ�� �̿��� �� �����ϴ�");
		}
		
		System.out.println("�θ�԰� �Բ� ���̳���?(yes:1, no:0)");
		int mom = scan.nextInt();
		if( mom == 1)
		{
			System.out.println("���̱ⱸ �̿��� �����մϴ�");
		}
		if( mom == 0)
		{
			System.out.println("���̱ⱸ �̿��� �Ұ����մϴ�");
		}
	}

}
