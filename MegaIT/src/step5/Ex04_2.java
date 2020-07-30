package step5;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + ����
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */

class Ex09{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// ������ ���� Ƚ��
}

public class Ex04_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex09 e = new Ex09();
		int size = e.front.length;
		
		// ����
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		while(true) {
		/*for(int i = 0; i < size; i++) {
			System.out.print(e.front[i] + " ");
		}*/
			for(int i=0; i<size; i++) {
				if(e.front[i] == 1) {
					System.out.print("��\t");
				}else if(e.front[i] == 2) {
					System.out.print("��\t");
				}else if(e.front[i] == 3) {
					System.out.print("��\t");
				}else if(e.front[i] == 4) {
					System.out.print("��\t");
				}else if(e.front[i] == 5) {
					System.out.print("��\t");
				}
			}
			System.out.println();
			
			for(int i=0; i<size; i++) {
				if(e.back[i] == 1) {
					System.out.print("��\t");
				}else if(e.back[i] == 2) {
					System.out.print("��\t");
				}else if(e.back[i] == 3) {
					System.out.print("��\t");
				}else if(e.back[i] == 4) {
					System.out.print("��\t");
				}else if(e.back[i] == 5) {
					System.out.print("��\t");
				}else {
					System.out.print("��\t");
				}
			}
			System.out.println();

			if(e.cnt == 5) {
				break;
			}
			
			System.out.print("�ε���1 �Է� : ");
			int idx1 = scan.nextInt();
			System.out.print("�ε���2 �Է� : ");
			int idx2 = scan.nextInt();
			
			if(e.front[idx1] == e.front[idx2]) {
				e.back[idx1] = e.front[idx1];
				e.back[idx2] = e.front[idx2];
				e.cnt++;
			}
		}
	}
}