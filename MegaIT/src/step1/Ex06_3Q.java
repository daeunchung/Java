package step1;

import java.util.Scanner;

/*
 * # ����(0)����(1)��(2) ����[1�ܰ�]
 * 1. com�� ����(1)�� �� �� �ִ�.
 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
 * 3. com�� me�� ����,
 * 		1) ����.
 * 		2) ���� �̰��.
 * 		3) ���� ����.			�� ����Ѵ�.
 */

public class Ex06_3Q {

	public static void main(String[] args) {
		System.out.println("0 1 2 �� �ϳ��� ���� �Է��Ͻÿ�");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		
		int com = 1;
		if(me>com ) {System.out.println("���� �̰��");};
		if(me==com ) {System.out.println("����");};
		if(me<com ) {System.out.println("���� ����");};
		
	}

}
