package step3;

import java.util.Random;
import java.util.Scanner;

/* 0150-0228
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
 */
public class Ex04_1M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		for(int i = 0; i<SIZE; i++) {
			front[i] = i+1;
			back[i] = SIZE + i+1;
		}
		for(int i = 0; i<1000; i++) {
			int r = ran.nextInt(9);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			r = ran.nextInt(9);
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
				}
			}
			System.out.println(num + "[" + answer + "]");
			
			for(int i = 0; i<SIZE; i++) {
				if(front[i] == 0) {
					System.out.print("\t");
				}else
					System.out.print(front[i] + "\t");
				
				if(i % 3 == 2) {
					System.out.println("\n");
				}
			
			}
			
			System.out.println("[" + num + "]�� �ε��� �Է� : ");
			int idx = scan.nextInt();
			if(front[idx] == num) {
				if(1 <= num && num <= SIZE) {
					front[idx] = back[idx];
					
				}else
					front[idx] = 0;
				
			num++;	
			}
			
			if(num == 19) {
				break;
			}
		}
		

	}

}
