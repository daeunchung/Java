//2020-02-09 13:44-13:58
package step2;

import java.util.Scanner;

public class Ex06_1M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;}
			}
		
		boolean run = true;
		while(run) {
			for(int i=0; i<7; i++) {
				System.out.print(game[i] + " ");
			}System.out.println(); //while�� �ȿ��� ������ �ѹ� ������ְ���  �۵���Ű�� 
			// ���� �̰� ��¹��� while��  ������ ������ ����� . �������� ��¾����ְ� �ٷ� �Էº��� �޾���.
			
			System.out.print("��1��2�Է� : ");
			int move = scan.nextInt();	
			
			if(move ==1) {
				if(player - 1 >= 0) {
					game[player] = 0;
					game[player-1] = 2;
					player--;
				}
			}else if(move ==2) {
				if(player + 1 <= 7) {
					game[player] = 0;
					game[player+1] = 2;
					player++;
				}
			}		
		}
	}
}
