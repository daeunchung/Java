package step1;

import java.util.Scanner;

/*
 * # �ִ밪 ���ϱ�[2�ܰ�]
 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
 */
public class Ex19_1Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int cnt = 1;
		
		while(cnt <= 3) {
			System.out.print("������ �Է��Ͻÿ�   ");
			int num = scan.nextInt();
			
			if(cnt == 1) 
				max = num;
			// ����� �ڵ�� ���� ���� ���� �κ� ����.. ������ ����� �޴´ٰ� �����ϰ� ¥�Űǰ�..
			//  maxNum �� 0���� �����س����̴���..
			else {
				if(num >= max) {
					max = num;
				}
			}
			cnt ++;
		}
		System.out.println("�� ���� �� ���� ū ���� " + max);
	}

}
