package step1;
/*
 * # �α���[2�ܰ�]
 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */

import java.util.Scanner;

public class Ex07_2Q {
	//�ڵ忡 dbId dbPw �ʱⰪ�� 0���� �����ߴ��� �� �����ϴ���?

	public static void main(String[] args) {
		
		int num = 0;
		System.out.println(num);
		//java�� main�ȿ��� ���������� ��밡���ؼ� 
		//������ �ƿ� ������ �������� �Ʒ�ó�� ����ϵ���
		//�ƴϸ� �����Ҳ��� ��ó�� �ʱⰪ �ְ� ����ϵ��� !!
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ȸ�������� �����մϴ�");
		
		System.out.println("���̵�(4�ڸ� ��)�� �Է��Ͻÿ�");
		int dbId = scan.nextInt();
		System.out.println("��й�ȣ(4�ڸ� ��)�� �Է��Ͻÿ�");
		int dbPw = scan.nextInt();
		
		System.out.println("�α����� �����մϴ�");
		
		System.out.println("���̵�(4�ڸ� ��)�� �Է��Ͻÿ�");
		int liId = scan.nextInt();
		System.out.println("��й�ȣ(4�ڸ� ��)�� �Է��Ͻÿ�");
		int liPw = scan.nextInt();
		
		if(dbId == liId && dbPw == liPw) {
			System.out.println("�α��� ����");
		}
		else
			System.out.println("�α��� ����");
	}

}
