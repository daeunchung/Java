package step3;

import java.util.Random;

/*
 * # �ߺ����� ����[2�ܰ�]
 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
 */
public class Ex03_1 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];
		
		int i = 0;
		while(i < 5) {
			int num = ran.nextInt(10) + 1;
			
			int check = 1;
			int j = 0;
			while(j < i) {
				if(num == arr[j]) {
					check = -1;
				}
				j += 1;
			}
			
			if(check == 1) {
				arr[i] = num;
				i += 1;
			}
			
		}
		
		for(int j=0; j<5; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

}
