package step2;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1�ܰ�] : 1 to 4
 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
 *  // Ex04_2 �ߺ����� ���� 1�ܰ� ���� ��ﳪ�� -> �ڵ带 �� �ܿ����ϴ��� �˰���?
 * 
 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
 * ��)
 * 4 2 3 1
 * �Է� : 3
 * 4 2 3 9
 * �Է� : 1
 * 4 9 3 9
 * ...
 */

public class Ex07_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] check = new int[4]; // int[] check = {0, 0, 0, 0};
		int[] arr = new int[4]; // int[] arr = {0, 0, 0, 0};
		
		for(int i = 0; i<4; i++) {
			int idx = ran.nextInt(4);
			if(check[idx] == 0) {
				check[idx] = 1;
				arr[i] = idx + 1;
				}else
					i--;
		}
		
		boolean run = true;
		int cnt = 0;
		
		while(run) {
			
		for(int j = 0; j < 4; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		System.out.print("�Է� : ");
		int num = scan.nextInt();
		cnt++;
		if(arr[num] == cnt) {
			arr[num] = 9;
		}else
			cnt--;
		
		if(arr[0]==9 && arr[1]==9 && arr[2]==9 && arr[3]==9) {
			run = false;
			System.out.println("���� ����");
		}
		}
		
		//�ߺ����� �����Է¹ޱ� SO IMPORTANT ������ �ܿ� //
		/*int i =0;
		while(i < 4) {
			int idx = ran.nextInt();
			if(check[idx] == 0) {
				check[idx] = 1;
				arr[i] = idx + 1;
				i++;
			}
		}*/
	}
}
