package step3;

import java.util.Scanner;

/*
 * # �Ҽ� ã��[3�ܰ�]
 * 1. ���ڸ� �� �� �Է¹޴´�.
 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
 * 
 * ��) Enter Number ? 1000
 *    1000���� ū ù���� �Ҽ��� 1009
 * ��) Enter Number ? 500
 *    500���� ū ù��° �Ҽ��� 503
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		int temp = number + 1;

//		int arr[] = new int[1000];
//		
//		for(int i = 0; i<1000; i++) {
//			arr[i] = temp;
//			temp += 1;
//		}
		
		while(true) {
			int cnt = 0;
			int check = -1;
			
			for(int i = 1; i<=temp; i++) {
				if(temp % i == 0) {
					cnt++;
				}			
			}
			//  for�� �� ���� cnt �� 2�̸� �Ҽ��̴ϱ� ��� 
			if(cnt == 2) {
				check = temp;
				break;
			}
			temp += 1;
		}
		
		System.out.printf("%d���� ū ù��° �Ҽ��� %d", number, temp);
		
	}
}
