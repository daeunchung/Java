package step4;

import java.util.Scanner;

//�ı� ���Ǳ� ���α׷� 		
//1) ������   2) ����� 
//������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
//����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
//      2)�ڷΰ���
//���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7����� 
//ȭ�� 
//�ı� ���� : 3200�� 
//�ı� 	  : ??��  (������ ����) 
//50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
//1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 
public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] money  = {50000, 10000, 5000, 1000, 500, 100}; // ��¿�
		int[] charge = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// �ı� ����
		int price = 3200;		// �ı� ����
		int run = 1;
		
		while(run == 1) {
			
			System.out.println("[1]������");
			System.out.println("[2]�����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			// ������
			if(sel == 1) {
				int run1 = 1;
				while(run1 == 1) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int sel1 = scan.nextInt();
					if(sel1 == 1) {
						System.out.println("[���� : " + tickets + "��] ������ �ı� �� �Է� : ");
						int count = scan.nextInt();
						tickets += count;
						System.out.println(tickets + "��ŭ �ı��� �����մϴ�.");
					}
					else if(sel1 == 2) {
						int run2 = 1;
						while(run2 == 1) {
							for(int i = 0; i<money.length; i++) {
								System.out.print("[" + i + ". " + money[i] + "��");
							}
							System.out.println();
							System.out.println("6.�ڷΰ���");
							int sel2 = scan.nextInt();
							if(sel2 == 6) {
								run2 = 0;
							}else {
								charge[sel2] += 1;
								System.out.println(money[sel2] + "�� �����մϴ�.");
							}
						}
					}
					else if(sel1 == 3) {
						run1 = 0;
					}
				}
			}
			
			// �����
			else if(sel == 2) {
				int run1 = 1;
				while(run1 == 1) {
					System.out.println("�ı� ���� : " + price + "��");
					System.out.println("�ı� �ż� : " + tickets + "��");
					for(int i = 0; i<money.length; i++) {
						System.out.print("[" + money[i] + "��] ");
						System.out.print(charge[i] + "��");
						System.out.println();
					}
					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int sel3 = scan.nextInt();
					if(sel3 == 1) {
						System.out.print("�Ա��� �ݾ� �Է� : ");
						int input_count[] = new int[6];
						int input_money = 0;
						
						// while�� �ѹ� �������� ���� �Ա� �����ϰ� ¥�� �ڵ��ε�
						while(true) { 
							System.out.println("[1.������] [2.�ϸ���] [3.��õ��] [4.��õ��] [5.�����] [6.�Ϲ��] [0.����]");
							int num = scan.nextInt();
							if(num == 0) break;
							else input_count[num-1] ++;
							
							input_money = 0;
							for(int i = 0; i<6; i++) {
								input_money += input_count[i] * money[i];
							}System.out.println("�Ա��� �ݾ� : " + input_money);
						}
						if(input_money < price) break; // �Աݾ��� �ı����尪�� �ȵǸ� �� ���޾�
						System.out.print("�ı� �ż� �Է� : ");
						int ticket_count = scan.nextInt();
						if(tickets < ticket_count) break;
						int price_total = ticket_count * price;
						int result = input_money - price_total;
						if(result < 0) {
							System.out.println("�Ա��� �ݾ��� �����ϴ�.");
						}else {
							// �ܵ� �Ž��� �ִ� ����
							// üũ(temp)�迭 ���� ���� �ű��ֱ�
							int check_charge[] = new int[6];
							for(int i = 0; i<6; i++) {
								check_charge[i] = charge[i];
							}
							int result_check = result;
							for(int i = 0; i<6; i++) {
								int check_run = 1;
								while(check_run == 1) {
									// if(�ܵ� >= ��������ݾ� && �ش������ܿ���� > 0){ 
									// check_�ܵ� -= ��������ݾ�;
									// check �迭���� �ܵ����� ���� ���� ���� ���ֱ�}
									if(result_check >= money[i] && check_charge[i] > 0) {
										result_check -= money[i];
										check_charge[i] --;
									}else {
										check_run = 0; break;
									}
								}
							}
							// �ܵ��̶� �Աݾ��̶� ��ġ�ϸ� 
							// check�迭�� �Űܳ����� ����ġ + �Աݾ׵� �ܵ��迭�� �־���
							if(result_check == 0) {
								for(int i = 0; i<6; i++) {
									charge[i] = check_charge[i];
									charge[i] += input_count[i];
								}
								tickets -= ticket_count/*���Žı����*/;
								
								System.out.println(
										"[�Ա� : " + input_money + "]" + 
										"[�Ѿ� : " + price_total + "]" + 
										"[�Ž����� : " + result + "]");	
							}else {
							System.out.println("�ܵ��� �����մϴ�.");}
						}
					}
					else if(sel3 == 2) {
						run1 = 0;
					}
				}
			}
		}
	}
}
