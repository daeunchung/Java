package step1;
import java.util.Scanner;
/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 */			
public class Ex17_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if( log == -1 ) {
					System.out.println("���¹�ȣ�� �Է����ּ���");
					int myAcc = scan.nextInt();
					
					if(myAcc == dbAcc1) {
						System.out.println("��й�ȣ�� �Է����ּ���");
						int myPw = scan.nextInt();
						
						if(myPw == dbPw1) {
							System.out.println("1�� �������� �α��� �Ǿ����ϴ�");
							System.out.println();
							log = 1;
							//run = false; -> ġ�� ���� ���ù��� ��µ��� �ʾƿ�. (�ּ� 3���� ��)
						}else
							System.out.println("��й�ȣ�� Ȯ�����ּ���");
					
						
					}else if(myAcc == dbAcc2) {
						System.out.println("��й�ȣ�� �Է����ּ���");
						int myPw = scan.nextInt();
						
						if(myPw == dbPw2) {
							System.out.println("2�� �������� �α��� �Ǿ����ϴ�");
							log = 2;
							//run = false;
							System.out.println();
							
						}else
							System.out.println("��й�ȣ�� Ȯ�����ּ���");
							System.out.println();

					}else 
						System.out.println("���¹�ȣ�� �߸��Ǿ����ϴ�");
						System.out.println();
					
					
				}else if( log == 1 || log == 2) {
					System.out.println("�̹� �α��� �Ǿ��ֽ��ϴ�");
					System.out.println("�� �α����� �Ұ��մϴ�");
					System.out.println();
					}
			}
			
			else if(sel == 2) {
				
				if(log == -1) {
					System.out.println("�α��� �Ŀ��� �α׾ƿ��� �����մϴ�");
					System.out.println();
				}else if(log == 1 || log ==2 ) {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�");
					log = -1;
					//run = false;
					System.out.println();
				}
			}
			
				
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}
}
