package step1;

import java.util.Scanner;
/*
 * # ����Ų���31
 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
 * 3. br�� 31�� ������ ������ ����ȴ�.
 * 4. �¸��ڸ� ����Ѵ�.
 * 
 * ��) 
 * 1�� : p1(2)	br(2)
 * 2�� : p2(1)	br(3)
 * 3�� : p1(3)	br(6)
 * ...
 */
public class Ex18_1Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int p1 = 0;
		//int p2 = 0;
		int br = 0;
		int turn = 1;

		while(br < 31) {
			
			if(turn % 2 == 1) {
				System.out.println("p1's turn [1~3�Է�] : ");
				int p1 = scan.nextInt();
				br += p1;
				turn ++;
			}
			else if(turn % 2 == 0) {
				System.out.println("p2's turn [1~3�Է�] : ");
				int p2 = scan.nextInt();
				br += p2;
				turn ++;
			}
		}
		
		if(turn % 2 == 1) 
			System.out.println("Winner is p2 !");
		else if(turn % 2 == 0)
			System.out.println("Winner is p1 !");
	}

}
