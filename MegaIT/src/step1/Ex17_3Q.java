package step1;
/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 * 3. �Ա�
 * . �α��� �� �̿밡��
 * 4. ���
 * . �α��� �� �̿밡��
 * 5. ��ü
 * . �α��� �� �̿밡��
 * 6. ��ȸ
 * . �α��� �� �̿밡��
 * 0. ����
 */

import java.util.Scanner;

public class Ex17_3Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;						// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				if(log == -1) {
					System.out.println("���¹�ȣ�� �Է��Ͻÿ�");
					int inAcc = scan.nextInt();
					
					if(inAcc == dbAcc1) {
						System.out.println("��й�ȣ�� �Է��Ͻÿ� ");
						int inPw = scan.nextInt();
						
						if(inPw == dbPw1) {
							System.out.println("�α��� �Ǿ����ϴ�. ");
							System.out.println();
							log = 1;
						}else { 
							System.out.println("��й�ȣ�� �߸��Ǿ����ϴ�");
							System.out.println();
							}
					}
					
					else if(inAcc == dbAcc2) {
						System.out.println("��й�ȣ�� �Է��Ͻÿ� ");
						int inPw = scan.nextInt();
						
						if(inPw == dbPw2) {
							System.out.println("�α��� �Ǿ����ϴ�. ");
							System.out.println();
							log = 2;
						}else { 
							System.out.println("��й�ȣ�� �߸��Ǿ����ϴ�"); 
							System.out.println();
						}
					}	
					
					else
						System.out.println("���¹�ȣ�� �߸��Ǿ����ϴ�.");
						System.out.println();
				}
				
				else if(log == 1) {
					System.out.println("�̹� �α��� �Ǿ��ֽ��ϴ�. �α׾ƿ� ���� ���ּ���");
					System.out.println();
				}
				else if(log == 2) {
					System.out.println("�̹� �α��� �Ǿ��ֽ��ϴ�. �α׾ƿ� ���� ���ּ���");
					System.out.println();
				}
			}
			
			
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("�α��� �Ŀ� �α׾ƿ��� �����մϴ�");
				}
				else if(log == 1) {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�");
					log = -1;
				}
				else if(log == 2) {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�");
					log = -1;
				}

			}
			
			
			
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("�α��� �Ŀ� �̿����ּ��� ");
				}
				else if(log == 1) {
					System.out.println("�Ա��� �ݾ��� �Է��Ͻÿ�");
					int inMoney = scan.nextInt(); 
					
					dbMoney1 += inMoney;
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�");
				}
				else if(log == 2) {
					System.out.println("�Ա��� �ݾ��� �Է��Ͻÿ�");
					int inMoney = scan.nextInt(); 
					
					dbMoney2 += inMoney;
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�");
				}
			}
			
			
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("�α��� �Ŀ� �̿����ּ��� ");
				}
				if(log == 1) {
					System.out.println("����� �ݾ��� �Է��Ͻÿ�");
					int outMoney = scan.nextInt();
					
					if(outMoney > dbMoney1) {
						System.out.println("������ ���¿� �ܾ��� �����մϴ�");
					}else {
						dbMoney1 -= outMoney;
						System.out.println("����� �Ϸ�Ǿ����ϴ� ");
					}
				}
				if(log == 2) {
					System.out.println("����� �ݾ��� �Է��Ͻÿ�");
					int outMoney = scan.nextInt();
					
					if(outMoney > dbMoney2) {
						System.out.println("������ ���¿� �ܾ��� �����մϴ�");
					}else {
						dbMoney2 -= outMoney;
						System.out.println("����� �Ϸ�Ǿ����ϴ� ");
					}
					
				}
			}
			
			
			else if(sel == 5) {
				
				if(log == -1) {
					System.out.println("�α��� �Ŀ� �̿����ּ��� ");
				}
				if(log == 1) {
					System.out.println("��ü�� ���¸� �Է����ּ��� ");
					int sendAcc = scan.nextInt();
					
					if(sendAcc == dbAcc2) {
						System.out.println("��ü�� �ݾ��� �Է��Ͻÿ� ");
						int sendMoney = scan.nextInt();
						
						if(sendMoney > dbMoney1) {
							System.out.println("������ ���¿� �ܾ��� �����մϴ� ");
						}else {
							dbMoney1 -= sendMoney;
							dbMoney2 += sendMoney;
							System.out.println("��ü�� �Ϸ� �Ǿ����ϴ� ");
							System.out.println();
						}
					}else
						System.out.println("��ü�� ���¹�ȣ�� Ȯ�����ּ���");
						
					
				}
				if(log == 2) {
					System.out.println("��ü�� ���¸� �Է����ּ��� ");
					int sendAcc = scan.nextInt();
					
					if(sendAcc == dbAcc1) {
						System.out.println("��ü�� �ݾ��� �Է��Ͻÿ� ");
						int sendMoney = scan.nextInt();
						
						if(sendMoney > dbMoney2) {
							System.out.println("������ ���¿� �ܾ��� �����մϴ� ");
						}else {
							dbMoney2 -= sendMoney;
							dbMoney1 += sendMoney;
							System.out.println("��ü�� �Ϸ� �Ǿ����ϴ�");
							System.out.println();
						}
					}else
						System.out.println("��ü�� ���¹�ȣ�� Ȯ�����ּ���");
				}
			}
			
			
			else if(sel == 6) {
				if(log == -1) {
					System.out.println("�α��� �Ŀ� �̿����ּ��� ");
				}
				if(log == 1) {
					System.out.println("������ �ܾ��� : " + dbMoney1 + "�� �Դϴ� ");
				}
				if(log == 2) {
					System.out.println("������ �ܾ��� : " + dbMoney2 + "�� �Դϴ� ");
				}
			}
			
			
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}
}
