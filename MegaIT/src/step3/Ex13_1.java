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
public class Ex13_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] jang = {
				{"ö��", "�Ұ��"},
				{"ö��", "���"},
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
			};
		
		for(int i = 0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
		System.out.print("[����]�̸� �Է� : ");
		String name = scan.next();
		System.out.print("[����]��ȣ �Է� : ");
		int idx = scan.nextInt();
		
		int delIdx = -1;
		
		int count = 0;
		for(int i = 0; i<jang.length; i++) {
			if(name.equals(jang[i][0])) {
				if(count == idx) {
					delIdx = i;
				}count += 1;
			}
		}
		
		System.out.println(delIdx);
		
		String[][] temp = jang; // jang[7][2] �迭�� temp�� �Űܳ�
		// temp : 7 x 2
		jang = new String[temp.length - 1][2];
		// jang �迭�� [7-1][2] : 6 x 2 
		
		int j = 0;
		for(int i = 0; i<temp.length; i++) {
			if(i != delIdx) {
				jang[j] = temp[i];
				j++;
			}
		}
		/*for(int j = 0; j<jang.length; j++) {
			for(int i = 0; i<temp.length; i++) {
				if(i == delIdx) {
					j--;
					continue;
				}
				jang[j] = temp[i];
			}
		}*/// for�� �ΰ��� ǥ�� �غ��� �;��µ�  �����߻�
		   // java.lang.ArrayIndexOutOfBoundsException: -1
		
		
		for(int i = 0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
	}

}

