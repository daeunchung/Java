package step2;

import java.util.Scanner;

/*
 * # �����̵�[1�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 */
public class Ex06_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		
		while(true) {
		
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
				System.out.print("�� ");
			}else {
				System.out.print(game[i] + " ");
			}
			} System.out.println();

		
		
			
			System.out.print("����[1.���� 2.������]�� �̵��� �Է��ϼ��� : ");
			int num = scan.nextInt();

			if(num == 1) {
				if(player != 0) {
					game[player] = 0;
					game[player-1] = 2;
					player--;
			}
				else if(player == 0) 
					System.out.println("���� ���� ���� �����Ͽ� ���̻� �������� �� �� ����.");
			}
			else if(num == 2) {
				if(player != 6) {
					game[player] = 0;
					game[player+1] = 2;
					player++;
				}
				else if(player == 6)
					System.out.println("���� ������ ���� �����Ͽ� ���̻� ���������� �� �� ����.");
			}
	
		}
		
	}

}
