package step1;
/*
 * # ����ö ��� ���
 * 1. �̿��� ������ ���� �Է¹޴´�.
 * 2. ������ ���� ������ ���� ���� ����� ����ȴ�.
 * 3. ���ǥ
 * 1) 1~5	: 500��
 * 2) 6~10	: 600��
 * 3) 11,12 : 650��
 * 4) 13,14 : 700��
 * 5) 15,16 : 750��
 * ... 
 */

import java.util.Random;
import java.util.Scanner;

public class Ex13_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("�̿��� ������ ���� �Է��Ͻÿ�. 1~16 ������ �Է°���");
		int sNum = scan.nextInt();
		
		if(1 <= sNum && sNum <=5 ) {
			System.out.println("500���Դϴ�");
		}
		if(6 <= sNum && sNum <=10 ) {
			System.out.println("600���Դϴ�");
		}
		if(11 == sNum || sNum ==12 ) {
			System.out.println("650���Դϴ�");
		}
		if(13 == sNum || sNum == 14 ) {
			System.out.println("700���Դϴ�");
		}
		if(15 == sNum || sNum == 16 ) {
			System.out.println("750���Դϴ�");
		}
		
	}

}
