package step5;

import java.util.Scanner;

/*
 * # �����̵�[3�ܰ�] : Ŭ���� + ����
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
 * ��) 
 *  0 0 0 0 0 0 0 2 
 *  ����(1) ������(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */
class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class Ex04_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		Ex08 e = new Ex08();
		
		int player = 0;
		for(int i=0; i<e.game.length; i++) {
			if(e.game[i] == 2) {
				player = i;
			}
		}

		while(true) {
			
			for(int i = 0; i < e.game.length; i++) {
				System.out.print(e.game[i] + " ");
			}System.out.println();
			
			System.out.print("1.left 2.right : ");
			int move = scan.nextInt();
			
			// �·� �̵��Ͻÿ�
			if(move == 1) {
				// ���� ���ʳ��� �ƴϰ� ���� ���� �ÿ�
				if(player != 0 && e.game[player - 1] == 1) {
					System.out.println("3.punch : ");
					int punch = scan.nextInt();
					
					if(punch != 3) {
						continue;
					}
				}
				e.game[player] = 0;
				player--;
				
				if(player == -1) { // ���� ���ʳ��϶�
					player = e.game.length-1;
				}else { // ���� ���� ����ϰ� �·� �̵���
					player %= e.game.length;
					// player = player % e.game.length;
				}
				
				e.game[player] = 2;
			}
			else if(move == 2) {
				if(player != e.game.length-1 && e.game[player + 1] == 1) {
					System.out.print("3.punch : ");
					int punch = scan.nextInt();
					if(punch != 3) {
						continue;
					}
				}				
				e.game[player] = 0;
				player += 1;
				player %= e.game.length; // ��� �̵��ÿ��� �ε��� ���� �����ϹǷ� ���� Ź���� �ڵ�
				// 0 1 2 3  4  5  6 
				// 7 8 9 10 11 12 13 ...
				e.game[player] = 2;
			}
		}
	}
}
