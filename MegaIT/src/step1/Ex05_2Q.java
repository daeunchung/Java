package step1;

import java.util.Scanner;

public class Ex05_2Q {

	public static void main(String[] args) {
		
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("�� ���� ���� " + (num1 + num2));
		
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.println("�ϳ��� ���� �Է��ϼ���");
		int num = scan.nextInt();
		System.out.println(num % 2 == 1);
		
		// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���
		System.out.println("������ �Է��ϼ���");
		int score = scan.nextInt();
		System.out.println(score >=60 && score<=100);

	}

}
