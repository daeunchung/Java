package step3;
/*
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

import java.util.Random;
import java.util.Scanner;

public class Ex03_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		
		while(true) {
			
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i<3; i++) {
				System.out.print("[" + (i+1) + "]1~9 �Է� : ");
				int num = scan.nextInt();
				
				int check = 1;
				for(int j = 0; j<i; j++) {
					if(num == me[j]) {
						check = -1; // ���ؼ� ������ -1�� �ٲ���
					}
				}
				
				if(check ==
						-1) {
					i -= 1; //�̹� -1�̸� i�� �ϳ��ٿ�
					
				}else {
					me[i] = num ;
				}
			}
		}
		
	}

}
