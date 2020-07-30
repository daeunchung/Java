package step3;
/*
 * # �����̵�[2�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 */

import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		int charIdx = 0;
		int wallIdx1 = 0;
		int wallIdx2 = 0;		
		
		for(int i = 0; i<9; i++) {
			if(game[i] == 2) {
				charIdx = i;
			}
		}
				
		while(true) {
			
			for(int i=0; i<9; i++) {
				if(game[i] == 2) {
					System.out.print("�� ");
				}else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();
	
		System.out.println("��(1)��(2) �Է� : ");
		int move = scan.nextInt();
		
		if(move == 1) {		
			if(charIdx >= 1) {
				
				if(game[charIdx-1] == 1) {
				System.out.print("���̶� �̵��Ұ���. ����(3) �Է� : ");
				int punch = scan.nextInt();
					if(punch != 3) {
						continue;
					}
				}
				game[charIdx - 1] = 2;
				game[charIdx] = 0;
				charIdx -= 1;
			}
	
		}
		
		else if(move == 2) {	
			if(charIdx <= 7) {
				
				if(game[charIdx+1] == 1) {
				System.out.print("���̶� �̵��Ұ���. ����(3) �Է� : ");
				int punch = scan.nextInt();
					if(punch != 3) {
						continue;
					}
				}
				game[charIdx + 1] = 2;
				game[charIdx] = 0;
				charIdx += 1;

			}
			
		}
	}
		
	}

}
