package step1;
/*
 * # �α���[3�ܰ�]
 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
 */

import java.util.Scanner;

public class Ex08_3Q {

	/*public static void main(String[] args) {
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Id�� �Է��Ͻÿ�");
		
		int myId = scan.nextInt();
		if(myId == dbId) {System.out.println("Pw�� �Է��Ͻÿ�");}
		if(myId != dbId) {System.out.println("Id�� Ȯ�����ּ���");}
		
		int myPw = scan.nextInt();
		if(myPw == dbPw) {System.out.println("�α��� ����");}
		if(myPw != dbPw) {System.out.println("Pw�� Ȯ�����ּ���");}

	}
}*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID �Է� : ");
		int myId = scan.nextInt();
		
		if(dbId == myId) {
			System.out.print("Pw �Է� : ");
			int myPw = scan.nextInt();
			
			if(dbPw == myPw) {
				System.out.println("�α��� ����!");
			}
			if(dbPw != myPw) {
				System.out.println("Pw�� Ȯ�����ּ���.");
			}
		}
		if(dbId != myId) {
			System.out.println("Id�� Ȯ�����ּ���.");
		}
	}
}// if ���� ���߱����� �Ǿ��ִ°� �� ���� �ڵ��ΰ�

