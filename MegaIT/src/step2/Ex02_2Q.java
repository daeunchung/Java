package step2;
/*
 * # �л��������� ���α׷�[2�ܰ�] : �л��˻�
 */

import java.util.Scanner;

public class Ex02_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				// �ε���              0   1   2   3   4
				int[] arr = {87, 11, 45, 98, 23};
				
				// ����1) �ε����� �Է¹޾� ���� ���
				// ����1) �ε��� �Է� : 1	���� : 11��
				System.out.print("�ε��� �Է� : ");
				int index = scan.nextInt();
				System.out.println("���� : " + arr[index] + "��");
				
				// ����2) ������ �Է¹޾� �ε��� ���
				// ����2) ���� �Է� : 11		�ε��� : 1
				System.out.print("���� �Է� : ");
				int score = scan.nextInt();
				
				for(int i = 0; i < 5; i++) {
					
					if(arr[i] == score) {
						System.out.println("�ε��� : " + i);
					}
				}
				
	
				
				int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
				int[] scores  = {  87,   11,   45,   98,   23};
				
				// ����3) �й��� �Է¹޾� ���� ���
				// ����3) �й� �Է� : 1003	���� : 45��
				System.out.print("�й� �Է� : ");
				int sNum = scan.nextInt();

				for(int i = 0; i < 5; i++) {
				if(hakbuns[i] == sNum) {
					System.out.println("���� : " + arr[i] + "��");
				}
					
				}
				
	}

}
