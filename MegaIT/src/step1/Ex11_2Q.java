package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ����[2�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �����ϰ� �����Ѵ�.
 * 2. ����� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */

public class Ex11_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num1 = ran.nextInt(9) + 1;
		int num2 = ran.nextInt(9) + 1;
		System.out.println(num1 + " * " + num2 + " = ?");
		
		int me = scan.nextInt();
		if(num1*num2 == me)
			System.out.println("����");
		else
			System.out.println("��");
	}

}
