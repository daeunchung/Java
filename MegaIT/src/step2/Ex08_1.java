package step2;
import java.util.Scanner;
/*
 * # �̴ϸ���
 * 1. �÷��̾�� p1�� p2 2���̴�.
 * 2. �����ư��� 1~3 ������ ���ڸ� �Է��� �̵��Ѵ�.
 * 3. �̵��ϴٰ� ���� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
 *    ��� �÷��̾�� ������ �Ǿ� �������� �ǵ��ư���.
 * 4. ���� 3������ ���� �̱��.
 *    
 *  [p2]1~3 �Է� : 1
 *  1 2 3 4 5 6 7 8 
 *  0 1 0 0 0 0 0 0 
 *  0 0 0 2 0 0 0 0 
 *  
 *  [p1]1~3 �Է� : 3
 *  [p1]�� p2�� ��Ҵ�!
 *  1 2 3 4 5 6 7 8 
 *  0 0 0 0 1 0 0 0 
 *  2 0 0 0 0 0 0 0 
 */

public class Ex08_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		int round1 = 0; int round2 = 0;
		
		boolean run = true;
		while(run) {
		
		if(turn % 2 == 0) {
			System.out.print("[p2]1~3 �Է� : ");
			int n2 = scan.nextInt(); 
			p2[idx2] = 0;
			idx2 += n2;
			if(idx2 >= 8) {
				idx2 = idx2 % 8; 
				round2++;
				p2[idx2] = 2;
			}else 
				p2[idx2] = 2;
			
			if(round2 >= 3) {
				System.out.println("p2�� ���� 3���� ���Ҵ�. �¸�!");
				break;
			}
		
		if(idx1 == idx2) {
			System.out.println("[p2]�� p1�� ��Ҵ�!");
			p1[idx1] = 0;
			idx1 = 0;
			p1[idx1] = 1;
		}
			
		}else if(turn % 2 == 1) {
			System.out.print("[p1]1~3 �Է� : ");
			int n1 = scan.nextInt();
			p1[idx1] = 0;
			idx1 += n1;
			if(idx1 >= 8) {
				idx1 = idx1 % 8; 
				round1++;
				p1[idx1] = 1;
			}else 
				p1[idx1] = 1;
			
			if(round1 >= 3) {
				System.out.println("p1�� ���� 3���� ���Ҵ�. �¸�!");
				break;
			}
			
			if(idx1 == idx2) {
			System.out.println("[p1]�� p2�� ��Ҵ�!");
			p2[idx2] = 0;
			idx2 = 0;
			p2[idx2] = 2;
			}
		}
		turn++;
	
		for(int i = 0; i < 8; i++) {
			System.out.print(game[i] + " ");
		}System.out.println();
		for(int i = 0; i < 8; i++) {
			System.out.print(p1[i] + " ");
		}System.out.println();
		for(int i = 0; i < 8; i++) {
			System.out.print(p2[i] + " ");
		}System.out.println();
	}
	}

}
