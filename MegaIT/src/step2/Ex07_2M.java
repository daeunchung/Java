// 2020-02-20 13:50-14:08
package step2;
/* 
 * # ƽ����
 * === ƽ���� ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]�ε��� �Է� : 6
 * === ƽ���� ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]�¸�
 * 
 */

import java.util.Scanner;

public class Ex07_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = new int[9];
		int turn = 0;
		
		boolean run = true;
		while(run) {
			
		System.out.println("=== ƽ���� ===");
		for(int idx = 0; idx < 9; idx++) {
			if(game[idx] == 0) {
				System.out.print("[ ]");
			}else if(game[idx] == 1) {
				System.out.print("[O]");
			}else if(game[idx] == 2) {
				System.out.print("[X]");
			}
			if(idx % 3 == 2) {
				System.out.println();
			}
		}

		
		if(turn % 2 == 0) {
			System.out.println("[p1]�ε��� �Է� : ");
			int idx1 = scan.nextInt();
			if(game[idx1] == 0) {
				game[idx1] = 1;
			}
	
		}else if(turn % 2 == 1) {
			System.out.println("[p2]�ε��� �Է� : ");
			int idx2 = scan.nextInt();
			if(game[idx2] == 0) {
				game[idx2] = 2;
			}
		}
		
		turn++;
		
		for(int i = 0; i < 9; i+=3) {
			if(game[i] == 1 && game[i+1] == 1 && game[i+2] == 1) {
				System.out.println("[p1]�¸�");
				run = false;
			}else if(game[i] == 2 && game[i+1] == 2 && game[i+2] == 2) {
				System.out.println("[p2]�¸�");
				run = false;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) {
				System.out.println("[p1]�¸�");
				run = false;
			}else if(game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) {
				System.out.println("[p2]�¸�");
				run = false;
			}
		}
		
		for(int i = 0; i < 9; i+=3) {
			if(game[0] == 1 && game[4] == 1 && game[8] == 1) {
				System.out.println("[p1]�¸�");
				run = false;
			}else if(game[2] == 1 && game[4] == 1 && game[6] == 1) {
				System.out.println("[p1]�¸�");
				run = false;
			}
			
			if(game[0] == 2 && game[4] == 2 && game[8] == 2) {
				System.out.println("[p2]�¸�");
				run = false;
			}else if(game[2] == 2 && game[4] == 2 && game[6] == 2) {
				System.out.println("[p2]�¸�");
				run = false;
			}
		}
		// ������� run = false; �� ������ ���ٴ� while(true) �س��� 
		// int win �� �����Ͽ� p1�¸� -> win = 1   p2�¸� -> win = 2�� �ؼ� 
		// if�� �Ἥ win ���� ���� ���ڸ� �������
		}
		
	}

}
