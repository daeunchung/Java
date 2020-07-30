
package step2;
/*
 * # ���� ����
 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
 * 2. ������ ���߸� back�� �ش� ���ڸ� ������,
 *    back�� ��� ���� ä������ ������ ����ȴ�.
 * ��)
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * �Է�1 : 0
 * �Է�2 : 1
 * 
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
 */

import java.util.Random;
import java.util.Scanner;

public class Ex06_2Q {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// ����(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		
		while(true) {
			
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();
		
		for(int j=0; j<10; j++) {
			System.out.print(back[j] + " ");
		}System.out.println();
		
		System.out.print("�Է�1 : ");
		int i1 = scan.nextInt();
		System.out.print("�Է�2 : ");		
		int i2 = scan.nextInt();

		if(front[i1] == front[i2]) {
			
			back[i1] = front[i1];
			back[i2] = front[i2];
		}
	}
}

}
