package step1;
/*
 * # ��� ���� ���߱� ����
 * 1. 150~250 ������ ���� ���� ����
 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
 * ��)
 * 		249		: 4
 */

import java.util.Random;
import java.util.Scanner;

public class Ex12_6Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num = ran.nextInt(101) + 150;
		
		System.out.println("���� ���� ����ڸ� ���� �Է��Ͻÿ�");
		int mid = scan.nextInt();
		
		if( (num%100)/10 == mid ){
			System.out.println("�����Դϴ�");
			System.out.println("���� ���� " + num + "�̾����ϴ�");
		}else
			System.out.println("�����Դϴ�");
			System.out.println("���� ���� " + num + "�̾����ϴ�");
	}

}
