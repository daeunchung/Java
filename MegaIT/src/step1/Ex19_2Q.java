package step1;

import java.util.Random;
import java.util.Scanner;

/*
 * # �����л�
 * 1. 10ȸ �ݺ��� �Ѵ�.
 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
 * ---------------------------------------
 * . ������(10��)�� ������ ����� ����Ѵ�.
 * . �հ��� ���� ����Ѵ�.
 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
 */
public class Ex19_2Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int i = 0;
		int total = 0;
		int pass = 0;
		int max = 0;
		int best = 0;
		
		while(i < 10) {
		int score = ran.nextInt(101) + 1;
		total += score ;
		
			if(score >= 60) {
				pass ++;
			}
			
			if(score > max) {
				max = score;
				best = i + 1;
			}
		
		i++;
		}
		System.out.println("������(10��)�� ���� : " + total + "��");
		System.out.println("������(10��)�� ��� : " + total / 10.00 + "��");
		System.out.println("�հ��� �� : " + pass + "��");
		System.out.println("1�� �л��� ��ȣ�� ���� : " + best + "�� �л�(" + max+ "��)");
	}
}
