package step1;

import java.util.Scanner;

/*
 * # �Է¹ޱ�
 * 1. impor java.util.Scanner;
 * java.util��Ű�� ���� Scanner Ŭ���� ������ ���� �������� �ҷ��´�
 * 2. scan ���� ����
 * Scanner scan = new Scanner(System.in);
 * 3. �ȳ��� �ۼ�
 * System.out.print("���̸� �Է��ϼ��� : ");
 * 4. �Է¹ޱ�
 * int age = scan.nextInt();
 * 
 */

public class Ex05_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//�Ʒ����� Scan���� ġ�� Ctrl+space ������ �ڵ����� ������ util.Scanner import ��
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = scan.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� " + num + "�Դϴ�");
		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "�� �̱���!");
		
// 1) int�� �Է� ���� ���� nextInt �޼��带 �̿��Ѵ�. 
// 2) char�� �Է� ���� ���� (char)System.in.read �޼��带 �̿��Ѵ�.
// 3) char�� ������ �Է� ���� ���� nextLine �޼��带 �̿��Ѵ�.
	}

}
