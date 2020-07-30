package step2;

import java.util.Scanner;
/*
 * # ��ȭ�� �¼�����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */
public class Ex03_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		int[] seat = new int[7];
		
		for(int i = 0; i < 7; i++) {
			seat[i] = 0;
		}
		
		boolean run = true;
		
		while(run) {
			System.out.println("=�ް� ��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				System.out.print("�¼����� : ");
				int idx = scan.nextInt();
				
				if(seat[idx] == 1) {
					System.out.print("seat = ");
					
					for(int i = 0; i < 7; i++) {
						System.out.print(seat[i] + " ");
						}
					
					System.out.println();
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�. ");
				}
				else if (seat[idx] == 0) {
					seat[idx] = 1;
					cnt ++;
					System.out.print("seat = ");
					
					for(int i = 0; i < 7; i++) {
						System.out.print(seat[i] + " ");
					}
					System.out.println();
				}
			}
			
			else if(sel == 2) {
				run = false;
				System.out.println("-----------------------");
				System.out.println("����� : " + cnt * 12000 + "��");
			}
		}
	}
}
