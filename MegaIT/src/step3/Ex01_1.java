package step3;
//1�� 43�� - 54��
/*
 * # �ִ밪 ���ϱ�[3�ܰ�]
 * 1. ���� ū ���� ã�� �Է��Ѵ�.
 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
 * ��)
 * 11, 87, 42, 100, 24
 * �Է� : 100
 * 
 * 11, 87, 42, 0, 24
 * �Է� : 87
 * 
 * 11, 0, 42, 0, 24
 */

import java.util.Scanner;

public class Ex01_1 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			
			for(int i = 0; i < 5 ; i++) {
			System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.print("�Է� : ");
			int num = scan.nextInt();
			System.out.println();
			
			
			int MaxNum = 0;
			int MaxIdx = 0;
			
			for(int i = 0; i < 5 ; i++) {
				if(MaxNum < arr[i]) {
					MaxNum = arr[i];
					MaxIdx = i;
				}
			}
				if(num == MaxNum) {
					arr[MaxIdx] = 0;
					cnt++;
				}
				if(cnt == 5) {
					System.out.println("��� ���Ұ� 0�̹Ƿ� ����");
					run = false;
				}
				
			

		}
		
	}
		
}


