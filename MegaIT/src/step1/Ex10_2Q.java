package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ����
 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
 * 3. ������ �յ޸��� ���ߴ� �����̴�.
 */

public class Ex10_2Q {

	public static void main(String[] args) {
		
	Random ran = new Random();
	int coin = ran.nextInt(2);
	System.out.println("������ �յ޸��� ���߽ÿ�");
	System.out.println("�ո��̸� 0, �޸��̸� 1�� �Է��Ͻÿ�");
	
	Scanner scan = new Scanner(System.in);
	int me = scan.nextInt();
	
	if(coin == me)
		System.out.println("�����Դϴ�");
	else
		System.out.println("�����Դϴ�");
	}

}
