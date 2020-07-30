package step3;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
 */
public class Ex04_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		// ���� 1~9�� front �迭�� �����ϰ�, ���� 10~18�� back �迭�� �����Ѵ�.
		for(int i = 0; i < SIZE; i++) {
			front[i] = i + 1;
			back[i] = SIZE + (i+1);
		}
		
		// front[] & back[] ����
		// �迭���Ұ��� ������ ��������� �迭index�� �������� �޾Ƽ� ��Ŷ��Ŷ
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(SIZE);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			r = ran.nextInt(SIZE);
			temp = back[0];
			back[0] = back[r];
			back[r] = temp;	
		}
		
		int num = 1;
		while(true) {
			
			int answer = 0;
			for(int i = 0; i<SIZE; i++) {
				if(front[i] == num) {
					answer = i;
					// �÷��̾����� �Է¹ޱ� ���� num�� ���� index ���� answer�� ����
					}
			}
			System.out.println(num + "[" + answer + "]");
			// ǥ�õ� ����[�ε�����] �� ������ֳ�... �� �ϴ°�
			
			for(int i = 0; i<SIZE; i++) {
				if(front[i] == 0) {
					// back[] �迭�� ���ڵ� �� ������ ���� ���
					// �� �� �ڸ��� ���ڰ� 2�� ��µǴ°� �������� ���� ���
					System.out.print("\t");
				}else {
					System.out.print(front[i] + "\t");
				}
				
				if(i % 3 == 2) {
					//System.out.println(); ���� ���
					System.out.println("\n"); // ���� ���
				}
			}
			System.out.print("[" + num + "]�� �ε��� �Է� : ");
			int idx = scan.nextInt();
			
			// 1~9 ���� ��ġ�Ҽ��� OR 10~19 ���� ��ġ�Ҽ��� -> case ����
			if(front[idx] == num) { 
				if(1 <= num && num <= SIZE) {
					// 1~9���� ��ġ�ؼ� �� �ڸ��� �޳���� �־���
					front[idx] = back[idx];
				}else {
					// 10~19���� ��ġ�ؼ� ���̻� �־��ٰ� X -> 0�� �־���
					front[idx] = 0;
				}
				
				num += 1; // front[idx] == num ���������� ������ num����
			}
			
			if(num == 19) {
				break;
			}			
			
		}

	}

}
