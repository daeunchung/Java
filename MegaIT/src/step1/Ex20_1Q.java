package step1;

import java.util.Scanner;
/*
 * # ���θ� �ڷΰ���
 * 1. �����Ƿ�
 * 		1) Ƽ����
 * 		2) ����
 * 		3) �ڷΰ���
 * 2. �����Ƿ�
 * 		1) �����
 * 		2) ġ��
 * 		3) �ڷΰ���
 * 3. ����
 */
public class Ex20_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("1)Ƽ����");
				System.out.println("2)����");
				System.out.println("3)�ڷΰ���");
				
				System.out.print("�޴� ���� : ");
				int selM = scan.nextInt();
					if(selM == 1) {
						System.out.println("1)Ƽ���� �� ���õǾ����ϴ�.");
						run = false;
					}else if(selM == 2) {
						System.out.println("2)���� �� ���õǾ����ϴ�.");
						run = false;
					}
			}
			
			else if(sel == 2) {
				System.out.println("1)�����");
				System.out.println("2)ġ��");
				System.out.println("3)�ڷΰ���");
				
				System.out.print("�޴� ���� : ");
				int selW = scan.nextInt();
					if(selW == 1) {
						System.out.println("1)����� �� ���õǾ����ϴ�.");
						run = false;
					}else if(selW == 2) {
						System.out.println("2)ġ�� �� ���õǾ����ϴ�.");
						run = false;
					}
			}
			
			else if(sel == 3) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}
}
	
