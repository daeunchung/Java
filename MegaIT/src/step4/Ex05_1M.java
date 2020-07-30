package step4;

import java.util.Random;
import java.util.Scanner;

/*
 * # Ÿ�ڿ��� ����[1�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * ��)
 * ���� : mysql
 * �Է� : mydb
 * ���� : mysql
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : jsp
 */
public class Ex05_1M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i = 0; i<1000; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[r];
			words[r] = words[0];
			words[0] = temp;
		}
		
		int i = 0;
		while(i < words.length) {		
			System.out.println("���� : " + words[i]);
			
			System.out.print("�Է� : ");
			String myWord = scan.next();
			
				if(myWord.equals(words[i])) {
					i += 1;
				}
		}
	}

}
