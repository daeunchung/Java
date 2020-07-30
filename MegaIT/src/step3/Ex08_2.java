package step3;

import java.util.Scanner;

//# 2�����迭 �⺻����[2�ܰ�]
public class Ex08_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.print("�ε���1 �Է� : ");
		int idxOne = scan.nextInt();
		System.out.print("�ε���2 �Է� : ");
		int idxSec = scan.nextInt();
		
		System.out.println(arr[idxOne][idxSec]);
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println("�� �Է� : ");
		int data = scan.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(data == arr[i][j]) {
					System.out.print("�ε���1 ��� : " + i + "    �ε���2 ��� : " + j);
				}
			}
		}System.out.println();
		
		
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max = 0; int idx1 = 0; int idx2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] > max)
					max = arr[i][j];
					idx1 = i;
					idx2 = j;
			}
		}System.out.println("���� ū ���� �ε��� 2�� : " + idx1 + ", " + idx2);

		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.println("��1 �Է� : ");
		int num1 = scan.nextInt();
		System.out.println("��2 �Է� : ");
		int num2 = scan.nextInt();
		
		int idx1_i = 0; int idx2_i = 0;
		int idx1_j = 0; int idx2_j = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(num1 == arr[i][j]) {
					idx1_i = i;
					idx1_j = j;
				}
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(num2 == arr[i][j]) {
					idx2_i = i;
					idx2_j = j;
				}
			}
		}
		
		int temp = arr[idx1_i][idx1_j];
		arr[idx1_i][idx1_j] = arr[idx2_i][idx2_j];
		arr[idx2_i][idx2_j] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		
		}
	}
}


