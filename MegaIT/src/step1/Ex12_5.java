package step1;

import java.util.Scanner;

public class Ex12_5 {

	public static void main(String[] args) {
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		// 2. ����
		int cash = 20000; // �Աݽ� ����, ��ݽ� ����
		int balance = 30000; // �Աݽ� ����, ��ݽ� ���� //balance�ܰ� �ܾ�
		int account = 11111; // �α��ν� ���
		int password = 1234; // �α��ν� ���
		
		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.�α��� 2.����");
		int select = scan.nextInt();
		
		if(select ==1) {
			System.out.println("���¿� ��й�ȣ�� �Է��ϼ���");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			if(acc == account && pw == password){
				System.out.println("1.�Ա� 2.��� 3.��ȸ");
				select = scan.nextInt();
				
				if(select ==1) {
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
					int deposit = scan.nextInt();
					cash -= deposit;
					balance += deposit;
					System.out.println("�ԱݿϷ� �Ǿ����ϴ�");
				}
				else if (select ==2) {
					System.out.println("����� �ݾ��� �Է��ϼ���");
					int withdraw = scan.nextInt();
					cash += withdraw;
					balance -= withdraw;
					System.out.println("��ݿϷ� �Ǿ����ϴ�");
				}
				
				System.out.println("�ܾ� : " + balance + "��");
			}
			
			else {
				System.out.println("���̵�� �н����带 Ȯ�����ּ���");
			}	
		}
		else if(select == 2) {
			System.out.println("����");
		}
	}
}
