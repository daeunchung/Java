package step1;
/*
 * # ATM[1�ܰ�] : ��ü�ϱ�
 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
 * 2. ���¹�ȣ�� ��ġ�ϸ�,
 * 3. ��ü�� �ݾ��� �Է¹޴´�.
 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
 * 			myMoney   - ��ü�� �ݾ�
 * 			yourMoney + ��ü�� �ݾ�
 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
 */

import java.util.Scanner;

public class Ex12_4Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("��ü�� ���¹�ȣ�� �Է��Ͻÿ�");
		int inAcc = scan.nextInt();
		
		if(inAcc == yourAcc) {
			System.out.println("��ü�� �ݾ��� �Է��Ͻÿ�");
			int sendMoney = scan.nextInt();
			
			if (sendMoney <= myMoney) {
				System.out.println(sendMoney + "���� ��ü�Ǿ����ϴ�");
				myMoney -= sendMoney;
				yourMoney += sendMoney;
				System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
			}
			else if(sendMoney > myMoney) {
				System.out.println("�ܾ��� �����Ͽ� ��ü�� �Ұ����մϴ�.");
			}
			
		}else
			System.out.println("���¹�ȣ�� ��ġ���� �ʽ��ϴ�.");
		
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");
	}

}
