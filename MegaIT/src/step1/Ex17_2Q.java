package step1;

import java.util.Scanner;

/*
 * # ATM[2�ܰ�]
 * 1. �Ա�
 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
 * 2. ���
 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
 * 3. ��ü
 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
 * . ��ü �� yourMoney �ܾ� ����
 * 4. ��ȸ
 * . myMoney�� yourMoney �ܾ� ��� ���
 */
public class Ex17_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				System.out.println("�Ա��� ���¸� �Է��Ͻÿ�");
				int scanAcc = scan.nextInt();
				if( scanAcc == myAcc ) {

					System.out.println("�Ա��� �ݾ��� �Է��Ͻÿ�");
					int sendMoney = scan.nextInt();
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�");
					myMoney += sendMoney;	
					System.out.println();
					}
				else 
					System.out.println("���¹�ȣ�� �߸��Ǿ����ϴ�");
					System.out.println();
			
			}
			
			else if(sel == 2) {
				
				System.out.println("����� ���¸� �Է��Ͻÿ�");
				int scanAcc = scan.nextInt();
				if( scanAcc == myAcc ) {
					
					System.out.println("����� �ݾ��� �Է��Ͻÿ�");
					int sendMoney = scan.nextInt();
					
					if(sendMoney <= myMoney) {
						System.out.println("����� �Ϸ�Ǿ����ϴ�");
						myMoney -= sendMoney;	
						System.out.println();
						
					}else if(sendMoney > myMoney) {
						System.out.println("�ܾ��� �����Ͽ� ����� �Ұ����մϴ�");
						System.out.println("���� ���� �ܾ��� " + myMoney );
						System.out.println();
						}
					}
				else 
					System.out.println("���¹�ȣ�� �߸��Ǿ����ϴ�");
					System.out.println();
				
			}
			
			else if(sel == 3) {
				System.out.println("��ü�� ���¸� �Է��Ͻÿ�");
				int scanAcc = scan.nextInt();
				if( scanAcc == yourAcc ) {
					
					System.out.println("��ü�� �ݾ��� �Է��Ͻÿ�");
					int sendMoney = scan.nextInt();
					
					if(sendMoney <= myMoney) {
						System.out.println("��ü�� �Ϸ�Ǿ����ϴ�");
						myMoney -= sendMoney;
						yourMoney += sendMoney;
						System.out.println();
					
					}else if(sendMoney > myMoney) {
						System.out.println("�ܾ��� �����Ͽ� ��ü �Ұ����մϴ�");
						System.out.println("���� ���� �ܾ��� " + myMoney );
						System.out.println();
					
					}
					
				}
				else
					System.out.println("��ü�� ���¸� Ȯ�����ּ���");
			}
			
			else if(sel == 4) {
				
				System.out.println("���� ������ �ܾ��� " + myMoney );
				System.out.println("������ ������ �ܾ��� " + yourMoney );
				System.out.println();
			}
			
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
		}

	}

}
