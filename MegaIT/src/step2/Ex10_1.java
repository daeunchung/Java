package step2;

import java.util.Scanner;

/*
 * # ATM[3�ܰ�]
 * 1. ����
 * . ���¹�ȣ�� ��й�ȣ�� �Է¹޾� ����
 * . ���¹�ȣ �ߺ��˻�
 * 2. Ż��
 * . ���¹�ȣ�� �Է¹޾� Ż��
 */

public class Ex10_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			for(int i = 0; i<cnt; i++) {
				System.out.println((i+1) + ". " + accs[i] + " : " + pws[i]);
			}System.out.println();
			
			System.out.println("1.����");
			System.out.println("2.Ż��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				if(cnt == 5) {
					System.out.println("�� �̻� ������ �� �����ϴ�");
					continue; // (ó������ �ٽ� �޴� ����ؾ��ϴϱ� �� ����ϰ�)
				}
				
				System.out.print("[����]���¹�ȣ �Է� : ");
				int myAcc = scan.nextInt();
								
				// int check �̿��ؼ� �� ���°� ���� ���¶� �ߺ��Ǵ��� Ȯ�����ֱ�
				int check = 1;
				for(int i = 0; i<cnt; i++) {
					if(myAcc == accs[i]) {
						check = -1;
					}
				}
				
				if(check == -1) {
					System.out.println("���¹�ȣ�� �ߺ��˴ϴ�.");
				}else {
					accs[cnt] = myAcc;
					System.out.print("[����]��й�ȣ �Է� : ");
					int myPw = scan.nextInt();
					
					pws[cnt] = myPw;
					cnt++;
				}
				
			}
			else if(sel == 2) {
				System.out.print("[Ż��]���¹�ȣ �Է� : ");
				int myAcc = scan.nextInt();
				
				int check = -1;
				for(int i = 0; i<cnt; i++) {
					if(myAcc == accs[i]) {
						check = i;
					}
				}
				
				if(check == -1) {
					System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
					//continue; (�ᵵ �ǰ� �Ƚᵵ �ǰ�)
				}else {
					for(int i = check; i<cnt; i++) {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
					}
					cnt--;
				}
				
			}
			
		}
		
	}
}
