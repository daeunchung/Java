package step1;
/*
 * # ������ ���[1�ܰ�]
 * 1. �޴����� ����Ѵ�.
 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
 * 3. ������ �Է¹޴´�.
 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
 */

import java.util.Scanner;

public class Ex09_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		System.out.println("�ֹ��� �޴��� ��ȣ�� �Է��Ͻÿ�");
		int menu = scan.nextInt();
		
		System.out.println("������ �־��ּ���");
		int money = scan.nextInt();
		
		
		if(menu == 1) {
			if(price1 == money) {
			System.out.println(menu + ".�Ұ�� ����" + "(" + price1 + ")" + "�� �ֹ��� �Ϸ�Ǿ����ϴ�.");
			}
			if(price1>money) {
				System.out.println("������ �����մϴ�");
			}
			if(price1<money) {
				System.out.println(menu + ".�Ұ�� ����" + "(" + price1 + ")" + "�� �ֹ��� �Ϸ�Ǿ����ϴ�. �ܵ��� " + (money-price1) + "�� �Դϴ�.");
			}
			
		}
		if(menu == 2) {
			if(price2 == money) {
			System.out.println(menu + ".���� ����" + "(" + price2 + ")" + "�� �ֹ��� �Ϸ�Ǿ����ϴ�.");
			}
			if(price2>money) {
				System.out.println("������ �����մϴ�");
			}
			if(price2<money) {
				System.out.println(menu + ".���� ����" + "(" + price2 + ")" + "�� �ֹ��� �Ϸ�Ǿ����ϴ�. �ܵ��� " + (money-price2) + "�� �Դϴ�.");
			}

		}
		if(menu == 3) {
			if(price3 == money) {
			System.out.println(menu + ".�ݶ�" + "(" + price3 + ")" + "�� �ֹ��� �Ϸ�Ǿ����ϴ�.");
			}
			if(price3>money) {
				System.out.println("������ �����մϴ�");
			}
			if(price3<money) {
				System.out.println(menu + ".�ݶ�" + "(" + price3 + ")" + "�� �ֹ��� �Ϸ�Ǿ����ϴ�. �ܵ��� " + (money-price3) + "�� �Դϴ�.");
			}
		}
		
	}
}
