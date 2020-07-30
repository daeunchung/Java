package step5;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
 */

class Ex13{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}

public class Ex06_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex13 e = new Ex13();
		
		for(int i = 0; i<e.SIZE; i++) {
			e.front[i] = i + 1; // 1 2 3 4 5 6 7 8 9
			e.back[i] = 10 + i; // 10 11 12 13 14 15 16 17 18 19
		}
		
		// ����
		for(int i = 0; i<1000; i++) {
			int r = ran.nextInt(e.SIZE);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;		
		}
		for(int i = 0; i<1000; i++) {
			int r = ran.nextInt(e.SIZE);
			int temp = e.back[0];
			e.back[0] = e.back[r];
			e.back[r] = temp;		
		}
		
		int gameNum = 1;
		
		while(true) {
			
			for(int i = 0; i<e.SIZE; i++) {
				if(e.front[i] == 0) {
					System.out.print("\t");
				}else {
					System.out.print(e.front[i] + "\t");
				}
				if(i % 3 == 2) {System.out.println("\n");}
			}
			System.out.println();
			
			if(gameNum == 19) {
				System.out.println("���� ����");
				break;
			}
			
			System.out.print("�Է� : ");
			int idx = scan.nextInt();
			
			if(e.front[idx] == gameNum) {
				
				if(1 <= gameNum && gameNum <= e.SIZE) {
					e.front[idx] = e.back[idx];
				}else if(e.SIZE < gameNum && gameNum <= 18) {
					e.front[idx] = 0;
				}
				gameNum++;
			}
		}
	}
}
