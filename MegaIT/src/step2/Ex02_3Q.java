package step2;

import java.util.Scanner;

/*
 * # �л��������� ���α׷�[3�ܰ�] : ����ó��
 */
public class Ex02_3Q {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		System.out.print("�й� �Է� : " );
		int sNum = scan.nextInt();
		
		if( 1001 <= sNum && sNum <= 1005) {
			for(int i = 0; i < 5; i++) {
				
				if(sNum == hakbuns[i]) {
					System.out.println("���� : " + scores[i]);
				}
			}
		}else
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
	}	

}
/*
 * ����� �ڵ� ������ ���� ������ �ڵ��ε� !!
 * 
 * ����� �ڵ�� int check ������ �����Ͽ�    ���� �й��� �Է½ÿ�  check = -1 ��
 * �ִ� �й� �Է½ÿ�   check = �й��� �ε��� �� ���� �����Ͽ�
 * if check == -1 -> �й� ������Ѵ�,  else score[check] ���
 */


