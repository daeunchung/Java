// 2020-02-20 12:29-13:15 �ᱹ���ؼ� ��������
package step2;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1�ܰ�] : 1 to 4
 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
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
public class Ex07_1M {

	public static void main(String[] args) {
		int[] arr = new int[4];
		int[] check = new int[4];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while(i < 4) {
			
			int idx = ran.nextInt(4); //0 1 2 3 
			
			if(check[idx] == 0) {
				check[idx] = 1;
				arr[i] = idx + 1;
				i++;
			}

		}
		
		int cnt = 0;
//		boolean run = true;
//		while(run) {
			

			
		while(true) {
			
			for(int j = 0; j < 4; j ++) {
				System.out.print(arr[j] + " ");
			}System.out.println();
			
			if(cnt == 4) {
				System.out.println("���� ����");
				break;
				//run = false;
			}
			 
			System.out.print("�Է� : ");
			int num = scan.nextInt();
			
			if(arr[num] == cnt + 1) {
				arr[num] = 9 ;
				cnt++;
				//k++;
			
			}
//			if(arr[num] != cnt + 1) {
//				break;
//			}
		}
//		}
	}
}

/*
 * break; �ٷ� �ߴ� while�� ������ ���͹���
 * continue; �ٷ� �ߴ� continue �Ʒ��� �ִ°͵� ���� X , while�� ������ �����ϴ� �κ����� �ٽð��� -> while������ �����°� �ƴ�
 * 
 */

