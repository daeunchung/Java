package step3;

import java.util.Random;
import java.util.Scanner;

/*0510-
 * # ���� �߱� ����
 * 1. me�� 1~9 ������ ���� 3���� ����
 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
 * ��)
 * ���� : 1 7 3
 * 3 1 5		: 2b
 * 1 5 6		: 1s
 * ...
 */
public class Ex03_2M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		
	
		while(true) {
		
			int strike = 0;
			int ball = 0;
	
			for(int i = 0; i < 3; i++) {
				System.out.print("[" + (i+1) + "]1~9�Է� : ");
				int num = scan.nextInt();
			
				int check = 1;
				int j = 0;
				
				while(j < i) {
					if(me[j] == num) {
						check = -1;
					}j++; // while���� ���� ���Ǽ����ÿ� j�� ++ �����ִ� ���๮�� ���� �ۼ����־���ϰ�
				}
				
				if(check == 1) {
					me[i] = num;
					
				}else 
					i--; // for���� ���� ���Ǽ������ο� ������� �ڵ����� i++ �ǹǷ� �ڵ������� �����ֱ����� i-- �ʿ�
			}
			
			
			System.out.print("me = [");
			for(int i = 0; i<3; i++) {
				System.out.print(me[i] + " ");
			}System.out.println("]");
			
			
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					if(com[i] == me[j]) {
						if(i == j) {
							strike++;
						}else if(i != j) {
							ball++;
						}
					}
				}
			}
			System.out.print("Strike(" + strike + ") Ball(" + ball + ")");
			System.out.println();
			
		if(strike == 3) {
			break;
		}

		
		}

	}

}
