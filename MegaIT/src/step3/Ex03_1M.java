package step3;
/*1623-1633
 * # �ߺ����� ����[2�ܰ�]
 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
 */

import java.util.Random;

public class Ex03_1M {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		
		int i = 0;
		while(i<5) {
			int num = ran.nextInt(10) + 1;
			
			int check = 1; // �ߺ��Ǵ��� üũ�ϴ� ����
			// �ߺ� X -> 1, �ߺ� O -> -1
			int j = 0;
			
			while(j<i) { // j�� ������� ����� �迭�� ���鼭 �� üŷ�ϴ� index
				if(num == arr[j]) { //�̹� �տ� ������
					check = -1; // check�� -1�� �ٲ㼭 
				}j++; // ���ο� �������� �޵��� j�� ���� !
			}
			
			if(check == 1) { //check�� -1�� �ȹٲ��� �ߺ��Ǵ°� ���ٴ� �� 
				arr[i] = num; // �ߺ����� �� num�� �迭�� ���� ������
				i++;
			}
		}
		
		for(int j = 0; j<5; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
