package step3;

import java.util.Scanner;

/*
 * # 2�����迭[����]
 * . �̸��� ��ȣ�� �Է¹޾� �����ϱ�
 * ��)
 * �Է� : ö��	1
 * ���� : ���
 * 
 * �Է� : ö�� 2
 * ���� : �ٳ���
 */
public class Ex13_1M {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] jang = {
			{"ö��", "�Ұ��"},
			{"ö��", "���"},
			{"����", "��ġ"},
			{"ö��", "�ٳ���"},
			{"ö��", "�����"},
			{"����", "��¡��"},
			{"����", "����"}};
		
		for(int i = 0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		System.out.print("[����]�̸� �Է� : ");
		String name = scan.next();
		System.out.print("[����]��ȣ �Է� : ");
		int idx = scan.nextInt();
		
		int delIdx = -1; int count = 0;
		for(int i = 0; i<jang.length; i++) {
			if(name.equals(jang[i][0])) {
				if(idx == count) {
					delIdx = i;
				}
				count++;
			}
		}
		
		String[][] temp = jang;
		jang = new String [temp.length-1][2];
		
		int j = 0;
		for(int i = 0; i<temp.length; i++) {
			if(delIdx != i) {
				jang[j] = temp[i];
				j++;
			}
		}
		
		for(int i = 0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}
}
