package step2;
/*
 * # �л��������� ���α׷�[1�ܰ�] : �л�����
 */

import java.util.Random;

public class Ex02_1Q {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		int sum = 0;
		int cnt = 0;
		
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		
		for(int i = 0; i < 5; i++ ) {
			arr[i] = ran.nextInt(100) + 1;
			
			if(arr[i] >= 60)
				cnt ++;
			
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		
		System.out.println("������ " + sum);
		
		double avg = sum / 10.0;
		System.out.println("����� " + avg);

		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		System.out.println("�հݻ� ���� " + cnt + "��");
	}

}
