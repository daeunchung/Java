package step1;

import java.util.Scanner;

/*
 * # �α���[1�ܰ�]
 * 1. Id�� Pw�� �Է¹޴´�.
 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */

public class Ex07_1Q {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ID(4�ڸ���)�� �Է��Ͻÿ�");
		int meId = scan.nextInt();
		System.out.println("PW(4�ڸ���)�� �Է��Ͻÿ�");
		int mePW = scan.nextInt();
		
		int dbId = 1234;
		int dbPw = 1111;

		if(meId == dbId && mePW == dbPw) {
			System.out.println("�α��� ����");
			}
			else
			System.out.println("�α��� ����");
		}
		
	}
