package step1;

import java.util.Scanner;

/*
 * # �ִ밪 ���ϱ�[1�ܰ�]
 * 1. ���� 3���� �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� ���Ͽ�,
 * 3. ���� ū ��(MAX)�� ����Ѵ�.
 */

public class Ex09_3Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù ���� �Է��ϼ���");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int num2 = scan.nextInt();
		System.out.println("����° ���� �Է��ϼ���");
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) 
			System.out.println("���� ū �� = " + num1);
		if(num2>num1 && num2>num3) 
			System.out.println("���� ū �� = " + num2);
		if(num3>num1 && num3>num2) 
			System.out.println("���� ū �� = " + num3);
	}
}

