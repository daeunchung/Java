package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # 369����[1�ܰ�]
 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
 * 2. �� ���� 369�� ������
 * 	1) 2���̸�, ¦¦�� ���
 *  2) 1���̸�, ¦�� ���
 *  3) 0���̸�, �ش� ���ڸ� ���
 * ��)
 * 		33	 : ¦¦
 * 		16	 : ¦
 * 		 7	 : 7
 */
public class Ex13_1Q {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(50) + 1;
		int ten = num/10;
		int one = num%10;
		
		if(ten%3==0 && one%3 ==0) {
			System.out.println("¦¦");
		}
		else if(ten%3==0 && one%3 !=0) {
			System.out.println("¦");
		}
		else if(ten%3!=0 && one%3 ==0) {
			System.out.println("¦");
		}
		else {
			System.out.println(num);
		}
		System.out.println(num);
		
	}

}
