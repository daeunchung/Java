package step4;

import java.util.Scanner;

/*
 * # �����ձ� ����
 * ���þ� : ������
 * �Է� : �Ź�
 * ���þ� : �Ź�
 * �Է� : �̼�
 * ...
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "������";
		
		while(true) {
			int size = start.length(); // start���ڿ��� �������� �Է¹��� �ܾ��� ù������ ��ġ�ϴ��� Ȯ���ϱ� ����  ���ڿ����� ����
			System.out.println("���þ� : " + start);
			
			System.out.print("�Է� : ");
			String myWord = scan.next();
			
			if(start.charAt(size - 1) == myWord.charAt(0)) {
				start = myWord;
			}
			
		}
	}
}
